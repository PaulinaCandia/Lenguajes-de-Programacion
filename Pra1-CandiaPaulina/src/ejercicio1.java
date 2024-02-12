
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Nova
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cl[]= {".cl", ".com", ".org", ".net"};
        String carac[] = {"¿", "?", "¡", "!", "“", "#", "$", "%", "&", "(", ")", "=", "@"};
        Scanner scan = new Scanner(System.in);
        boolean  flag = true;
        while(flag){
        System.out.print("Ingrese Url : ");
        String url = scan.nextLine();
        String inic = "";
        if (url.length() <= 6){
        }else{
        for (int x=0; x<=6; x++){
            inic = (inic + String.valueOf(url.charAt(x)));
        }
        }
        if("http://".equals(inic)){ 
        }else{
            System.out.println("URL invalido1");
        }
        for(String carac1 : carac){
            if(url.contains(carac1)){
                System.out.println("URL Invalido2");
            }else{
            }
        }
        for(String cl1:cl){
            if(url.contains(cl1)){    
            }else{
        }
        }
        if (13 <=url.length() && url.contains(".cl")){
        }else if (url.length() > 14){
        }else if (url.length() > 6){
            System.out.println("URL invalido3");
        }
        }
    }
}
    
    
