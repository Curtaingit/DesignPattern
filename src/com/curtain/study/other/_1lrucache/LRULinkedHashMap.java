package com.curtain.study.other._1lrucache;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 利用LinkedHashMap实现简单的缓存
 * 实现removeEldestEntry方法
 * 1. 新数据插入到链表头部；
 * 2. 每当缓存命中（即缓存数据被访问），则将数据移到链表头部；
 * 3. 当链表满的时候，将链表尾部的数据丢弃。
 * 分析
 * 【命中率】
 * 当存在热点数据时，LRU的效率很好，但偶发性的、周期性的批量操作会导致LRU命中率急剧下降，缓存污染情况比较严重。
 * 【复杂度】
 * 实现简单。
 * 【代价】
 * 命中时需要遍历链表，找到命中的数据块索引，然后需要将数据移到头部。
 * @author Curtain
 * @date 2018/7/10 15:13
 */
public class LRULinkedHashMap<K,V> extends LinkedHashMap<K,V> {
    private final int maxCapacity;

    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

    public LRULinkedHashMap(int maxCapacity){
        super(maxCapacity, DEFAULT_LOAD_FACTOR,true);
        this.maxCapacity = maxCapacity;
    }

    private final Lock lock = new ReentrantLock();

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>maxCapacity;
    }

    @Override
    public boolean containsKey(Object key) {
        try {
            lock.lock();
            return super.containsKey(key);
        }finally {
            lock.unlock();
        }
    }

    @Override
    public V get(Object key) {
        try {
            lock.lock();
            return super.get(key);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public V put(K key, V value) {
        try {
            lock.lock();
            return super.put(key, value);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public int size() {
        try {
            lock.lock();
            return super.size();
        } finally {
            lock.unlock();
        }
    }

    public Collection<Map.Entry<K,V>> getAll(){
        try {
            lock.lock();
            return new ArrayList<Map.Entry<K, V>>(super.entrySet());
        } finally {
            lock.unlock();
        }
    }
}
