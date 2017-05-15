/*
 * UVG
 * Hoja de trabajo 8
 * Daniel Morales 15526
 * Rodrigo Corona 15102
 * Fernando Hernandez 15476
*/	


package paquete;

import java.awt.PageAttributes.MediaType;


public class Factory {

	private static Factory instancia;
	public static Factory getInstancia(){
		if(instancia==null)
			instancia= new Factory();
		return instancia;
	}
	
	public static <K extends Comparable<K>,V> MapComparable<K, V> getImplementacion(String imp){
		
		switch(imp){
			case "RBT": 
				return new RedBlackTree<>();
			case "Hash": 
				return new Hash<>();
			default:
				return null;

		}
	}
	
}
