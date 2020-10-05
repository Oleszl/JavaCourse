package com.company;

import java.util.*;

public class Map<K, V> {

    private Set<MyEntry<K, V>> set;

    public Map() {
        set = new HashSet<MyEntry<K, V>>();
    }

    public void addToMap(K key, V value) {
        set.add(new MyEntry<K, V>(key, value));
    }

    public void deleteByKey(K key) {

        set.removeIf(kvMyEntry -> kvMyEntry.getKey().equals(key));
    }

    public void deleteByValue(V value) {

        set.removeIf(kvMyEntry -> kvMyEntry.getValue().equals(value));
    }

    public Set<K> keySet() {
        Set<K> keySet = new HashSet<K>();
        Iterator<MyEntry<K, V>> iterator = set.iterator();
        while (iterator.hasNext()) {
            keySet.add(
                    iterator.next().getKey());
        }

        return keySet;

    }

    public List<V> listValue() {
        List<V> listValue = new ArrayList<V>();
        Iterator<MyEntry<K, V>> iterator = set.iterator();
        while (iterator.hasNext()) {
            listValue.add(iterator.next().getValue());
        }
        return listValue;


    }


}

