package com.example.demo;

public class Data<K,V> {
	
	private K key;
	private V value;
 
	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}
 
	public K getKey() {
		return key;
	}
 
	public V getValue() {
		return value;
	}
 
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}



}
