package br.edu.atitus.pedro_rizzotto.zoo_digital.animais;

import br.edu.atitus.pedro_rizzotto.zoo_digital.especies.Peixe;
import br.edu.atitus.pedro_rizzotto.zoo_digital.comportamentos.Nado;

public class PeixeEspada extends Peixe implements Nado {

    public PeixeEspada(String nome, int idade) {
        super(nome, idade, "Salgada");
    }

    @Override
    public void comer() {
        this.comer("peixes menores");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está fazendo bolhas");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando rapidamente no mar");
    }
}