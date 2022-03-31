package atv6_Relogio;

/*
< Autor Leonardo Piascentini Bugmann / RGM:11211100076>
< Co-Autor Renata Cristina da Silva / 11211100766 >
 */

public class Relogio {
	private int hora;
	private int minuto;
	private int segundo;
	
	public Relogio(){
		hora = 0;
		minuto = 0;
		segundo = 0;
	}
	
	public Relogio(int h) {
        if (h >= 0 && h <= 24){
            hora = h;
        }
        minuto = 0;
        segundo = 0;
    }
	public Relogio(int h, int m) {
        if (h >= 0 && h <= 24){
            hora = h;
        }
        if (m >= 0 && m <= 60){
            minuto = m;
        }
        segundo = 0;
    }
	public Relogio(int h, int m, int s) {
        if (h >= 0 && h <= 24){
            hora = h;
        }
        if (m >= 0 && m <= 60){
            minuto = m;
        }
        if (s >= 0 && s <= 60){
            segundo = s;
        }
    }
	
	
	public void setHora(int x) {
        if (x >= 0 && x <= 24){
            hora = x;
        }
    }
	
	public int getHora(){
		return hora;
	}
	public void setMinuto(int x) {
        if (x >= 0 && x <= 60){
            minuto = x;
        }
    }

	public int getMinuto(){
		return minuto;
	}
	public void setSegundo(int x) {
        if (x >= 0 && x <= 60){
            segundo = x;
        }
    }
	public int getSegundo(){
		return segundo;
	}
}
