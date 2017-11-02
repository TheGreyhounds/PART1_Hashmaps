package com.greyhounds;

public class KeyValuePair {
        private final Object key;
        private final Object value;
        
        public KeyValuePair(Object key, Object value) {
                this.key = key;
                this.value = value;
        }
        
        public Object getKey() {
                return key;
        }
        
        public Object getValue() {
                return value;
        }
        
        @Override
        public String toString() {
                return "key: \"" + key.toString() + "\" value: \"" + value.toString() + "\"";
        }
}
