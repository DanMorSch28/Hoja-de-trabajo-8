/*
 * UVG
 * Hoja de trabajo 8
 * Daniel Morales 15526
 * Rodrigo Corona 15102
 * Fernando Hernandez 15476
*/	
package paquete;

import java.util.HashMap;

public class Hash <K extends Comparable<K>,V> implements MapComparable<K, V>{
	
	private HashMap<K,V> hash;
	
	public Hash(){
		hash = new HashMap<K,V>(); 
	}
	
	public void put(K key, V value){ 
		hash.put(key, value); 
	}
	
	public V get(K key){ 
		return hash.get(key); 
	}
	
	public boolean isEmpty(){ 
		return hash.isEmpty(); 
	}
}
