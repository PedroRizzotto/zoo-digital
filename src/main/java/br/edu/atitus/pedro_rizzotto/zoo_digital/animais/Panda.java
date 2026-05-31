package br.edu.atitus.pedro_rizzotto.zoo_digital.animais;

import br.edu.atitus.pedro_rizzotto.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.pedro_rizzotto.zoo_digital.comportamentos.Nado;
import br.edu.atitus.pedro_rizzotto.zoo_digital.especies.Mamifero;

public final class Panda extends Mamifero implements Corrida, Nado {
    public Panda(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        this.comer("bambu");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() +  " está grunhindo!");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está nadando no rio!");
    }
    
    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo lentamente!");
    }
}
