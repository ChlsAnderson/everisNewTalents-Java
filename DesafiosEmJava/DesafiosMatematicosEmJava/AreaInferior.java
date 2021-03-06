import java.io.IOException;
import java.util.Scanner;

public class AreaInferior {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
    double soma = 0;
    char O = leitor.next().toUpperCase().charAt(0);
    double[][] M = new double[12][12];
    
    for (int i = 0; i < 12; ++i) {
    	for (int j = 0; j < 12; ++j) {
    		M[i][j] = leitor.nextDouble();
    	}
    }
    
    for (int i = 0; i < 12; ++i) {
    	for (int j = 0; j < 12; ++j) {
    		if ((i > 6) && (j < i) && (j > 11 - i))
    		  soma += M[i][j];
    	}
    }

    if (O == 'M')
      soma /= 30;
      
  	System.out.println(String.format("%.1f", soma));
      leitor.close();
    }
	
}

/* 
 Básico
 Princípios Básicos
Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão na área inferior da matriz, conforme ilustrado abaixo (área verde).

 


Entrada
A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante de dupla precisão (double) que compõem a matriz.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.

 
Exemplo de Entrada	
S
1.0
330.0
-3.5
2.5
4.1
...
Exemplo de Saída
112.4

TESTES
Teste #1

Dado de entrada:
S
23
-8
-93
46
84
-94
-56
-88
20
-15
-8
44
-38
-88
-63
-96
-30
82
70
-10
1
-6
-16
-8
-38
-40
-99
83
19
66
-47
-9
71
17
-21
59
-16
35
49
92
-70
39
10
41
67
-60
92
-31
45
13
-86
-87
91
29
-3
4
-19
27
29
60
14
-29
33
91
97
-67
73
94
86
41
-44
79
13
5
60
7
64
-98
34
-24
11
-2
-36
-1
-75
24
-51
88
-79
93
-6
-38
-48
34
-27
15
-68
91
2
-87
-7
-90
76
-66
47
92
-52
-22
10
-21
-29
68
-17
-26
-76
-92
-5
91
98
19
60
91
-20
80
80
-93
73
98
-30
-69
93
-73
-2
-67
52
36
-38
-64
70
28
2
-72
53
-67
Saída esperada:
-29.0
Clique no botão "EXECUTAR TESTES" para visulizar a saída do seu algoritmo.
Teste #2

Dado de entrada:
M
23
-8
-93
46
84
-94
-56
-88
20
-15
-8
44
-38
-88
-63
-96
-30
82
70
-10
1
-6
-16
-8
-38
-40
-99
83
19
66
-47
-9
71
17
-21
59
-16
35
49
92
-70
39
10
41
67
-60
92
-31
45
13
-86
-87
91
29
-3
4
-19
27
29
60
14
-29
33
91
97
-67
73
94
86
41
-44
79
13
5
60
7
64
-98
34
-24
11
-2
-36
-1
-75
24
-51
88
-79
93
-6
-38
-48
34
-27
15
-68
91
2
-87
-7
-90
76
-66
47
92
-52
-22
10
-21
-29
68
-17
-26
-76
-92
-5
91
98
19
60
91
-20
80
80
-93
73
98
-30
-69
93
-73
-2
-67
52
36
-38
-64
70
28
2
-72
53
-67
Saída esperada:
-1.0
Clique no botão "EXECUTAR TESTES" para visulizar a saída do seu algoritmo.

*/