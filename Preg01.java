
package ejercicio1;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Preg01 {

 
    public static void main(String[] args) {
        
    float numero;
    float suma;
    float f;
    float resultado;
    numero = Integer.parseInt(JOptionPane.showInputDialog(
                "ingrese el numero "));
    suma = numero+4;
    f=1/suma;
    resultado = (float) (0.25-f);
    JOptionPane.showMessageDialog(null, 
                "resultado es : "+resultado);
        }
    }
    

