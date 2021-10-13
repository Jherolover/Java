package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(Season.SPRING.getCode());
        System.out.println(Season.WINTER.getCode());

        ///ConcurrentHashMap
        HashMap<String,String> hashMap  = new HashMap<>();
        System.out.println(hashMap.size());

        ThreadLocal<String> threadLocal  = new ThreadLocal<>();
        threadLocal.set("user");

    }
}
