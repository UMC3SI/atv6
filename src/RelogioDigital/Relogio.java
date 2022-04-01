package RelogioDigital;

/**
 *@author Gustavo de Almeida Monteiro - 11211100223@alunos.umc.br
 * @author Julia Araujo Calazans - 11211102258@alunos.umc.br
 */
public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;
    
    //construtor 1
    public Relogio(){
        hora = 0;
        minuto = 0;
        segundo = 0;
    }
    
    //construtor 2
    public Relogio(int h){
        hora = h;
        minuto = 0;
        segundo = 0;
        arrumarHorario();
    }
    
    //construtor 3
    public Relogio(int h, int m){
        hora = h;
        minuto = m;
        segundo = 0;
        arrumarHorario();
    }
    
    //construtor 4
    public Relogio(int h, int m, int s){
        hora = h;
        minuto = m;
        segundo = s;
        arrumarHorario();
    }
    
    public void setHora(int x){
        hora =  x;
        arrumarHorario();
    }
    
    public void setMinuto(int x){
        minuto =  x;
        arrumarHorario();
    }
    
    public void setSegundo(int x){
        segundo = x;
        arrumarHorario();
    }
    
    public int getHora(){
        return hora;
    }
    
    public int getMinuto(){
        return minuto;
    }
    
    public int getSegundo(){
        return segundo;
    }

    private void arrumarHorario(){
        if(segundo >= 60){
            minuto += (segundo / 60);
            segundo %= 60;
        }
        if(minuto >= 60){
            hora += (minuto / 60);
            minuto %= 60;
        }
        if(hora >= 24){
            hora %= 24;
        }
    }
}
