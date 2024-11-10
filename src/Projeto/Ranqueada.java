package Projeto;

import java.util.Scanner;

public class Ranqueada {

    public static void calcularNivel(int vitorias, int derrotas) {
        int saldo = vitorias - derrotas;

        // Garantindo o escopo fora do IF
        String nivel = "";

        // Condicional para determinar o nível com base nas vitórias
        if (vitorias < 10) {
            nivel = "Ferro";
        } else if (vitorias >= 10 && vitorias <= 20) {
            nivel = "Bronze";
        } else if (vitorias >= 21 && vitorias <= 50) {
            nivel = "Prata";
        } else if (vitorias >= 51 && vitorias <= 80) {
            nivel = "Ouro";
        } else if (vitorias >= 81 && vitorias <= 90) {
            nivel = "Diamante";
        } else if (vitorias >= 91 && vitorias <= 100) {
            nivel = "Lendário";
        } else {
            nivel = "Imortal";
        }

        // Exibe o resultado do cálculo
        System.out.println("O Herói tem de saldo " + saldo + " e está no nível de " + nivel);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Pergunta ao usuário quantas vezes deseja calcular
        System.out.print("Quantas vezes deseja calcular o nível? ");
        int vezes = scan.nextInt();

        // Laço for para permitir que o usuário calcule várias vezes
        for (int i = 0; i < vezes; i++) {
            // Entrada de dados do usuário para cada cálculo
            System.out.print("\nDigite o número de vitórias: ");
            int vitorias = scan.nextInt();

            System.out.print("Digite o número de derrotas: ");
            int derrotas = scan.nextInt();

            // Chamando a função que calcula o nível e saldo, e já exibe o resultado
            calcularNivel(vitorias, derrotas);
        }

        scan.close();
    }
}