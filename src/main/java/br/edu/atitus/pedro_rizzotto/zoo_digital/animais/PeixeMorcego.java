package br.edu.atitus.pedro_rizzotto.zoo_digital.animais;

import br.edu.atitus.pedro_rizzotto.zoo_digital.especies.Peixe;
import br.edu.atitus.pedro_rizzotto.zoo_digital.comportamentos.Nado;

public class PeixeMorcego extends Peixe implements Nado {

    public PeixeMorcego(String nome, int idade) {
        super(nome, idade, "Salgada");
    }

    @Override
    public void comer() {
        this.comer("pesquenas algas");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está borbulhando");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando tranquilamente");
    }
    
    
}