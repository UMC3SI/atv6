    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relogio;

/**
 *
 * @author Gabriel Boschi Tanikawa<11211100784@alunos.umc.br>
 * @author Freddye Pontes Nunes <11211202211@alunos.umc.br>
 */
public class Horario {
    

/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Relogio r = new Relogio();
System.out.println("utilizando construtor vazio");
System.out.println("horario: " +r.getHora() + ":" + +r.getMinuto() + ":" +r.getSegundo());
System.out.println("\n\n");

r = new Relogio(115,70,98);
System.out.println("utilizando construtor que requer hora,minuto e segundo");
System.out.println("horario: " +r.getHora() + ":" +r.getMinuto()+ ":" +r.getSegundo());
System.out.println("\n\n");

r = new Relogio(20);
System.out.println("utilizando construtor que requer hora");
System.out.println("horario: " +r.getHora() + ":" +r.getMinuto()+ ":" +r.getSegundo());
System.out.println("\n\n");

r = new Relogio(10,30);
System.out.println("utilizando construtor que requer hora e minuto");
System.out.println("horario: "+r.getHora() + ":" +r.getMinuto()+ ":" +r.getSegundo());
System.out.println("\n\n");

r = new Relogio();
System.out.println("utilizando construtor vazio");
System.out.println("mas atribuindo valores atraves dos metodos de acesso");
r.setHora(13);
r.setMinuto(40);
r.setSegundo(10);
System.out.println("horario: " +r.getHora()+ ":" +r.getMinuto() + ":"+r.getSegundo());
System.out.println("\n\n");

}
}
    