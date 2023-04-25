package com.example.services;

import com.example.beans.mongo.MongoRepairOrder;
import com.example.beans.redis.RedisRepairOrder;
import com.example.repositories.RoRepositoryMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import static com.example.utility.GzipUtil.compressJson;
import static com.example.utility.GzipUtil.decompressJson;

@Service
public class RoService {

    @Autowired
    private RoRepositoryMongo roRepo;
    @Autowired
    RedisTemplate<String, byte[]> redisTemplate;

    public void addRo(MongoRepairOrder repairOrder) {
        roRepo.save(repairOrder);
    }

    public MongoRepairOrder getRo(String id) throws Exception{
                byte[] redisRepairOrder = redisTemplate.opsForValue().get(id);
                if (redisRepairOrder == null) {

                    System.out.println("mongo call");
                    MongoRepairOrder mongoRepairOrder = roRepo.findById(id).get();
                    System.out.println(compressJson(mongoRepairOrder));
                    redisTemplate.opsForValue().set(id, compressJson(mongoRepairOrder));
                    return mongoRepairOrder;
                }
                return decompressJson(redisRepairOrder);
            }
//        return roRepo.findById(id).get();

}
