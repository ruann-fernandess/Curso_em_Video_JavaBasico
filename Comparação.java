/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparação;

/**
 *
 * @author ruanf
 */
public class Comparação {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Ruan";
        String nome2 = "Ruan";
        String nome3 = new String("Ruan");
        String r = (nome1.equals(nome3))?"Igual":"Diferente";
        System.out.println(r);
    }
    
}
