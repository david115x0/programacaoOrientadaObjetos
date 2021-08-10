package com.company;

import java.util.Scanner;

    // EXERCÍCIO Funçoes
    class  eDivisivel{
        public int valor1;
        public int valor2;

        public boolean resultado() {
            if(valor1%valor2 == 0)
                return true;
            return false;
        }

    }
    // EXERCÍCIO Funçoes

public class Main {
    public static void main(String[] args) {
        // write your code here

        // EXERCÍCIO Funçoes

        eDivisivel verificar =  new eDivisivel();
        verificar.valor1 = 862523;
        verificar.valor2 = 923623;

        System.out.println(verificar.resultado());



        for (int i = 1; i <= 5; i++) {
            System.out.println("Ola");
        }

        Integer num1 = 5;
        Integer num2 = 20;

        // EXERCÍCIO Variáveis

        if (num1 / num2 == 0) {
            System.out.println("Estes números são divisiveis");
        } else if (num1 / num2 > 0) {
            System.out.println("Estes números não são divisiveis");
        }

        // Exercícios String e Integer

        String nome1 = "David";
        String nome2 = "Silva";

        if (nome1.equals(nome2)) {
            System.out.println("Esses nome são iguais");
        } else
            System.out.println("Esses nomes são diferentes");

        Integer numero = 8;
        Integer numero2 = 6;

        if (numero>numero2){
            System.out.println("este numero é maior");
        } else if (numero < numero2) {
            System.out.println("este numero é menor");
        } else if (numero == numero2) {
            System.out.println("estes numeros são iguais");
        }

        // Exercício Scanner

        Scanner teste;
        teste = new Scanner(System.in);
        String nomeCompleto;
        Character iniciais;

        System.out.println("Digite seu nome:");
        nomeCompleto= teste.nextLine();
        iniciais = nomeCompleto.charAt(0);


        for(int i=0; i<nomeCompleto.length(); i++) {
            if (nomeCompleto.charAt(i) == ' ') {
                System.out.print(nomeCompleto.charAt(i + 1));
            }
        }


    }


}
