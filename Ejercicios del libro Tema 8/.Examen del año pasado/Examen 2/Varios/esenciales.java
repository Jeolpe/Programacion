/*
 *@utor Jesús María Olalla Pérez 
 */

package Varios;
public class esenciales {
  
    public static int[][] rellenarMatrizAleatorios(int filas, int columnas, int minimo, int Maximo){
      
      if(minimo > Maximo){
        int aux = Maximo;
        Maximo = minimo;
        minimo = aux;
        }
        
        int[][] bidi = new int[filas][columnas];
        for (int i=0;i<bidi.length;i++){
            for (int j=0;j<bidi[0].length;j++){
                bidi[i][j]=(int)(Math.random()*(Maximo-minimo+1)+minimo);
            }
        }
      return bidi;
    }
    
    public static int generaNumeroAleatorio(int minimo, int Maximo) {

        int num = (int) (Math.random() *(Maximo - minimo + 1)+ minimo);
        return num;
    }
    
     public static void mostrarMatriz(int bidi[][]) {

        for (int i = 0; i < bidi.length; i++) {
            for (int j = 0; j < bidi[0].length; j++) {
                System.out.print(bidi[i][j] + " ");
            }
            System.out.println("");
        }
     }
    
    public static void PresentaMatrizConLineas (int[][] a) {
    String resultado = "";
    
    resultado = resultado +"┌";
    for (int i=0; i<a[0].length-1; i++) {
      resultado = resultado +"──┬";
    }
    resultado = resultado + "──┐\n";
    
    for (int i=0; i<a.length; i++) {
      resultado = resultado +"│";
      for (int j=0; j<a[0].length; j++) {
        resultado = resultado + String.format("%2d│",a[i][j]);
      }
      resultado = resultado +"\n";
      
      if (i<a.length-1) {
        resultado = resultado + "├";
        for (int k=0; k<a[0].length-1; k++) {
          resultado = resultado + "──┼";
        }
        resultado = resultado +"──┤\n";
      }
    }
    resultado = resultado +"└";
    for (int i=0; i<a[0].length-1; i++) {
      resultado = resultado + "──┴";
    }
    resultado = resultado +"──┘\n";
    
    System.out.print(resultado);
  }

    
    
	
}

