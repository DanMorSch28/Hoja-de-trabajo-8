/*
 * UVG
 * Hoja de trabajo 8
 * Daniel Morales 15526
 * Rodrigo Corona 15102
 * Fernando Hernandez 15476
*/	


package paquete;

import java.util.Map;

public class Association <K, V> implements Map.Entry<K, V> {
	
	protected K key;
	protected V value;
	

	public Association(K key, V value){
		this.key = key;
		this.value = value;
	}
	
	public Association(K key){ 
		this(key,null); 
	}

	public boolean equals(Object otro){
		Association otraAssoc = (Association)otro;
		return getKey().equals(otraAssoc.getKey());
	}

	public int hashCode(){ 
		return getKey().hashCode(); 
	}
	

	public V getValue(){ 
		return this.value; 
	}
	
	public K getKey(){ 
		return this.key; 
	}


	public V setValue(V value)
    {
        V oldValue = this.value;
        this.value = value;
        return oldValue;
    }
	
	public String toString()
    {
        StringBuffer s = new StringBuffer();
        s.append("<Association: "+getKey()+"="+getValue()+">");
        return s.toString();
    }


}
