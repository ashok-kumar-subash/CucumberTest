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

        LinkedList<String> linkedObj = new LinkedList<String>(obj);
        System.out.println("Linked List");
        System.out.println(linkedObj);
        String[] arrayobj = linkedObj.toArray(new String[linkedObj.size()]);
        System.out.println("Array ");
        for (String a:arrayobj){
            System.out.println(a);
        }



    }



}
