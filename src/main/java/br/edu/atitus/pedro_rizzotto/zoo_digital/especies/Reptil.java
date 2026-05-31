package br.edu.atitus.pedro_rizzotto.zoo_digital.especies;

public abstract class Reptil extends Animal {

    private String tipoEscama;

    public Reptil(String nome, Integer idade, String tipoEscama) {
        super(nome, "Réptil", idade);
        this.tipoEscama = tipoEscama;
    }

    public String getTipoEscama() {
        return tipoEscama;
    }

    public void setTipoEscama(String tipoEscama) {
        this.tipoEscama = tipoEscama;
    }

    public void trocarPele() {
        IO.println(this.getNome() + " está trocando de pele.");
    }
}