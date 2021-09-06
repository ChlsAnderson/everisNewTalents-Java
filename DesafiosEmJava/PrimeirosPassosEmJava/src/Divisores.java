import java.util.Scanner;

public class Divisores {
//complete os espaços em branco com sua solução
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();

        for (int i = 1;  i<n        ; i++) {
            if (n % i == 0) {
                System.out.println( (n/i)      );
            }
        }
        System.out.println(  n      );
        input.close();
    }

}

/* 
 Básico
 Princípios Básicos
Ler um número inteiro N e calcular todos os seus divisores.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Escreva todos os divisores positivos de N, um valor por linha.

 
Exemplo de Entrada	
6
Exemplo de Saída
1
2
3
6

Agradecimentos a Cassio F.

TEstes 1 e 2:
Teste #1

Dado de entrada:
1
Saída esperada:
1
Clique no botão "EXECUTAR TESTES" para visulizar a saída do seu algoritmo.
Teste #2

Dado de entrada:
99
Saída esperada:
1
3
9
11
33
99
Clique no botão "EXECUTAR TESTES" para visulizar a saída do seu algoritmo.

*/