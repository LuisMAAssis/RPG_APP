package com.luismiguel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CharCreated charCreated = new CharCreated();

        System.out.println("Personagem");

        System.out.println("Nome: ");
        String charName = scanner.nextLine();

        System.out.println("Raça: ");
        String race = scanner.nextLine();

        System.out.println("Idade: ");
        int age = scanner.nextInt();

        System.out.println("Tendência: ");
        String tendency = scanner.nextLine();

        System.out.println("Antecedente: ");
        String background = scanner.nextLine();

        scanner.nextLine();

        Character character = new Character(charName, race, age, tendency, background);
        charCreated.registerChar(character);

        System.out.println("\nEventos Cadastrados");
        for (Character c : charCreated.consultChar()) {
            System.out.printf("Nome: " + character.getCharName());
            System.out.printf("\nEndereço: " + character.getRace());
            System.out.printf("\nCategoria: " + character.getAge());
            System.out.printf("\nHorário: " + character.getTendency());
            System.out.printf("\nDescrição: " + character.getBackground());
        }

        scanner.close();

    }
}