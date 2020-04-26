package com.bereket;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList libraryUsers = new ArrayList();
        libraryUsers.add("user1");
        libraryUsers.add("user2");
        libraryUsers.add("user3");
        libraryUsers.add("user4");
        libraryUsers.add("user5");
        libraryUsers.add("user6");
        System.out.println(libraryUsers);

        libraryUsers.remove("user2");
        System.out.println(libraryUsers);

        libraryUsers.contains("apple");
        System.out.println(libraryUsers.contains("apple"));

    }
}
