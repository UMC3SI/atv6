/**
 *@author @vasconceloscaio      Caio Vasconcelos <11211101570@alunos.umc.br>
 *@author @Parthur15            Arthur Pires     <11211101539@alunos.umc.br>
 */
public class main {


    public static void main(String[] args) {
     //instancia objeto de classe Relogio
     //Utilizando construtor vazio
     Relogio r1 = new Relogio();
     System.out.println("Utilizando construtor vazio");
     System.out.println("Horario: " + r1.getHora() + ":" + r1.getMinuto() + ":" + r1.getSegundo());
     System.out.println("n\n");//pula duas linhas
     
     //instancia objeto da classe Relogio
     //utilizando construtor que requer hora, minuto e segundo
     Relogio r2 = new Relogio(140,65,97);
     System.out.println("Utilizando construtor que requer hora, minuto e segundo");
     System.out.println("Horario: " + r2.getHora() + ":" + r2.getMinuto() + ":" + r2.getSegundo());
     System.out.println("n\n");//pula duas linhas
     
     //instancia objeto da classe Relogio
     //utilizando construtor que requer apenas a hora 
     Relogio r3 = new Relogio(25);
     System.out.println("Utilizando construtor que requer hora, minuto e segundo");
     System.out.println("Horario: " + r3.getHora() + ":" + r3.getMinuto() + ":" + r3.getSegundo());
     System.out.println("n\n");//pula duas linhas
     
     //instancia objeto da classe Relogio
     //utilizando construtor que requer hora e minuto 
     Relogio r4 = new Relogio(11,35);
     System.out.println("Utilizando construtor que requer hora, minuto e segundo");
     System.out.println("Horario: " + r4.getHora() + ":" + r4.getMinuto() + ":" + r4.getSegundo());
     System.out.println("n\n");//pula duas linhas
     
     //instancia objeto da classe Relogio
     //utilizando construtor vazio
     Relogio r5 = new Relogio();
     System.out.println("Utilizando construtor vazio");
     System.out.println("Mas atribuindo valores atraves dos metodos de acesso");
     r5.setHora(21);
     r5.setMinuto(51);
     r5.setSegundo(65);
     System.out.println("Horario: " + r5.getHora() + ":" + r5.getMinuto() + ":" + r5.getSegundo());
     System.out.println("n\n");//pula duas linhas
     
     
    }
    
}
