package com.cgs.cn;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class NotSafe {

    public static void main(String[] args) {

//        List<String> list = new ArrayList();
//        List<String> list = new Vector<>();
//        List<String> list = Collections.synchronizedList(new ArrayList());
        List<String> list = new CopyOnWriteArrayList<>();
        /*list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.forEach(System.out::println);*/

        for (int i = 0; i < 30 ; i++) {

            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(list);
            },String.valueOf(i)).start();
        }
    }
}
