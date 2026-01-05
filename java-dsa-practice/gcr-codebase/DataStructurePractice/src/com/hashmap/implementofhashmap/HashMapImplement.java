package com.hashmap.implementofhashmap;

import java.util.LinkedList;

public class HashMapImplement {
	static class MyHashMap<K,V>{
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;


        private class Node{
            K key;
            V value;
            Node(K key ,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;
        private LinkedList<Node>[] buckets;

        private void initBuckets(int N ){//N- capacity / size of array
            buckets = new LinkedList[N];
            for (int i=0 ; i<buckets.length ;i++){
                buckets[i]= new LinkedList<>();
            }
        }
        private int HashFunc(K key){
            int hc = key.hashCode();
            return Math.abs(hc)% buckets.length;
        }
        //

        private MyHashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }
        // Traverse the LL and Looks for a node with kry if found it return it index otherwise it returns null
        public int capacity(){
            return buckets.length;
        }
        public float load(){
            return (n*1.0f)/buckets.length;
        }
        private int searchInBuckets(LinkedList<Node> ll,K key){
            for (int i=0 ; i<ll.size(); i++){
                if (ll.get(i).key==key){
                  return i;
                }
            }
            return -1;
        }
        public int size(){// return the number of entries in map
            return n;
        }
        private void rehash(){
            LinkedList<Node>[] oldBuckets = buckets;
            initBuckets(oldBuckets.length*2);
            int n=0;
            for (var bucket: oldBuckets){
                for (var node : bucket){
                    put(node.key,node.value);
                }
            }
        }

        public void put(K key , V value){// Insert ,Update
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBuckets(currBucket,key);
            if (ei==-1){// key doesn't exist , we have to insert a new node
                Node node = new Node(key,value);
                currBucket.add(node);
                n++;
            } else {// update case
                Node currNode = currBucket.get(ei);
                currNode.value=value;
            }
            if (n>= buckets.length*DEFAULT_LOAD_FACTOR){
                rehash();
            }
        }

        public V get(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBuckets = buckets[bi];
            int ei = searchInBuckets(currBuckets,key);
            if (ei!=-1){//key exits
                Node currNode = currBuckets.get(ei);
                return currNode.value;
            } else { // key doesn't exist
                return null;
            }
        }

        public V remove(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBuckets = buckets[bi];
            int ei = searchInBuckets(currBuckets,key);
            if (ei!=-1){//key exits
                Node currNode = currBuckets.get(ei);
                V val = currNode.value;
                currBuckets.remove(ei);
                n--;
                return val;
            }
            return null;
        }


    }
    public static void main(String[] args) {
        MyHashMap<String,Integer> mp = new MyHashMap<>();
        System.out.println("Testing Put ");
        mp.put("a",17);
        mp.put("p",1);
        System.out.println("CAPACITY : "+mp.capacity());
        System.out.println("Load : "+mp.load());

        mp.put("s",7);
        mp.put("k",16);
        mp.put("k",11);
        System.out.println("CAPACITY : "+mp.capacity());
        System.out.println("Load : "+mp.load());
        System.out.println("Testing size " +mp.size());//4
        mp.put("a",176);
        System.out.println("Testing size " +mp.size());//4
        // Testing get
        System.out.println(mp.get("a"));//176
        System.out.println(mp.get("p"));//1
        System.out.println(mp.get("s"));//7
        System.out.println(mp.get("k"));//16

        System.out.println(mp.get("Clg"));//null
        System.out.println(mp.remove("s"));
        System.out.println(mp.remove("s"));//null
        System.out.println("Testing size " +mp.size());//3

    }
}