package com.curtain.study.other._1lrucache;

import sun.misc.Cache;

import java.util.HashMap;

/**
 * LRUCache的链表+HashMap实现
 *
 * @author Curtain
 * @date 2018/7/10 15:34
 */
public class LRUCache<K, V> {
    private int currentCacheSize;
    private int cacheCapacity;
    private HashMap<K, CacheNode> caches;
    private CacheNode first;
    private CacheNode last;

    public LRUCache(int size) {
        currentCacheSize = 0;
        this.cacheCapacity = size;
        caches = new HashMap<K, CacheNode>(size);
    }

    public void put(K k, V v) {
        CacheNode node = caches.get(k);
        if (node == null) {
            if (caches.size() >= cacheCapacity) {
                caches.remove(last.key);
                removeLast();
            }
            node = new CacheNode();
            node.key = k;
        }
        node.value = v;
        moveToFirst(node);
        caches.put(k, node);
    }

    public Object get(K k) {
        CacheNode node = caches.get(k);
        if (node == null) {
            return null;
        }
        moveToFirst(node);
        return node.value;
    }

    public Object remove(K k) {
        CacheNode node = caches.get(k);
        if (node != null) {
            if (node.pre != null) {
                node.pre.next = node.next;
            }
            if (node.next != null) {
                node.next.pre = node.pre;
            }
            if (node == first) {
                last = node.pre;
            }
        }
        return caches.remove(k);
    }

    public void clear() {
        first = null;
        last = null;
        caches.clear();
    }

    private void moveToFirst(CacheNode node) {
        if (first == node) {
            return;
        }
        if (node.next != null) {
            node.next.pre = node.pre;
        }
        if (node.pre != null) {
            node.pre.next = node.next;
        }
        if (node == last) {
            last = last.pre;
        }
        if (first == null || last == null) {
            first = last = node;
            return;
        }

        node.next = first;
        first.pre = node;
        first = node;
        first.pre = null;
    }

    private void removeLast() {
        if (last != null) {
            last = last.pre;
            if (last == null) {
                first = null;
            } else {
                last.next = null;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        CacheNode node = first;
        while (node != null) {
            sb.append(String.format("%s:%s", node.key, node.value));
            node = node.next;
        }
        return sb.toString();
    }

    class CacheNode {
        CacheNode pre;
        CacheNode next;
        Object key;
        Object value;

        public CacheNode() {

        }
    }
}
