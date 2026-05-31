package br.edu.atitus.pedro_rizzotto.zoo_digital.animais;

import br.edu.atitus.pedro_rizzotto.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.pedro_rizzotto.zoo_digital.comportamentos.Nado;
import br.edu.atitus.pedro_rizzotto.zoo_digital.especies.Mamifero;

public final class Capivara extends Mamifero implements Corrida, Nado {
    public Capivara(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        this.comer("capim");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() +  " está fazendo o urro!");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está nadando pela selva!");
    }
    
    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo pelos mangues!");
    }
}
