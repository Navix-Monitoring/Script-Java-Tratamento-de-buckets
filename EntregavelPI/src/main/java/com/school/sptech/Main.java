package com.school.sptech;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Você deseja ver os registros sobre o funcionamento da CPU, RAM e disco de 10 em 10 segundos?\n1. Sim\n2. Não");
        int questao = input.nextInt();
        if (questao == 1){
            for(int i = 0; i <= 10; i++){
                Componentes componente = new Componentes(
                        random.nextDouble(90)+10,
                        random.nextDouble(90)+10,
                        random.nextDouble(90)+10
                );
                System.out.println(
                    "Uso de CPU: "+Math.round(componente.getCpu())+
                    "%\nUso de memória RAM: "+Math.round(componente.getRam())+
                    "%\nUso do disco: "+Math.round(componente.getDisco())+"%"
                );

                if(componente.getCpu() > 80){
                    System.out.println("O uso de CPU está maior que o normal, possível funcionamento incorreto do sistema");
                }
                if(componente.getRam() > 70){
                    System.out.println("O uso de RAM está maior que o normal, possível limitação para execução de processos");
                }
                if(componente.getDisco() > 70){
                    System.out.println("O uso do disco está maior que o normal, aumento risco de falha");
                }
                System.out.println("\n\n");

                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }else{
            System.out.println("Finalizando sistema!");
        }

    }
}
