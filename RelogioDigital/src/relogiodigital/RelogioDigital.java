/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relogiodigital;

/**
 *
 * @author alunocmc
 */
public class RelogioDigital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instancia objeto de classe Relogio
        //utilizando construtor vazio
        Relogio r1 = new Relogio();
        System.out.println("Utilizando construtor vazio");
        System.out.println("horario:" +r1.getHora() + ":" + r1.getMinuto() + ":" + r1.getSegundo());
        System.out.println("\n\n");//pula duas linhas
        
        //instancia objeto da classe relogio
        //utilizando construtor que requer hora, minuto e segundo
        Relogio r2 = new Relogio(115,70,98);
        System.out.println("Utiizando construtor que requer hora, minuto e segundo");
        System.out.println("horario" + r2.getHora() + ":" + r2.getMinuto() + ":" + r2.getSegundo());
        System.out.println("\n\n");// pula duas linhas
        
        //instancia objeto de classe Relogio
        //utilizando construtor vazio
        Relogio r3 = new Relogio();
        System.out.println("Utilizando construtor vazio");
        System.out.println("horario:" +r3.getHora() + ":" + r3.getMinuto() + ":" + r3.getSegundo());
        System.out.println("\n\n");//pula duas linhas
        
        //instancia objeto de classe Relogio
        //utilizando construtor vazio
        Relogio r4 = new Relogio();
        System.out.println("Utilizando construtor vazio");
        System.out.println("horario:" +r4.getHora() + ":" + r4.getMinuto() + ":" + r4.getSegundo());
        System.out.println("\n\n");//pula duas linhas
        
        Relogio r5 = new Relogio();
        System.out.println("utilizando construtor vazio");
        System.out.println("mas atribuindo valores atraves dos metodos de acesso");
        //mas atribuindo valores atraves dos metodos de acesso
        r5.setHora(13);
        r5.setMinuto(40);
        r5.setSegundo(10);
        System.out.println("Horario:" + r5.getHora() + ":" + r5.getMinuto() + ":" + r5.getSegundo());
        System.out.println("\n\n"); //pula duas linhas
    }
} //final da classe Horario
