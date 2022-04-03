/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relogio;

/**
 *
 * @author bosch
 */
public class Relogio {

private int hora;
private int minuto;
private int segundo;



public Relogio() {
hora = 0;
minuto = 0;
segundo = 0;
}



public Relogio(int h) {
hora = h;
minuto = 0;
segundo = 0;
}



public Relogio(int h, int m) {
hora = h;
minuto = m;
segundo = 0;
}



public Relogio(int h, int m, int s) {



if (h >= 0 && h <= 24) {
hora = h;
minuto = m;
segundo = s;
} else {
System.out.println("impossivel tente novamente");
}
if (m >= 0 && m <= 60) {
hora = h;
minuto = m;
segundo = s;
} else {
System.out.println("impossivel tente novamente");
}
if (s >= 0 && s <=60) {
hora = h;
minuto = m;
segundo = s;
} else {
System.out.println("impossivel tente novamente");
}
}



public void setHora(int x) {
hora = x;
if(x>=0 && x<=24){}
else{System.out.println("impossivel tente novamente");}
}



public int getHora() {
return hora;
}



public void setMinuto(int x) {
minuto = x;
if(x>=0 && x<=60){}
else{System.out.println("impossivel tente novamente");}
}



public int getMinuto() {
return minuto;
}



public void setSegundo(int x) {
segundo = x;
if(x>=0 && x<=60){}
else{System.out.println("impossivel tente novamente");}
}



public int getSegundo() {
return segundo;
}

}
