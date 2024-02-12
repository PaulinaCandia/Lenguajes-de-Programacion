
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nova
 */
public class ejercicio2 {
    public static void main(String[] args) {
        int n;
        int cant = 0;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese numero: ");
        int numero = scan.nextInt();
        String num = Integer.toString(numero);
        for(int i=0; i<num.length() ; i++){
            cant += 1;
            n = Integer.parseInt(String.valueOf((num.charAt(i))));
            sum += n;
        }
        System.out.println("Cantidad de cifras: " + cant + ", Suma de las cifras: " + sum);
     }
}
