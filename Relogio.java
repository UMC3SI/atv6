
/**
 * @author @vasconceloscaio Caio Vasconcelos <11211101570@alunos.umc.br>
 * @author @Parthur15 Arthur Pires <11211101539@alunos.umc.br>
 */
public class Relogio {

    private int hora;
    private int minuto;
    private int segundo;

    // construtor #1
    public Relogio() {
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    // construtor #2
    public Relogio(int h) {
        if (h >= 0 && h <= 24) {
            hora = h;
            minuto = 0;
            segundo = 0;
        }

    }

    // construtor #3
    public Relogio(int h, int m) {
        if (h >= 0 && h <= 24 && m >= 0 && m <= 60) {
            hora = h;
            minuto = m;
            segundo = 0;
        }

    }

    // construtor #4
    public Relogio(int h, int m, int s) {
        if (h >= 0 && h <= 24 && m >= 0 && m <= 60 && s >= 0 && s <= 60) {
            hora = h;
            minuto = m;
            segundo = s;
        }

    }

    // metodo de acesso
    public void setHora(int x) {
        if (x >= 0 && x <= 24) {
            hora = x;
        } else {
            System.out.println("Hora Inválida");
        }
    }

    public int getHora() {

        return hora;
    }

    public void setMinuto(int x) {
        if (x >= 0 && x <= 60) {
            minuto = x;
        } else {
            System.out.println("Minuto Inválido");
        }
    }

    public int getMinuto() {

        return minuto;
    }

    public void setSegundo(int x) {
        if (x >= 0 && x <= 60) {
            segundo = x;
        } else {
            System.out.println("Segundo Inválido");
        }
    }

    public int getSegundo() {

        return segundo;
    }

}
// final da classe Relogio
