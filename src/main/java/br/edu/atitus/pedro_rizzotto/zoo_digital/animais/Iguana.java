package br.edu.atitus.pedro_rizzotto.zoo_digital.animais;

import br.edu.atitus.pedro_rizzotto.zoo_digital.especies.Reptil;
import br.edu.atitus.pedro_rizzotto.zoo_digital.comportamentos.Corrida;

public class Iguana extends Reptil implements Corrida {

    public Iguana(String nome, Integer idade) {
        super(nome, idade, "Escamas verdes");
    }

    @Override
    public void comer() {
        this.comer("folhas");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está fazendo um som baixo");
    }

    @Override
    public void correr() {
        IO.println(getNome() + " está correndo entre as pedras");
    }
}