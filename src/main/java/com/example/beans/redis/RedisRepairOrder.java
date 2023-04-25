package com.example.beans.redis;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */


import com.example.beans.mongo.MongoRepairOrder;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.util.ArrayList;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("RepairOrder")
public class RedisRepairOrder implements Serializable {
    private String id;
    private String repairOrder;
    public RedisRepairOrder(MongoRepairOrder mongoRepairOrder){
        this.id=mongoRepairOrder.getId();
        this.repairOrder=mongoRepairOrder.getRepairOrder();
    }
}