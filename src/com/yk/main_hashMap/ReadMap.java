package com.yk.main_hashMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadMap {

    public Map<String, Double> readMap() {
        String userPath = System.getProperty("user.dir");
        String path = userPath + "/src/com/yk/main_hashMap/test.txt";
        Map<String, Double> map = new HashMap<>();

        try (BufferedReader bw = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bw.readLine()) != null) {
                String[] parts = line.split(" : ");
                if (parts.length == 2) {
                    String key = parts[0];
                    double value = Double.parseDouble(parts[1]);
                    map.put(key, value);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Error reading file", e);
        }

        map.forEach((k, v) -> System.out.println(k + " : " + v));
        return map;
    }
}
