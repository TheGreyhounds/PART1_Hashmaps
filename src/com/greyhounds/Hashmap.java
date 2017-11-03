package com.greyhounds;

import java.util.ArrayList;

public class Hashmap {
        private ArrayList<ArrayList<KeyValuePair>> hashmapArray;
        private int num_buckets = 256;
        
        public Hashmap() {
                hashmapArray = getHashmap();
        }
        
        private ArrayList<ArrayList<KeyValuePair>> getHashmap() {
                hashmapArray = new ArrayList<ArrayList<KeyValuePair>>();
                
                for (int i = 0; i < num_buckets; i++) {
                        ArrayList<KeyValuePair> bucket = new ArrayList<KeyValuePair>();
                        hashmapArray.add(bucket);
                }
                return hashmapArray;
        }
        
        public void set(Object key, Object value) {
                KeyValuePair newEntry = new KeyValuePair(key, value);
                
                int bucketID = hashKey(key);
                ArrayList<KeyValuePair> bucket = hashmapArray.get(bucketID);
                
                int indexOfEntryInBucket = getIndexFor(bucket, key);
                
                if (indexOfEntryInBucket == -1) {
                        // The value does not exist in our hashmap,
                        // so we simply add the key value pair to the bucket
                        bucket.add(newEntry);
                } else {
                        // There is already a key value pair,
                        // so we overwrite the old key value pair.
                        bucket.set(indexOfEntryInBucket, newEntry);
                }
        }
        
        public Object get(Object key) {         
                int bucketID = hashKey(key);
                ArrayList<KeyValuePair> bucket = getBucket(key);
                
                for (int index = 0; index < bucket.size(); index++) {
                        KeyValuePair currentKeyValuePair = bucket.get(index);
                        if (currentKeyValuePair.getKey().equals(key)) {
                                return currentKeyValuePair.getValue();
                        }
                }
                
                return null;
        }
        
        private int getIndexFor(ArrayList<KeyValuePair> bucket, Object key) {
                for (int index = 0; index < bucket.size(); index++) {
                        KeyValuePair currentBucketEntry = bucket.get(index);
                        if (currentBucketEntry.getKey().equals(key)) {
                                return index;
                        }
                }
                return -1;
        }
        
        private ArrayList<KeyValuePair> getBucket(Object key) {
                int bucketID = hashKey(key);
                return hashmapArray.get(bucketID);
        }
        
        private int hashKey(Object key) {
                return Math.abs(key.hashCode() % num_buckets);
        }
}
