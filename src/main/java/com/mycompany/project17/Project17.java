package com.mycompany.project17;
import java.util.Scanner;

public class Project17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Selecione a profissão de Tibúrcio: " + "// 1 - Engenheiro// 2 - Programador// 3 - Médico// 4 - Advogado// 5 - Designer");
        int profissao = in.nextInt();
        switch(profissao){
            case 1:
                String resultado1 = "Engenheiro";
                System.out.println("Tibúrcio é " + resultado1);
                break;
            case 2:
                String resultado2 = "Programador";
                System.out.println("Tibúrcio é " + resultado2);
                break;
            case 3:
                String resultado3 = "Médico";
                System.out.println("Tibúrcio é " + resultado3);
                break;
            case 4:
                String resultado4 = "Advogado";
                System.out.println("Tibúrcio é " + resultado4);
                break;
            case 5:
                String resultado5 = "Designer";
                System.out.println("Tibúrcio é " + resultado5);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        
    }
}
