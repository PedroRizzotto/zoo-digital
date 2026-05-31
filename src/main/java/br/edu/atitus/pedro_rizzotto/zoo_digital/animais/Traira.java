package br.edu.atitus.pedro_rizzotto.zoo_digital.animais;

import br.edu.atitus.pedro_rizzotto.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.pedro_rizzotto.zoo_digital.especies.Peixe;
import br.edu.atitus.pedro_rizzotto.zoo_digital.comportamentos.Nado;

public class Traira extends Peixe implements Nado, Predacao {

    public Traira(String nome, int idade) {
        super(nome, idade, "Doce");
    }

    @Override
    public void comer() {
        this.comer("lambaris");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está borbulhando");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando no rio");
    }

    @Override
    public void cacar() {
        IO.println(this.getNome() + " está caçando lambaris no rio!");
    }

}