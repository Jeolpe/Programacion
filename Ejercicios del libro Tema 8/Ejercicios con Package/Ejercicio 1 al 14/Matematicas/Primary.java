/*
 *@utor Jesús María Olalla Pérez 
 */
package Matematicas;

public class Primary {
  
  /*---------presentarUnNumero------------------*/
  public static void mostrarNumero(int x){
    System.out.print(x);
    }
  /*--------------------------------------------*/
  
  
  
  /*---------Voltear un Número------------------*/
  public static int volteoNumero(int x){
    int volteo = 0;
    if (x < 0) {
     return -volteoNumero(-x);
    }
    while(x > 0){
      volteo = (volteo * 10) + (x%10);
      x/=10;
    }
      return volteo;
  }
  /*-------------------------------------------*/
  
  
  
  /*---------Número Capicua--------------------*/
  public static boolean esCapicua(int x){
    if(x == volteoNumero(x)){
      return true;
    }
      return false;
  }
  /*-------------------------------------------*/
  
  
  /*---------Número Primo----------------------*/
  public static boolean esPrimo(int x){
    for(int i = 2; i < x; i++){
      if(x%i == 0){
        return false;
      }
    }
      return true;
  }  
 /*--------------------------------------------*/
 
 
 /*---------Potencia de un Número--------------*/
  public static int potenciaNumero(int base, int exp){
    int x = 1;
    for(int i = 0; i < exp; i++){
      x*= base;
    }
      return x;
  }
 /*-------------------------------------------*/
 
 
 /*---------Cuenta los Dígitos----------------*/
  public static int cuentaDigitos(int x){
    int count= 0;
    int num  = 0;
    num = volteoNumero(x);
    if(num == 0){
      return count = 1;
      }
    while(num > 0){
      num/= 10;
      count++;
    }
      return count;
  }
  /*------------------------------------------*/
  
  
  /*---------Cuenta los Dígitos---------------*/
  public static int devuelveDigito(int x, int y){
    int contador = -1;/*Esto es si pide que empiece a contar desde el número 0*/
    int aux = 0;
    x = volteoNumero(x);
    if(y == 0){
      return aux = 0;
      }
    while(x > 0){
      aux = x%10;
      contador++;
      if(contador == y){
        return aux;
      }
        x/=10;
    }
    return -1;
  }
  /*------------------------------------------*/
  
  
  /*---------Posición de Dígitos--------------*/
  public static int posicionDeDigitos(int x, int y){
    int contador = 0;
    int aux = 0;
    x = volteoNumero(x);
    if(y == 0){
      return aux = 0;
    }
    while(x > 0){
      aux = x%10;
      contador++;
      if(aux == y){
        return contador;
      }
      x/= 10;
    }
    return -1;
  }
  
  /*-----------------------------------------*/
  
  
   /*------Quitar Dígitos por Detrás---------*/
  public static int quitaDigitoPorDetras(int x, int y){
    int count = 0;
    while(x > 0){
      x/=10;
      count++;
      if(y == count){
        return x;
      }
    }
    return x;
  }
  /*-----------------------------------------*/
  
  
  /*--------Quitar Dígitos por Delante-------*/

  public static int quitaDigitoPorDelante(int x, int y){
    x = volteoNumero(x);
    x = quitaDigitoPorDetras(x,y);
    x = volteoNumero(x);
    return x;
    }
    
    
  /*--------Pega Dígito por Detras-----------*/
  public static int pegaDigitoPorDetras(int x, int y){
    x = (x*10) + (y);
    return x;
    }
  /*-----------------------------------------*/
  
  
  /*------Pega Dígito por Delante -----------*/
  public static int pegaDigitoPorDelante(int x, int y){
    x = volteoNumero(x);
    x = (x*10) + (y);
    x = volteoNumero(x);
    return x;
  }
  /*----------------------------------------*/
  
  
  /*----Coger Número en un intervalo -------*/
  public static int trozoDeNumero(int x, int y, int z){
    x = volteoNumero(x);
    int count = 0;
    int num = 0;
    int digi = 0;
    while(x > 0){
      digi = x%10;
      count++;
      if(count > y && count < z ){
        num = (num*10) + (digi);
      }
        x/= 10;
    }
    return num;
  }
  /*----------------------------------------*/
  
  
  /*---------Pegar dos Números -------------*/
  public static int juntaNumeros(int x, int y){
    int union = 0;
    x = volteoNumero(x);
    y = volteoNumero(y);
    while(x > 0){
      union = (union*10) + (x%10);
      x/=10;
    }
    while(y > 0){
      union = (union*10) + (y%10);
      y/=10;
    }
      return union;
  }
  /*----------------------------------------*/
} 
    
  
    
    







