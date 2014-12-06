package utfpr.ct.dainf.if62c.pratica;

import java.util.HashMap;

/**
 * IF62C Fundamentos de Programação 2
 * Exercício de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Time {
    private final HashMap<String, Jogador> jogadores = new HashMap();

    public Time() {
    }

    public HashMap<String, Jogador> getJogadores() {
        return jogadores;
    }
    
    public void addJogador(String posicao, Jogador jogador) {
        jogadores.put(posicao, jogador);
    }
    
}
