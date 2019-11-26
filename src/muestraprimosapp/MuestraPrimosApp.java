package muestraprimosapp;
import java.util.Scanner;

public class MuestraPrimosApp {

        public static void main(String[] args) {
            for (int i = 0; i<100; i++){
                //Hacemos un casting para que nos devuelva un número entero.
                int raiz = (int) Math.sqrt(i);
                int contador = 0;
                //Hacemos otro buble para contar los divisibles.
                for (int j=raiz; j>1; j--){
                    if(i%j == 0){
                        contador++;
                       
                    }
                }
                /*Según el número de divisibles, sabemos si es primo o no.
             *Si es primo el contador será 0.
            
            */
        if (contador < 1){
            System.out.println(i);
                
            }
            
            
            
        }
    }
    
}
