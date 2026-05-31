package br.edu.atitus.pedro_rizzotto.zoo_digital.animais;

import br.edu.atitus.pedro_rizzotto.zoo_digital.especies.Reptil;
import br.edu.atitus.pedro_rizzotto.zoo_digital.comportamentos.Predacao;

public class Cobra extends Reptil implements Predacao {

    public Cobra(String nome, Integer idade) {
        super(nome, idade, "Escamas lisas");
    }

    @Override
    public void comer() {
        this.comer("ratos");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está sibilando");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está caçando ratos");
    }
}