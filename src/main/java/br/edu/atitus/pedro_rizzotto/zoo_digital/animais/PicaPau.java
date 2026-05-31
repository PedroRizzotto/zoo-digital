package br.edu.atitus.pedro_rizzotto.zoo_digital.animais;

import br.edu.atitus.pedro_rizzotto.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.pedro_rizzotto.zoo_digital.comportamentos.Voo;
import br.edu.atitus.pedro_rizzotto.zoo_digital.especies.Ave;

public class PicaPau extends Ave implements Corrida, Voo {

    public PicaPau(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void comer() {
        this.comer("larvas");
    }

    
    @Override
    public void emitirSom() {
        IO.println(getNome() + " está fazendo toc-toc-toc no tronco da árvore");
    }
    

    @Override
    public void voar() {
        IO.println(this.getNome() + " está voando rapidamente entre as árvores!");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está se movimentando pelo chão de forma desajeitada!");
    }

}
