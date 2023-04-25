package com.example.utility;

import com.example.beans.mongo.MongoRepairOrder;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GzipUtil {
    public static byte[] compressJson(MongoRepairOrder mongoRepairOrder) throws IOException {
        String repairOrderJSON = new ObjectMapper().writeValueAsString(mongoRepairOrder);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        GZIPOutputStream gzipOut = new GZIPOutputStream(out);
        gzipOut.write(repairOrderJSON.getBytes());
        gzipOut.finish();
        return out.toByteArray();
    }
    public static MongoRepairOrder decompressJson(byte[] compressedJson) throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(compressedJson);
        GZIPInputStream gzipIn = new GZIPInputStream(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len;
        while ((len = gzipIn.read(buffer)) > 0) {
            out.write(buffer, 0, len);
        }
        return new ObjectMapper().readValue(out.toByteArray(), MongoRepairOrder.class);
    }
}
