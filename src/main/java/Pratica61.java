
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.Time;

/**
 * IF62C Fundamentos de Programação 2
 * Exercício de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica61 {

    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time();
        
        time1.addJogador("Lateral", new Jogador(4, "Ciclano"));
        time1.addJogador("Goleiro", new Jogador(1, "Fulano"));
        time1.addJogador("Atacante", new Jogador(10, "Beltrano"));

        time2.addJogador("Atacante", new Jogador(15, "Mário"));
        time2.addJogador("Goleiro", new Jogador(1, "João"));
        time2.addJogador("Lateral", new Jogador(7, "José"));

        String format = "%-20s %-20s %-20s";
        System.out.println(String.format(format, "Posição", "Time 1", "Time 2"));
        for (String posicao: time1.getJogadores().keySet()) {
            Jogador j1 = time1.getJogadores().get(posicao);
            Jogador j2 = time2.getJogadores().get(posicao);
            System.out.println(String.format(format, posicao, j1, j2));
        }
    }
}
