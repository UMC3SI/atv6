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
public class Relogio {
    
    private int hora;
    private int minuto;
    private int segundo;
    
    //construtor #1
    public Relogio()
    {
    
        hora = 0;
        minuto = 0;
        segundo = 0;      
    }
    
    //construtor #2
    public Relogio(int h)
    {
    
        hora = h;
        minuto = 0;
        segundo = 0;
    }
    
   //construtor #3
    public Relogio(int h, int m)
    {
    
        hora = h;
        minuto = m;
        segundo = 0;
    }
    
    //construtor #4
    public Relogio(int h, int m, int s)
    {
    
        hora = h;
        minuto = m;
        segundo = s;
    }
    
    //metodos de acesso
    public void setHora(int x)
    {
        hora = x;
    }
    
    public int getHora()
    {
        return hora;
    }
    
    public void setMinuto(int x)
    {
        minuto = x;
    }
    
    public int getMinuto()
    {
        return minuto;
    }
    
    public void setSegundo(int x)
    {
        segundo = x;
    }
    
    public int getSegundo()
    {
        return segundo;
    }
}
//Final da classe Relogio
