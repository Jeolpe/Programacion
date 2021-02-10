/*
 *@utor Jesús María Olalla Pérez 
 */
import Paquetes.LibreriaPalotes;
import java.util.Scanner;

public class Examen1 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    String palo_uno,palo_dos;
    
    System.out.println("Prueba de las funciones para operar en el formato Palotes: ");
    System.out.print("Introduzca el valor 1 en formato de Palotes: ");
    palo_uno = sc.nextLine();
    System.out.print("Introduzca el valor 2 en formato de Palotes: ");
		palo_dos = sc.nextLine();
    
    int resultado_uno = convertidorDePalotesaNumeros(palo_uno);
    int resultado_dos = convertidorDePalotesaNumeros(palo_dos);
    
    System.out.println("La suma es: " + convertidorDeNumerosAPalotes(LibreriaPalotes.sumaPalotes(resultado_uno, resultado_dos)));
    System.out.println("La resta es: " + convertidorDeNumerosAPalotes(LibreriaPalotes.restaPalotes(resultado_uno, resultado_dos)));
    System.out.println("La multipilación es: " + convertidorDeNumerosAPalotes(LibreriaPalotes.multiplicaPalotes(resultado_uno, resultado_dos)));
    System.out.println("La División es: " + convertidorDeNumerosAPalotes(LibreriaPalotes.concientePalotes(resultado_uno, resultado_dos)));
    System.out.println("El resto es: " + convertidorDeNumerosAPalotes(LibreriaPalotes.restoPalotes(resultado_uno, resultado_dos)));
  }
  
  public static int convertidorDePalotesaNumeros(String palotes){
    int count = 0;
    int aux = 0;
    for(int i = 0; i < palotes.length(); i++){
      
      if(palotes.charAt(i) == '|'){
        count++;
        }
        if((palotes.charAt(i) == '-') || (i == palotes.length()-1)){
         aux = (aux * 10) + (count);
         count = 0; 
        }
      }
      return aux;
    }
    
    public static String convertidorDeNumerosAPalotes(int n){
      String[] palotes = {"|","||","|||","||||","|||||","||||||","|||||||","||||||||","|||||||||"};
      String palabra = "";
      int ndigitos = LibreriaPalotes.cuentaDigitos(n);
      int volteo = LibreriaPalotes.volteoNumero(n);
      int count = 0;
      while(volteo > 0){
        int aux = volteo%10;
        count++;
        if(count > 1 && count <= ndigitos){
        palabra = palabra + "-" + palotes[aux-1];
      }else{
        palabra = palabra + palotes[aux-1];
        }
        volteo/= 10;
        }
       return palabra;
      }
    
    
}

