package com.zp.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String args[]){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("key1","aaa");
        map.put("key2","bbb");
        map.put("key3",600.0);
        map.put("key4","ddd");

        int str = Integer.valueOf(map.remove("key3").toString());
        System.out.println("str = "+str);
    }
}
