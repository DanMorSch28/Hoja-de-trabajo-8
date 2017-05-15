/*
 * UVG
 * Hoja de trabajo 8
 * Daniel Morales 15526
 * Rodrigo Corona 15102
 * Fernando Hernandez 15476
*/	
	
package paquete;

public class RedBlackTree <K extends Comparable<K>, V> implements MapComparable<K, V> {
    
	private RedBlackBST<K, V> redBlackTree;

    public RedBlackTree(){
    	redBlackTree = new RedBlackBST<K, V>();
    }

    @Override
    public void put(K key, V value) {
    	redBlackTree.put(key, value);
    }

    @Override
    public V get(K key) {
        return redBlackTree.get(key);
    }

    @Override
    public boolean isEmpty() {
        return redBlackTree.isEmpty();
    }
}