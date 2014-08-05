
import java.util.HashMap;
import utfpr.dainf.if62c.pratica.Jogador;



/**
 * IF62C Fundamentos de Programação 2
 * Exercício de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica61 {

    public static void main(String[] args) {
        HashMap<String, Jogador> time1 = new HashMap<>();
        HashMap<String, Jogador> time2 = new HashMap<>();

        time1.put("Lateral", new Jogador(4, "Ciclano"));
        time1.put("Goleiro", new Jogador(1, "Fulano"));
        time1.put("Atacante", new Jogador(10, "Beltrano"));

        time2.put("Atacante", new Jogador(10, "Mário"));
        time2.put("Goleiro", new Jogador(1, "João"));
        time2.put("Lateral", new Jogador(7, "José"));

        String format = "%-20s %-20s %-20s";
        System.out.println(String.format(format, "Posição", "Time 1", "Time 2"));
        for (String posicao: time1.keySet()) {
            Jogador j1 = time1.get(posicao);
            Jogador j2 = time2.get(posicao);
            System.out.println(String.format(format, posicao, j1, j2));
        }
    }
}
