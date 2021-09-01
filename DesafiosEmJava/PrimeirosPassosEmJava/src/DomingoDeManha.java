import java.io.IOException;
import java.util.Scanner;

public class DomingoDeManha {  
  // public class Desafio {      
        public static void main(String[] args) throws IOException {
            Scanner leitor = new Scanner(System.in);
            String[] relogio = leitor.nextLine().split(":");    		
            int hora = Integer.parseInt(relogio[0]);
            int min = Integer.parseInt(relogio[1]);
            while ( 5 <= hora & hora <= 9  ) {
                while( 0 <= min & min <= 59){
                switch ( hora ) 
                {
                    case (7): System.out.println("Atraso maximo: " + min); break;
                    case (8): System.out.println("Atraso maximo: " +   (min  +60)    ); break;
                    case (9): System.out.println("Atraso maximo: " +    (min  +120)     ); break;
                    default: System.out.println("Atraso maximo: 0"); break;
                }
                min++;
                }
                System.out.println(hora  +" : " + (min+60) + " alguma coisa");
                min = 0;
                hora++;
            }
        }
        
    // }
    
}
