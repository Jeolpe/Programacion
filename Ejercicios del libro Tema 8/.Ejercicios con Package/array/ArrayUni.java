/*
 *@utor Jesús María Olalla Pérez
 */
package array;
public class ArrayUni {
  
  /*---------------Mostrar Array Unidimensional(normal) -------------------*/
  public static void mostrarUni1(int[] uni){
    for(int i = 0; i < uni.length; i++){
      System.out.printf("%4d",uni[i]);
      }
    }
  /*----------------------------------------------------------------*/
  
  
  /*--------------Mostrar Array Unidimensional(for each) ----------*/
  public static void mostrarUni2(int[] uni){
    for(int num:uni){
      System.out.printf("%4d",num);
      }
    }
  /*----------------------------------------------------------------*/
  
  
  
	/*------Genera Número aleatorios de un Array Unidimensional------*/
	public static int[] generaArrayUni(int x, int m, int M){
    int[] uni = new int[x];
    if(m > M){
      int aux = M;
      M = m;
      m = aux;
    }
      for(int i = 0; i < uni.length;i++){
        uni[i] = (int)(Math.random()*(M-m+1)+m);
      }
        return uni;
  }
  /*----------------------------------------------------------------*/
  
  /*------Captura el mínimo número de un Array Unidimensional-------*/
  public static int minimoArrayUni(int[] uni){
    int min = Integer.MAX_VALUE;
    for(int num:uni){
      if(min > num){
        min = num;
      }
    }
    return min;
  }
  /*----------------------------------------------------------------*/
  
  
  /*------Captura el Máximo número de un Array Unidimensional-------*/
  public static int maximoArrayUni(int[] uni){
    int Max = Integer.MIN_VALUE;
    for(int num:uni){
      if(Max < num){
        Max = num;
      }
    }
    return Max;
  }
  /*----------------------------------------------------------------*/
  
  
  /*-----------Coge la Media de un Array Unidimensional-------------*/
  public static int mediaArrayUni(int[] uni){
    int suma      = 0;
    int count     = 0;
    int resultado = 0;
    for(int num:uni){
      suma+= num;
      count++;
    }
    resultado = suma/count;
    return resultado;
  }
  /*----------------------------------------------------------------*/
  
  
  
  /*-----Afirma o Niega hay un Número en el Array Unidimensional----*/
  public static boolean estaEnArrayUni(int[] uni, int x){
    for(int num:uni){
      if(num == x){
        return true;
      }
    }
      return false;
  } 
    
  /*----------------------------------------------------------------*/
  
  
  /*-----------Voltea el Número de un Array Unidimensional----------*/
  public static int[] volteaArrayUni(int[] uni){
    int[] x = uni.clone();
    int count = 0;
    for(int i = uni.length-1; i >= 0; i--){
      x[i] = uni[count]; 
      count++;
      }
      return x;
    }
  /*----------------------------------------------------------------*/
  
  
  /*---Nos dice la posición del Número de un Array Unidimensional---*/
  public static int posicionEnArrayUni(int[] uni, int num){
    int[] x = uni.clone();
    int posc = 0;
    for(int i = 0; i < x.length; i++){
      if(x[i] == num){
        posc = (i+1);
        return posc;
      }
    }
      return posc;
  }
  /*----------------------------------------------------------------*/
  
  
  /*----Mueve los dígitos a la derecha de un Array Unidimensional---*/
  public static int[] rotaDerechaArrayUni(int[] uni, int n){
    int[] x = uni.clone();
    int numAux = 0;
    while(n-- > 0){
      numAux = x[x.length-1];
      for(int i = x.length-1; i > 0; i--){
        x[i] = x[i-1];
        }
        x[0] = numAux;
    }
    return x;
  }
  /*----------------------------------------------------------------*/
  
  
  /*---Mueve los dígitos a la izquierda de un Array Unidimensional--*/
  public static int[] rotaIzquierdaArrayUni(int[] uni, int n){
    int[] x = uni.clone();
    int numAux = 0;
    while(n-- > 0){
      numAux = x[0];
      for(int i = 0; i < x.length-1; i++){
        x[i] = x[i+1];
      }
        x[x.length-1] = numAux;
    }
    return x;
  }
  /*----------------------------------------------------------------*/
  
  
  /*--------------Sustituir los números por su transcripción---------*/
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
  /*----------------------------------------------------------------*/
  
}
