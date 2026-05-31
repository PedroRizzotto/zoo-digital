package br.edu.atitus.pedro_rizzotto.zoo_digital.animais;

import br.edu.atitus.pedro_rizzotto.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.pedro_rizzotto.zoo_digital.comportamentos.Voo;
import br.edu.atitus.pedro_rizzotto.zoo_digital.especies.Ave;

public class Tucano extends Ave implements Corrida, Voo {

    public Tucano(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void comer() {
        this.comer("figo");
    }

    
    @Override
    public void emitirSom() {
        IO.println(getNome() + " está fazendo croac-croac");
    }
    

    @Override
    public void voar() {
        IO.println(this.getNome() + " está voando de uma árvore pra outra!");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo todo estranho!");
    }

}
