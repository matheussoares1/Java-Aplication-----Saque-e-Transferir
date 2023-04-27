/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.interfacebanco;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class InterfaceBanco {   
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Insira o nome de usuário: ");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Bem vindo ao sistema FitBank em parceria com a Eletrônica São Francisco senhor(a) " + userName);  // Output user input
        }
        System.out.println("-------Menu Banco-------");
        System.out.println("1 - Sacar");
        System.out.println("2 - Depositar");
        System.out.println("3 - Transferir");

        Scanner myObj = new Scanner(System.in);  // Create a Scanner objec
        System.out.println("Digite a opção desejada");
        int userNumber = myObj.nextInt();  // Read user input

        switch (userNumber) {
            case 1:
                System.out.println("Opção Selecinada:  1 - Sacar ");
                break;
            case 2:
                System.out.println("3 - Transferir");
                break;
            case 3:
                System.out.println("3 - Transferir");
                break;
            case 4:
                System.out.println("3 - Transferir");
                break;

        }
       
    }
    
}
