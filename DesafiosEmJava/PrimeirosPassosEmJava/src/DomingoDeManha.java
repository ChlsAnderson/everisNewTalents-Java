import java.io.IOException;
import java.util.Scanner;

public class DomingoDeManha {  
  // public class Desafio {      
        public static void main(String[] args) throws IOException {
            Scanner leitor = new Scanner(System.in);
            String[] relogio = leitor.nextLine().split(":");    		
            // while (      ) {
            int hora = Integer.parseInt(relogio[0]);
            int min = Integer.parseInt(relogio[1]);
            //     switch (      ) {
            //         case(7): System.out.println("Atraso maximo: " + min); break;
            //         case(8): System.out.println("Atraso maximo: " + (          ); break;
            //         case(9): System.out.println("Atraso maximo: " + (          ); break;
            //         default: System.out.println("Atraso maximo: 0");
            //     }
            // }
        System.out.println(hora + " : " + min + " alguma coisa");
        }
        
    // }
    
}
