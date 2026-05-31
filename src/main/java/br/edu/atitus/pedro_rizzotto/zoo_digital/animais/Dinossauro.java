package br.edu.atitus.pedro_rizzotto.zoo_digital.animais;

import br.edu.atitus.pedro_rizzotto.zoo_digital.especies.Reptil;
import br.edu.atitus.pedro_rizzotto.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.pedro_rizzotto.zoo_digital.comportamentos.Predacao;

public class Dinossauro extends Reptil implements Corrida, Predacao {

    public Dinossauro(String nome, Integer idade) {
        super(nome, idade, "Escamas grossas");
    }

    @Override
    public void comer() {
        this.comer("carne");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está rugindo");
    }

    @Override
    public void correr() {
        IO.println(getNome() + " está correndo e fazendo o chão tremer");
    }

    @Override
    public void cacar() {
        IO.println(getNome() + " está caçando outros dinossauros");
    }
}