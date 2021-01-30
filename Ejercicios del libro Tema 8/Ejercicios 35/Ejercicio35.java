/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio35 {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int num = 0;
		
    System.out.print("Escribe un número entero positivo: ");
    num = sc.nextInt();
    
    String[] a = convierteEnPalotes(num); 
    
    mostrar(a,num);
	}
  
  public static int voltea(int x){
    int aux = 0;
    if(x == 0){
      return 1;
      }
    while(x > 0){
      aux = (aux * 10) + (x%10);
      x/= 10;
      }
      return aux;
    }
    
    public static int contador(int x){
      int contador = 0;
      while(x > 0){
        x/= 10;
        contador++;
        }
        return contador;
      }
    
    public static String [] convierteEnPalotes(int x){
      String[] todoPalotes = new String[contador(x)];
      int contador = 0;
      int aux = 0;
      String palotes = "";
      x = voltea(x);
      while(x > 0){
        aux = x%10;
        switch(aux){
          case (1):
          palotes = "|";
          break;
          case (2):
          palotes = "||";
          break;
          case (3):
          palotes = "|||";
          break;
          case (4):
          palotes = "||||";
          break;
          case (5):
          palotes = "|||||";
          break;
          case (6):
          palotes = "||||||";
          break;
          case (7):
          palotes = "|||||||";
          break;
          case (8):
          palotes = "||||||||";
          break;
          case (9):
          palotes = "|||||||||";
          break;
          default:
          
          }
          todoPalotes[contador] = palotes;
          contador++;
          x/= 10;
        }
        return todoPalotes;
      }
      
      public static void mostrar (String[] uni, int x){
        int count = 0;
        for(String num:uni){
          count++;
          if( count < contador(x)){
          System.out.print(num + "-");
          }else{
            System.out.print(num);
          }
        }
     }
  }

