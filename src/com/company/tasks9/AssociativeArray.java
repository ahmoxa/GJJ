package com.company.tasks9;



import java.util.LinkedList;

public class AssociativeArray implements Mappable{


    private int size;
    private LinkedList<Entry>[] buckets;
    private static final int DEFAULT_CAPACITY = 16;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

    public AssociativeArray() {
        this(DEFAULT_CAPACITY);
    }

    public AssociativeArray(int capacity) {
        buckets = new LinkedList[capacity];
    }

    /**
     *
     * @param key
     * @param val
     * @return null if new key
     * @return old value if key contains
     */
    @Override
    public String add(String key, String val) {
        if(key == null){
            return null;
        }
        int index = getIndex(key);
        if(buckets[index] != null){
            for(Entry curEntry : buckets[index]){
                if(curEntry.key.equals(key)){
                    String oldVal = curEntry.value;
                    curEntry.value = val;
                    return oldVal;
                }
            }
        }
        checkAndGrow(size + 1);
        index = getIndex(key);
        if(buckets[index] == null)
            buckets[index] = new LinkedList<>();
        buckets[index].add(new Entry(key, val));
        size++;
        return null;
    }

    /**
     *
     * @param key
     * @return null if key isn't in AA
     * @return old value if key is in AA
     */
    @Override
    public String containsKey(String key) {
        if(size == 0){
            return null;
        }
        int index = getIndex(key);
        LinkedList<Entry> chain = buckets[index];
        if(chain != null){
            for(Entry curEntry : chain){
                if(curEntry.key.equals(key)){
                    return curEntry.value;
                }
            }
        }
        return null;
    }

    /**
     *
     * @param key
     * @return old value if key contains
     * @return null if key doesn't contain
     */
    @Override
    public String remove(String key) {
        if(size == 0){
            return null;
        } int index = getIndex(key);
        LinkedList<Entry> chain = buckets[index];
        if(chain != null){
            for(Entry curEntry : chain){
                if(curEntry.key.equals(key)){
                    String oldVal = curEntry.value;
                    buckets[index].remove(curEntry);
                    return oldVal;
                }
            }
        }
        return null;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(LinkedList<Entry> chain : buckets){
            stringBuilder.append("[");
            if(chain == null){
                stringBuilder.append("null");
            }else{
                for(Entry curEntry : chain){
                    stringBuilder.append(curEntry);
                }
            }
            stringBuilder.append("]\t");
        }
        return stringBuilder.toString();
    }

    private void checkAndGrow(int l){
        float curLoadFactor = l/(float)buckets.length;
        if(curLoadFactor >= DEFAULT_LOAD_FACTOR){
            grow();
        }
    }

    private void grow() {
        LinkedList<Entry>[] oldBuckets = buckets;
        buckets = new LinkedList[oldBuckets.length * 2];


        for(LinkedList<Entry> chain : oldBuckets){
            if(chain == null) continue;
            for(Entry curEntry : chain){
                add(curEntry.key, curEntry.value);
            }
        }

    }

    private int getIndex(String key){
        return Math.abs(key.hashCode() % buckets.length - 1);
    }



    static class Entry{
        String key;
        String value;

        Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" +
                    "key='" + key + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }
    }
}
