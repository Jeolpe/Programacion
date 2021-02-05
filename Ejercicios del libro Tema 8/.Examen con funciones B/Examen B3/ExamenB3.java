/*
 *@utor Jesús María Olalla Pérez
 */

import java.util.Scanner;
public class ExamenB3 {
	
	public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    String frase = "";
    String [] palabras = {"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
    String respuesta = "";
    do{
    System.out.print("Introduzca una frase (a ser posible, con dígitos numéricos en ella):");
    frase = sc.nextLine();
    
    System.out.println("Frase original: " + frase);
    System.out.print("Frase convertida: " + transcripcion(palabras,frase));
    
    System.out.println("");
    System.out.print("¿Desea salir? (s/n):");
    respuesta = sc.nextLine();
    
    }while(!respuesta.equals("s"));
    
    System.out.println("");
    System.out.print("¡¡Hasta pronto!!");
		
	}
  
  public static String transcripcion(String[] uni, String f){
    String fraseConvertida = "";
    for(int i = 0; i < f.length(); i++){
      if(f.charAt(i) >= ('0') && f.charAt(i) <= ('9')){
        fraseConvertida = fraseConvertida + "[" + uni[(int)(f.charAt(i))-(int)'0'] + "]";
        }else{
         fraseConvertida = fraseConvertida + f.charAt(i); 
        }
      }
      return fraseConvertida;
    }
}

