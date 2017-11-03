package com.greyhounds;

import java.util.ArrayList;

public class Hashmap {
        private ArrayList<ArrayList<KeyValuePair>> hashmapArray;
        private final int num_buckets = 256;
        
        public Hashmap() {
                hashmap = getHashmap();
        }
        
        public ArrayList<ArrayList<KeyValuePair>> getHashmap() {
			ArrayList<ArrayList<KeyValuePair>> hashmap = new ArrayList<ArrayList<KeyValuePair>>();
			
			for (int buckets = 0; buckets < num_buckets; buckets++){
				ArrayList<KeyValuePair> bucket = new ArrayList<KeyValuePair>();
				hashmapArray.add(bucket);
			}
			
			return hashmap;
        }
        
        public void set(Object key, Object value) {
			
        
        }
        
        public Object get(Object key) { 
		    public int hashedKey;
			//get the integer for the index you want to find
			hashedKey = hashKey(key);
			//find the index
			return hashmapArray.get(hashedKey);
        }
        
        private int getIndexFor(ArrayList<KeyValuePair> bucket, Object key) {
        
        }
        
        private int hashKey(Object key) {
			
        return key.hashCode()% num_buckets;
		
        }
}
