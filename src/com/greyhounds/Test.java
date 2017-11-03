package com.greyhounds;

import java.util.ArrayList;

public class Test {
        public static void main(String[] args) {
                Hashmap myHashmap = new Hashmap();
                
                String key = "this is our key.";
                Integer key2 = new Integer(420);
                
                // The keys we use in the hashmap don't just have
                // to be Strings and Integers, however. They can be
                // literally any kind of Object. They just can't be
                // primitive types, like int and boolean since those
                // are not Objects in Java
                
                myHashmap.set(key, "here is a value");
                myHashmap.set(key2, new Boolean(false));
                
                System.out.println("Value for \"" + key + "\": \"" + myHashmap.get(key) + "\"");
                System.out.println("Value for \"" + key2 + "\": \"" + myHashmap.get(key2) + "\"");
                
                myHashmap.set(key2, "this value used to be a boolean, but now it's this string");
                System.out.println("Value for \"" + key2 + "\" after resetting: \"" + myHashmap.get(key2) + "\"");
                
                System.out.print("Our hashmap returns \"" + myHashmap.get("key doesn't exist"));
                System.out.println("\" when we try to get a value with a key that hasn't been set in the hashmap.");
        }
}

