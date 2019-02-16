package com.cuckes;

import java.util.*;

public class ArrayListTest {

    public static void main(String args[]){

        ArrayList<String> obj = new ArrayList<String>(
                Arrays.asList("ashok", "karthi", "siddhu", "akshu")
        );

        System.out.println(obj);

        for (String name:obj){
            System.out.println(name);
        }

        Iterator iter = obj.iterator();
        while (iter.hasNext()){
            System.out.println("iter-"+iter.next());
        }

        Collections.sort(obj);
        System.out.println(obj);
        Collections.reverse(obj);
        System.out.println(obj);
    }



}
