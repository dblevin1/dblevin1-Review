package main.java;

/*
        File: Item.java
        Author:	@author amehlhas, adalvi1
        Date: 2/18/2019

        Description: Class to hold a key value
*/

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