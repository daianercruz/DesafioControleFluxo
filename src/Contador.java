

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);


        System.out.println("------- Contador de Números  -------");
        System.out.println("Digite o primeiro número: ");
            int parametroUm = sc.nextInt();

        System.out.println("Digite o segundo número:");
            int parametroDois = sc.nextInt();

    try {

        contar(parametroUm, parametroDois);

    }catch (ParametrosInvalidosException e) {
            System.out.println("O Segundo número deve ser maior que o primeiro número!! ");
    }

}
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        if(parametroUm >= parametroDois){
            throw  new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        System.out.println("Imprimindo sequência da subtração do primeiro número com o segundo:");
        for(int i=1; i<=contagem; i++){


            System.out.println("Contagem: "+ i);
        }
    }
}