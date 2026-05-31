package br.edu.atitus.pedro_rizzotto.zoo_digital.animais;

import br.edu.atitus.pedro_rizzotto.zoo_digital.especies.Reptil;
import br.edu.atitus.pedro_rizzotto.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.pedro_rizzotto.zoo_digital.comportamentos.Nado;
import br.edu.atitus.pedro_rizzotto.zoo_digital.comportamentos.Predacao;

public class Crocodilo extends Reptil implements Corrida, Nado, Predacao {

    public Crocodilo(String nome, Integer idade) {
        super(nome, idade, "Escamas duras");
    }

    @Override
    public void comer() {
        this.comer("peixes");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está grunhindo");
    }

    @Override
    public void correr() {
        IO.println(getNome() + " está correndo lentamente fora da água");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando no rio");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está caçando na beira do rio");
    }
}