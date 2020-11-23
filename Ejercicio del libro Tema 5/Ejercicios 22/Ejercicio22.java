/*
*@utor Jesús María Olalla Pérez
*/
  
 public class Ejercicio22 {
 public static void main(String[] args) {
   
 boolean primo = true;
 
  for (int n = 2; n <= 100; n++) {
     primo = true;
   for (int i = 2; i < n; i++) {
     if (n % i == 0) {
     primo = false;
    }
  }

     if (primo) {
       if(n < 97){
        System.out.print(n + ",");
       }else{
        System.out.print(n + ".");  
    }
    }
  }
  System.out.println();
 }
}
