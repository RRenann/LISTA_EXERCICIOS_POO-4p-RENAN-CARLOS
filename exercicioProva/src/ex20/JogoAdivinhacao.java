package ex20;

import java.util.Random;
import java.util.Scanner;

class JogoAdivinhacao {
    private int numeroSecreto;
    private Random random;

    public JogoAdivinhacao() {
        random = new Random();
        numeroSecreto = random.nextInt(100) + 1; // Gera um número entre 1 e 100
    }

    public void jogar() {
        try (Scanner scanner = new Scanner(System.in)) {
			int palpite = 0;
			int tentativas = 0;

			System.out.println("Bem-vindo ao jogo de adivinhação!");
			System.out.println("Tente adivinhar o número entre 1 e 100.");

			while (palpite != numeroSecreto) {
			    System.out.print("Digite seu palpite: ");
			    palpite = scanner.nextInt();
			    tentativas++;

			    if (palpite > numeroSecreto) {
			        System.out.println("O número secreto é menor!");
			    } else if (palpite < numeroSecreto) {
			        System.out.println("O número secreto é maior!");
			    }
			}

			System.out.println("Parabéns! Você acertou o número secreto (" + numeroSecreto + ") em " + tentativas + " tentativas.");
		}
    }

    public static void main(String[] args) {
        JogoAdivinhacao jogo = new JogoAdivinhacao();
        jogo.jogar();
    }
}


