

package practica;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Preg02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int number = Integer.parseInt(num);
        int[] digitos = new int[num.length()];
        int i = digitos.length - 1;
        while (number > 0) {
            digitos[i] = number%10;
            number = number / 10;
            i--;
        }

        for(int j=0; j < digitos.length; j++){
            System.out.println("numero: "+digitos[j]);
         }
        
    }
    
}
