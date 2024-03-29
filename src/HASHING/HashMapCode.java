package HASHING;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class HashMapCode {
    static class HashMap<K,V>{//generic(will wor for any type)
        private class Node{
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;//n
        private int N;
        private LinkedList<Node> buckets[];//N

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hCode=key.hashCode();//will return a value
            return Math.abs(hCode) % N;//abs value because if negative num convert it into positive
        }
        private int SearchInLL(K key,int bucketIndex) {
            LinkedList<Node> ll=buckets[bucketIndex];
            int dataIndex=0;
            for(int i=0;i<ll.size();i++){
                Node node=ll.get(i);
                if(node.key==key){
                    return dataIndex;
                }
                dataIndex++;
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBuck[]=buckets;
            buckets=new LinkedList[N*2];
            N=2*N;
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
            //take out nodes and add in new bucket
            for(int i=0;i<oldBuck.length;i++){
                LinkedList<Node> ll=oldBuck[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.remove();
                    put(node.key, node.value);
                }
            }
        }
        public void put(K key , V value){//O(lambda)->O(1)
            int bucketIndex=hashFunction(key);
            int dataIndex=SearchInLL(key,bucketIndex);

            if(dataIndex!=-1){
                Node node=buckets[bucketIndex].get(dataIndex);
                node.value=value;
            }
            else{
                buckets[bucketIndex].add(new Node(key,value));
                n++;
            }
            double lambda=(double)n/N;
            if(lambda>2.0){
                rehash();
            }
        }

        public boolean conatinsKey(K key){//O(1)
            int bucketIndex=hashFunction(key);
            int dataIndex=SearchInLL(key,bucketIndex);

            if(dataIndex!=-1){//valid
                return true;
            }
            else{
                return false;
            }
        }

        public V get(K key){//O(1)
            int bucketIndex=hashFunction(key);
            int dataIndex=SearchInLL(key,bucketIndex);

            if(dataIndex!=-1){//valid->key exist
                Node node=buckets[bucketIndex].get(dataIndex);
                return node.value;
            }
            else{//when we get -1 ->not valid
                return null;
            }
        }

        public V remove(K key){//O(1)
            int bucketIndex=hashFunction(key);
            int dataIndex=SearchInLL(key,bucketIndex);

            if(dataIndex!=-1){
                Node node=buckets[bucketIndex].remove(dataIndex);
                n--;
                return node.value;
            }
            else{
                return null;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys=new ArrayList<>();
            for(int i=0;i< buckets.length;i++){
                LinkedList<Node> ll=buckets[i];
                for(Node node:ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){//if hashmap empty or not
            return n==0;//true otheriwse if not equal to 0 that is greater than it means true
        }
    }

    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Nepal",5);

        ArrayList<String> keys=hm.keySet();
        for(String key:keys){
            System.out.println(key);
        }
        System.out.println(hm.get("India"));
        System.out.println(hm.remove("US"));
        System.out.println(hm.isEmpty());
    }
}
