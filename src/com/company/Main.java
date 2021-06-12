package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Здравствуйте!");
        scan.next();

        System.out.println("Как вас зовут?");
        String name = scan.next();
        System.out.println("Приветствую вас, " + name + "!");

    }
}
