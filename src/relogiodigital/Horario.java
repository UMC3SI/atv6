/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relogiodigital;

/**
 *
 * @author Matheus Meirielli RGM : 11211102089 EMAIL : 11211102089@Alunos.umc.br
 * @co-author Guilherme Antunes RGM: 11211102142 EMAIL : 11211102142@Alunos.umc.br
 */
public class Horario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Relogio r1 = new Relogio();
        System.out.println("Declarando apenas uma vez");
        System.out.println("mas atribuindo valores atraves dos metodos de acesso");
        r1.setHora(13);
        r1.setMinuto(60);
        r1.setSegundo(74);
        System.out.println("horario :" + r1.getHora() + ":" + r1.getMinuto() + ":" + r1.getSegundo());
        System.out.println("\n\n");//pula duas linhas
    }

}
