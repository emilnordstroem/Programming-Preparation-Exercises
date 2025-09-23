package Hashing;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class HashMap<K, V> implements Map<K, V>{
    private int capacity;
    private double loadRefactorThreshold;
    private int size;

    private LinkedList<Map.Entry<K, V>>[] table;

    public HashMap() {
        this.capacity = 10;
        this.loadRefactorThreshold = 0.75;
        this.size = 0;
        this.table = new LinkedList[capacity];
    }

    @Override
    public void clear() {
        for (LinkedList<Entry<K, V>> currentLinkedList : table) {
            currentLinkedList = null;
        }
        capacity = 10;
        size = 0;
    }

    @Override
    public boolean containsKey(K key) {
        int placementIndex = key.hashCode() % capacity;
        if (table[placementIndex] == null) {
            return false;
        }

        for (Entry<K, V> currentEntry : table[placementIndex]) {
            if (currentEntry.key.equals(key)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean containsValue(V value) {
        for (LinkedList<Entry<K, V>> currentLinkedList : table) {
            if (currentLinkedList == null) {
                continue;
            }
            for (Entry<K, V> currentEntry : currentLinkedList) {
                if (currentEntry.value.equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return Set.of();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Set<K> keySet() {
        Set<K> keyset = new HashSet<>();
        for (LinkedList<Entry<K, V>> currentLinkedList : table) {
            if (currentLinkedList == null) {
                continue;
            }
            for (Entry<K, V> currentEntry : currentLinkedList) {
                keyset.add(currentEntry.key);
            }
        }
        return keyset;
    }

    @Override
    public V put(K key, V value) {
        refactorTable();
        Entry<K, V> newEntry = new Entry<>(key, value);
        int placementIndex = key.hashCode() % capacity;
        if (table[placementIndex] == null) {
            table[placementIndex] = new LinkedList<>();
        }
        table[placementIndex].add(newEntry);
        size++;
        return value;
    }

    private void refactorTable () {
        if ((double) size / capacity <= loadRefactorThreshold) {
            return;
        }
        capacity *= 2;
        table = new LinkedList[capacity];
        System.out.println("Messsage from HashMap.java: I refactored to new capacity: " + capacity);
        for (LinkedList<Entry<K, V>> currentLinkedList : table) {
            if (currentLinkedList == null) {
                continue;
            }
            for (Entry<K, V> currentEntry : currentLinkedList) {
                int placementIndex = currentEntry.key.hashCode() % capacity;
                if (table[placementIndex] == null) {
                    table[placementIndex] = new LinkedList<>();
                }
                table[placementIndex].add(currentEntry);
            }
        }
    }

    @Override
    public V remove(K key) {
        int placementIndex = key.hashCode() % capacity;
        if (table[placementIndex] == null) {
            return null;
        }

        for (Entry<K, V> currentEntry : table[placementIndex]) {
            if (currentEntry.key.equals(key)) {
                table[placementIndex].remove(currentEntry);
                return currentEntry.value;
            }
        }

        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Set<V> values() {
        Set<V> valueSet = new HashSet<>();
        for (LinkedList<Entry<K, V>> currentLinkedList : table) {
            if (currentLinkedList == null) {
                continue;
            }
            for (Entry<K, V> currentEntry : currentLinkedList) {
                valueSet.add(currentEntry.value);
            }
        }
        return valueSet;
    }
}
