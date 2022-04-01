/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario;

/**
 *
 * @author Pedro Ferreira Martins <"11201100435@aluno.umc.br">
 * @author Raphael Ninomiya <"11211100998@aluno.umc.br">
 * @author Victor Ferreira Silva <"11211100596@aluno.umc.br">
 */
public class Horario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Relogio r1 = new Relogio();
        System.out.println("Utilizando construtor vazio: \n");
        System.out.println("Horário: "+r1.GetHora()+":"+r1.GetMinuto()+":"+r1.GetSegundo());
        System.out.println("\n\n");
        
        Relogio r2 = new Relogio(115, 70, 98);
        System.out.println("Utilizando construtor que requer hora, minuto e segundo: \n");
        System.out.println("Horário: "+r2.GetHora()+":"+r2.GetMinuto()+":"+r2.GetSegundo());
        System.out.println("\n\n");
        
        
        Relogio r3 = new Relogio(20);
        System.out.println("Utilizando construtor que requer apenas hora: \n");
        System.out.println("Horário: "+r3.GetHora()+":"+r3.GetMinuto()+":"+r3.GetSegundo());
        System.out.println("\n\n");
        
        Relogio r4 = new Relogio(10, 30);
        System.out.println("Utilizando construtor que requer hora e minuto: \n");
        System.out.println("Horário: "+r4.GetHora()+":"+r4.GetMinuto()+":"+r4.GetSegundo());
        System.out.println("\n\n");
        
        Relogio r5 = new Relogio();
        System.out.println("Utilizando construtor vazio,");
        System.out.println("Mas atribuindo valores atravéz de métodos de acesso:");
//        Métodos de acesso:
        r5.SetHora(13);
        r5.SetMinuto(40);
        r5.SetSegundo(10);
        System.out.println("Horário: "+r5.GetHora()+":"+r5.GetMinuto()+":"+r5.GetSegundo());
        System.out.println("\n\n");
        
    }

}
