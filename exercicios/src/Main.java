import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo a seu programa de exercicios, vamos lá?");
        Scanner leitor = new Scanner(System.in);
        var resposta = 0;
        var desafios = """
                 1: Conversor de temperatura
                 2: Media salarial
                 3: Quantidade de azulejos para parede
                 4: Calculo de volume de uma lata de óleo
                 5: Calculando o valor da conta de luz
                 6: Sair
                 0: Todos
                 """;

         while (resposta != 6){
             System.out.println("");
             System.out.println("Qual desafio deseja ver?");
             System.out.println(desafios);
             resposta = leitor.nextInt();
             if (resposta == 0){
                 System.out.println("Desafio 1: Conversor de temperatura");
                 ConversorDeTemperatura conversor = new ConversorDeTemperatura();
                 conversor.temperaturasEConversoes(21);

                 System.out.println("");

                 System.out.println("Desafio 2: Media salarial");
                 Salarios salarios = new Salarios();
                 System.out.println("Media de salario da empresa X é: " + salarios.mediaSalarial + " reais.");

                 System.out.println("");

                 System.out.println("Desafio 3: Quantidade de azulejos para parede");
                 Parede parede = new Parede();
                 System.out.println("Area da parede: " + parede.areaDaParede + "m²");
                 System.out.println("Area de azulejos: " + parede.areaDoAzulejo + "m²");
                 System.out.println("A quantidades de azulejos será: " + parede.qtDeAzulejos);

                 System.out.println("");

                 System.out.println("Desafio 4: calculo de volume de uma lata de óleo");
                 LataDeOleo lata = new LataDeOleo();
                 lata.equacao();
                 lata.medidas();
                 System.out.println("O volume da lata é de: " + lata.equacaoDeV + "cm³");
                 System.out.println("convertido para m³: " + lata.equacaoDeV / 1000000 + "m³");

                 System.out.println("");

                 System.out.println("Desafio 5: Calculando o valor da conta de luz");
                 ContaDeLuz contaDeLuz = new ContaDeLuz();
                 contaDeLuz.calculoDaConta(5140,5053);
             } else if (resposta == 1) {
                 System.out.println("Desafio 1: Conversor de temperatura");
                 ConversorDeTemperatura conversor = new ConversorDeTemperatura();
                 conversor.temperaturasEConversoes(21);
             } else if (resposta == 2) {
                 System.out.println("Desafio 2: Media salarial");
                 Salarios salarios = new Salarios();
                 System.out.println("Media de salario da empresa X é: " + salarios.mediaSalarial + " reais.");
             } else if (resposta == 3) {
                 System.out.println("Desafio 3: Quantidade de azulejos para parede");
                 Parede parede = new Parede();
                 System.out.println("Area da parede: " + parede.areaDaParede + "m²");
                 System.out.println("Area de azulejos: " + parede.areaDoAzulejo + "m²");
                 System.out.println("A quantidades de azulejos será: " + parede.qtDeAzulejos);
             } else if (resposta == 4) {
                 System.out.println("Desafio 4: calculo de volume de uma lata de óleo");
                 LataDeOleo lata = new LataDeOleo();
                 lata.equacao();
                 lata.medidas();
                 System.out.println("O volume da lata é de: " + lata.equacaoDeV + "cm³");
                 System.out.println("convertido para m³: " + lata.equacaoDeV / 1000000 + "m³");
             } else if (resposta == 5) {
                 System.out.println("Desafio 5: Calculando o valor da conta de luz");
                 ContaDeLuz contaDeLuz = new ContaDeLuz();
                 contaDeLuz.calculoDaConta(5140,5053);
             }
         }
    }
}