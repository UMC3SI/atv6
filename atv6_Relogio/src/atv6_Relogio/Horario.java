package atv6_Relogio;

/*
< Autor Leonardo Piascentini Bugmann / RGM:11211100076>
< Co-Autor Renata Cristina da Silva / 11211100766 >
 */

public class Horario {
	public static void main(String[] args){
		Relogio r = new Relogio();
		System.out.println("Usando construtor vazio");
		System.out.println("Horario: " + r.getHora() + ":" + r.getMinuto() + ":" + r.getSegundo());
		System.out.println("\n\n");
		
		r.setHora(115);
        r.setMinuto(70);
        r.setSegundo(98);
		
		System.out.println("Usando construtor que requer Horas,Minutos e Segundos");
		System.out.println("Não vai funcionar pois os dados inseridos estão fora da regra dos ifs");
		System.out.println("Horario: " + r.getHora() + ":" + r.getMinuto() + ":" + r.getSegundo());
		System.out.println("\n\n");
		
		r.setHora(20);
		
		System.out.println("Usando construtor que requer apenas Horas");
		System.out.println("Horario: " + r.getHora() + ":" + r.getMinuto() + ":" + r.getSegundo());
		System.out.println("\n\n");
		
		r.setHora(10);
        r.setMinuto(30);
		
		System.out.println("Usando construtor que requer Horas e Minutos");
		System.out.println("Horario: " + r.getHora() + ":" + r.getMinuto() + ":" + r.getSegundo());
		System.out.println("\n\n");
		
		r.setHora(13);
		r.setMinuto(40);
		r.setSegundo(10);
		
		System.out.println("Usando construtor vazio,");
		System.out.println("Mas atribuindo valores atraves dos metodos de acesso");
		System.out.println("Horario: " + r.getHora() + ":" + r.getMinuto() + ":" + r.getSegundo());
	}
	
}
