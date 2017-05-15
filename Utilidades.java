/*
 * UVG
 * Hoja de trabajo 8
 * Daniel Morales 15526
 * Rodrigo Corona 15102
 * Fernando Hernandez 15476
*/	
package paquete;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Utilidades {
    public void lector(){
           List<String> ingles = new ArrayList<String>();
        List<String> espanol = new ArrayList<String>();
        BufferedReader Br = null;
        try{
            ArrayList<String> diccionario = new ArrayList<>();
            String line;
            String[] traduccion;
             Br = new BufferedReader(new FileReader(""));
             while (true){
                 line = Br.readLine();
                 if(line == null){
                     break;
                 }
                 else{
                     traduccion = line.split("[\\\\(\\\\)]");
                     for(String cada :traduccion){
                         if(!"".equals(cada)){
                             diccionario.add(cada);
                         }
                     }
                     for (String each :diccionario){
                         String inglesPalabra = diccionario.get(0);
                         String espanolPalabra = diccionario.get(1);
                         ingles.add(inglesPalabra);
                         espanol.add(espanolPalabra);
                     }
                 }
             }
        }catch(IOException e){
            System.out.println("Archivo no encontrado");
            
        }
    }
}