/*
 *@utor Jesús María Olalla Pérez 
 */
import java.util.Scanner;
public class EjercicioDeClase {
	
	public static void main (String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int x[] = new int[0];
    int n = 0;
    int count = 0;
    
    do{
    System.out.println("Pulse 1 para añadir: ");
    System.out.println("Pulse 2 para eliminar: ");
    System.out.println("Pulse 3 para consultar: ");
    System.out.println("Pulse 4 para presentar: ");
    System.out.println("Pulse 5 para salir: ");
    System.out.print("Usted elije la opción: ");
    n = sc.nextInt();
    
    
       if(n == 1){
		System.out.println();
		System.out.print("Escribe el número que quieras añadir: ");
		int num = sc.nextInt();
		 x = anidaNumero(x,num);
		 count++;
		 System.out.println();
			
		}
     
      if(n == 2){
		  System.out.println();
		x = eliminaNumero(x);
		count--;
		System.out.println();
		}
    
     if(n == 3){
		 if(count > 0){
		System.out.println();
		System.out.print("El último número es " + ultimaPosicion(x));
		System.out.println();
	    }else{
			System.out.println("No hay ningun número en el Array");
			}
		System.out.println();
		}
    
     if(n == 4){
		  System.out.println();
		presentarArray(x);
		 System.out.println();
		}
		
	}while(n != 5);
	
	System.out.println();
	System.out.print("Usted ha salido correctamente");
    

   }
   
    public static int[] anidaNumero(int[] x, int y){
        int[] uni = new int[x.length+1];
        for(int i = 0; i < uni.length-1; i++){
          uni[i] = x[i];
          }
          uni[uni.length-1] = y; 
          return uni;
        }
        
        public static int[] eliminaNumero(int[] x){
		    int[] uni;
			if(x.length > 1){
        uni = new int[x.length-1];
	     }else{
			  uni = new int[0];
			 }
        for(int i = 0; i < uni.length; i++){
          uni[i] = x[i];
          }
          
          return uni;
        }
        
        
   
   public static void presentarArray(int arr[]){
	   System.out.print("Los números son: ");
	   for(int num:arr){
		   System.out.print(num + " ");
		   }
		   System.out.println();
	   }
	   
	   public static int ultimaPosicion(int[] uni){
		   int num = 0;
		   num = uni[uni.length-1];
		   return num;
		   }
}

