package br.edu.atitus.pedro_rizzotto.zoo_digital.animais;

import br.edu.atitus.pedro_rizzotto.zoo_digital.especies.Peixe;
import br.edu.atitus.pedro_rizzotto.zoo_digital.comportamentos.Nado;

public class Salmao extends Peixe implements Nado {

    public Salmao(String nome, int idade) {
        super(nome, idade, "Doce e Salgada");
    }

    @Override
    public void comer() {
        this.comer("pequenos crustáceos");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está borbulhando");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando contra a correnteza");
    }
}