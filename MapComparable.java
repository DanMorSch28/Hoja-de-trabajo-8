/*
 * UVG
 * Hoja de trabajo 8
 * Daniel Morales 15526
 * Rodrigo Corona 15102
 * Fernando Hernandez 15476
*/	
	
package paquete;

public interface MapComparable <K extends Comparable<K>, V> {
    
    void put(K key, V value);


    V get(K key);

    boolean isEmpty();
}