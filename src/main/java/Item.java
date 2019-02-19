package main.java;

public final class Item {
        public int key;

        //constructor
        public Item(int keyValue) { 
                key = keyValue;
        }

        /**
         Method: getKey
         Inputs: None
         Returns: key

         Description: Return value of key
         */
        public int getKey() {
            return key;
        }

        /**
         Method: setKey
         Inputs: key
         Returns: None

         Description: Sets a new value of key
         */
        public void setKey(int key) {
            this.key = key;
        }
}