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
public class Relogio {

    private int hora;
    private int minuto;
    private int segundo;

//    Construtor 1:
    public Relogio() {
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

//    Construtor 2:
    public Relogio(int h) {
        
        if (0 <= h & h <= 24) {
            hora = h;
        }
        else{
            System.out.println("Valor inválido para 'horas'!\n Será automaticamente preenchido com um valor 'outlier'.\n");
            hora = 99;
        }
        
        minuto = 0;
        segundo = 0;
    }

//    Construtor 3:
    public Relogio(int h, int m) {
        
        if (0 <= h & h <= 24) {
            hora = h;
        }
        else{
            System.out.println("Valor inválido para 'horas'!\n Será automaticamente preenchido com um valor 'outlier'.\n");
            hora = 99;
        }
        
        if (0 <= m & m <= 60) {
            minuto = m;
        }
        else{
            System.out.println("Valor inválido para 'minutos'!\n Será automaticamente preenchido com um valor 'outlier'.\n");
            minuto = 99;
        }
        
        segundo = 0;
    }

//    Construtor 4:
    public Relogio(int h, int m, int s) {
        
        if (0 <= h & h <= 24) {
            hora = h;
        }
        else{
            System.out.println("Valor inválido para 'horas'!\n Será automaticamente preenchido com um valor 'outlier'.\n");
            hora = 99;
        }
        
        if (0 <= m & m <= 60) {
            minuto = m;
        }
        else{
            System.out.println("Valor inválido para 'minutos'!\n Será automaticamente preenchido com um valor 'outlier'.\n");
            minuto = 99;
        }
        
        if (0 <= s & s <= 60) {
            segundo = s;
        }
        else{
            System.out.println("Valor inválido para 'segundos'!\n Será automaticamente preenchido com um valor 'outlier'.\n");
            segundo = 99;
        }
    }

//    Métodos de acesso:
    public void SetHora(int x) {

        if (0 <= x & x <= 24) {
            hora = x;
        }
        else{
            System.out.println("Valor inválido para 'horas'!\n Será automaticamente preenchido com um valor 'outlier'.\n");
            hora = 99;
        }
        
    }

    public int GetHora() {
        return hora;
    }

    public void SetMinuto(int x) {
        
        if (0 <= x & x <= 60) {
            minuto = x;
        }
        else{
            System.out.println("Valor inválido para 'minutos'!\n Será automaticamente preenchido com um valor 'outlier'.\n");
            minuto = 99;
        }
    }

    public int GetMinuto() {
        return minuto;
    }

    public void SetSegundo(int x) {
        
        if (0 <= x & x <= 60) {
            segundo = x;
        }
        else{
            System.out.println("Valor inválido para 'segundos'!\n Será automaticamente preenchido com um valor 'outlier'.\n");
            segundo = 99;
        }
    }

    public int GetSegundo() {
        return segundo;
    }
}
//Fim da classe Relógio.
