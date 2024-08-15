package tipos_primitivos;

import java.util.Scanner;

public class Tipos_primitivos {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Insira nome do aluno: ");
        String nome = teclado.nextLine();
        
        System.out.print("Insira nota do aluno: ");
        Float nota =  teclado.nextFloat();
        
        System.out.println("A nota de " + nome + " foi " + nota);
    }
    
}
