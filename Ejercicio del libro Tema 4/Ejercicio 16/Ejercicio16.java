/*
 *@utor Jesús María Olalla Pérez 
 */

import java.util.Scanner;
public class Ejercicio16 {
	
	public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
     String welcome = "";
     String resp_uno = "";
     String resp_dos = "";
     String resp_tres= "";
     String resp_cuatro= "";
     String resp_cinco = "";
     String resp_seis = "";
     String resp_siete = "";
     String resp_ocho = "";
     String resp_nueve = "";
     String resp_diez = "";
     int respuesta = 0;
     int resp_unos = 0;
     int resp_doss = 0;
     int resp_tress= 0;
     int resp_cuatros= 0;
     int resp_cincos = 0;
     int resp_sietes = 0;
     int resp_seiss = 0;
     int resp_ochos = 0;
     int resp_nueves = 0;
     int resp_diezs = 0;
     
     
     System.out.println("Responde las siguientes preguntas con: Verdadero o Falso.");
     welcome = s.nextLine();
     
    
    System.out.println("1.¿Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente?");
    resp_uno = s.nextLine();
    
    System.out.println("2. ¿Ha aumentado sus gastos de vestuario?");
    resp_dos = s.next();
    
    System.out.println("3. ¿Ha perdido el interés que mostraba anteriormente por ti?");
    resp_tres = s.next();
    
    System.out.println("4. ¿Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)?");
    resp_cuatro = s.next();
    
    System.out.println("5. ¿No te deja que mires la agenda de su teléfono móvil?");
    resp_cinco = s.next();
    
    System.out.println("6. ¿A veces tiene llamadas que dice no querer contestar cuando estás tú delante?");
    resp_seis = s.next();
    
    System.out.println("7. ¿Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a?");
    resp_siete = s.next();
    
    System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    resp_ocho = s.next();
    
    System.out.println("9. ¿Has notado que últimamente se perfuma más?");
    resp_nueve = s.next();
    
    System.out.println("10. ¿Se confunde y te dice que ha estado en sitios donde no ha ido contigo?");
    resp_diez = s.next(); 
    
    if(resp_uno.equals("verdadero")){
      resp_unos = 3;
    } else {
      resp_unos = 0;
      
      }
      
      if(resp_dos.equals("verdadero")){
      resp_doss = 3;
    } else {
      resp_doss = 0;
    }
    
     if(resp_tres.equals("verdadero")){
      resp_tress = 3;
    } else {
      resp_tress = 0;
      
      }
      
       if(resp_cuatro.equals("verdadero")){
      resp_cuatros = 3;
    } else {
      resp_cuatros = 0;
      
      }
      
       if(resp_cinco.equals("verdadero")){
      resp_cincos = 3;
    } else {
      resp_cincos = 0;
      
      }
      
       if(resp_seis.equals("verdadero")){
      resp_seiss = 3;
    } else {
      resp_seiss = 0;
      
      }
      
       if(resp_siete.equals("verdadero")){
      resp_sietes = 3;
    } else {
      resp_sietes = 0;
      
      }
      
       if(resp_ocho.equals("verdadero")){
      resp_ochos = 3;
    } else {
      resp_ochos = 0;
      
      }
      
       if(resp_nueve.equals("verdadero")){
      resp_nueves = 3;
    } else {
      resp_nueves = 0;
      
      }
      
       if(resp_diez.equals("verdadero")){
      resp_diezs = 3;
    } else {
      resp_diezs = 0;
      
      }
      
      respuesta = (resp_unos + resp_doss + resp_tress + resp_cuatros + resp_cincos + resp_seiss + resp_sietes + resp_ochos + resp_nueves + resp_diezs);
      
      if ((respuesta >= 0) && (respuesta <= 10)){
        System.out.println("");
        System.out.println("• Puntuación entre 0 y 10: ¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        
       } else  if((respuesta >= 11) && (respuesta <= 22)){
         System.out.println("");
          System.out.println("• Puntuación entre 11 y 22: Quizás exista el peligro de otra persona en suvida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
          
        } else  if((respuesta >= 22) && (respuesta <= 30)){
          System.out.println("");
          System.out.println("• Puntuación entre 22 y 30: Tu pareja tiene todos los ingredientes para estarviviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
          
       }
      
    
    
    
    
    
    
		
	}
}

