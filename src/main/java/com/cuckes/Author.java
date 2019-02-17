package com.cuckes;


public class Author implements Comparable<Author> {
    String firstName;
    String bookName;
    int auAge;

    Author(String first, String book, int age) {
        this.firstName = first;
        this.bookName = book;
        this.auAge = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getAuAge() {
        return auAge;
    }

    public void setAuAge(int auAge) {
        this.auAge = auAge;
    }

    /*
     * When we only use Comparable, this is where we write sorting
     * logic. This method is called when we implement the Comparable
     * interface in our class and call Collections.sort()
     */
    public int compareTo(Author au) {
        return this.auAge > au.auAge? 1 :  this.auAge < au.auAge ? -1 : 0;
    }
}

