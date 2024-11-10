package Projeto;

import java.util.Scanner;

public class Ranqueada {

    public static void calcularNivel(int vitorias, int derrotas) {
        int saldo = vitorias - derrotas;

        // Garantindo o escopo fora do IF
        String nivel = "";

        // Condicional para determinar o nível com base no saldo
        if (saldo < 10) {
            nivel = "Ferro";
        } else if (saldo >= 10 && saldo <= 20) {
            nivel = "Bronze";
        } else if (saldo >= 21 && saldo <= 50) {
            nivel = "Prata";
        } else if (saldo >= 51 && saldo <= 80) {
            nivel = "Ouro";
        } else if (saldo >= 81 && saldo <= 90) {
            nivel = "Diamante";
        } else if (saldo >= 91 && saldo <= 100) {
            nivel = "Lendário";
        } else {
            nivel = "Imortal";
        }

        System.out.println("O Herói tem de saldo " + saldo + " e está no nível de " + nivel);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Entrada de dados do usuário
        System.out.print("Digite o número de vitórias: ");
        int vitorias = scan.nextInt();

        System.out.print("Digite o número de derrotas: ");
        int derrotas = scan.nextInt();

        // Chamando a função que calcula o nível e saldo, e já exibe o resultado
        calcularNivel(vitorias, derrotas);

        scan.close();
    }
}