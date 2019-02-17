package com.cuckes;

import java.util.ArrayList;
import java.util.Collections;

public class CompareableAuthorTest {
    public static void main(String args[]){
        // List of objects of Author class
        ArrayList<Author> al=new ArrayList<Author>();
        al.add(new Author("Henry","Miller", 45));
        al.add(new Author("Nalo","Hopkinson", 30));
        al.add(new Author("Frank","Miller", 56));
        al.add(new Author("Deborah","Hopkinson", 17));
        al.add(new Author("George R. R.","Martin", 68));

        /*
         * Sorting the list using Collections.sort() method, we
         * can use this method because we have implemented the
         * Comparable interface in our user defined class Author
         */
        Collections.sort(al);
        for(Author str:al){
            System.out.println(str.firstName+"Book: "+str.bookName+" Age: "+str.auAge);
        }
    }
}
