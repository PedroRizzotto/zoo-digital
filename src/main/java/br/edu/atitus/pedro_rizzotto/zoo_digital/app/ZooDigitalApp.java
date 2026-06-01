package br.edu.atitus.pedro_rizzotto.zoo_digital.app;

import java.util.ArrayList;
import java.util.List;

import br.edu.atitus.pedro_rizzotto.zoo_digital.animais.Cachorro;
import br.edu.atitus.pedro_rizzotto.zoo_digital.animais.Capivara;
import br.edu.atitus.pedro_rizzotto.zoo_digital.animais.Cobra;
import br.edu.atitus.pedro_rizzotto.zoo_digital.animais.Crocodilo;
import br.edu.atitus.pedro_rizzotto.zoo_digital.animais.Dinossauro;
import br.edu.atitus.pedro_rizzotto.zoo_digital.animais.Gato;
import br.edu.atitus.pedro_rizzotto.zoo_digital.animais.Golfinho;
import br.edu.atitus.pedro_rizzotto.zoo_digital.animais.Iguana;
import br.edu.atitus.pedro_rizzotto.zoo_digital.animais.Panda;
import br.edu.atitus.pedro_rizzotto.zoo_digital.animais.Pato;
import br.edu.atitus.pedro_rizzotto.zoo_digital.animais.PeixeEspada;
import br.edu.atitus.pedro_rizzotto.zoo_digital.animais.PeixeMorcego;
import br.edu.atitus.pedro_rizzotto.zoo_digital.animais.PicaPau;
import br.edu.atitus.pedro_rizzotto.zoo_digital.animais.Pinguim;
import br.edu.atitus.pedro_rizzotto.zoo_digital.animais.Salmao;
import br.edu.atitus.pedro_rizzotto.zoo_digital.animais.Traira;
import br.edu.atitus.pedro_rizzotto.zoo_digital.animais.Tucano;
import br.edu.atitus.pedro_rizzotto.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.pedro_rizzotto.zoo_digital.comportamentos.Nado;
import br.edu.atitus.pedro_rizzotto.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.pedro_rizzotto.zoo_digital.comportamentos.Voo;
import br.edu.atitus.pedro_rizzotto.zoo_digital.especies.Animal;

public class ZooDigitalApp {

    private static List<Animal> animais = new ArrayList<>();

    public static void main(String[] args) {
        int opcao = -1;

        while (opcao != 0) {
            IO.println("Zoo Digital");
            IO.println("1 - Cadastrar Animal");
            IO.println("2 - Listar Todos Animais");
            IO.println("3 - Listar Animais Corredores");
            IO.println("4 - Listar Animais Nadadores");
            IO.println("5 - Listar Animais Voadores");
            IO.println("6 - Listar Animais Predadores");
            IO.println("7 - Exibir Total de Animais");
            IO.println("0 - Sair");

            opcao = Input.scanInt("Opção: ");

            if (opcao == 1) {
                cadastrarAnimal();
            } else if (opcao == 2) {
                listarTodosAnimais();
            } else if (opcao == 3) {
                listarAnimaisCorredores();
            } else if (opcao == 4) {
                listarAnimaisNadadores();
            } else if (opcao == 5) {
                listarAnimaisVoadores();
            } else if (opcao == 6) {
                listarAnimaisPredadores();
            } else if (opcao == 7) {
                exibirTotalAnimais();
            } else if (opcao == 0) {
                IO.println("Saindo...");
            } else {
                IO.println("Opção inválida.");
            }

            IO.println("");
        }
    }

    private static void cadastrarAnimal() {
        IO.println("1 - Cachorro");
        IO.println("2 - Gato");
        IO.println("3 - Golfinho");
        IO.println("4 - Capivara");
        IO.println("5 - Panda");
        IO.println("6 - Pato");
        IO.println("7 - Pinguim");
        IO.println("8 - Tucano");
        IO.println("9 - Pica-pau");
        IO.println("10 - Peixe-morcego");
        IO.println("11 - Traíra");
        IO.println("12 - Salmão");
        IO.println("13 - Peixe-espada");
        IO.println("14 - Cobra");
        IO.println("15 - Iguana");
        IO.println("16 - Dinossauro");
        IO.println("17 - Crocodilo");

        int tipo = Input.scanInt("Tipo: ");

        if (tipo < 1 || tipo > 17) {
            IO.println("Tipo inválido.");
            return;
        }

        String nome = Input.scanString("Nome: ");
        int idade = Input.scanInt("Idade: ");

        Animal animal = null;

        if (tipo == 1) {
            animal = new Cachorro(nome, idade);
        } else if (tipo == 2) {
            animal = new Gato(nome, idade);
        } else if (tipo == 3) {
            animal = new Golfinho(nome, idade);
        } else if (tipo == 4) {
            animal = new Capivara(nome, idade);
        } else if (tipo == 5) {
            animal = new Panda(nome, idade);
        } else if (tipo == 6) {
            String corPenas = Input.scanString("Cor das penas: ");
            animal = new Pato(nome, idade, corPenas);
        } else if (tipo == 7) {
            String corPenas = Input.scanString("Cor das penas: ");
            animal = new Pinguim(nome, idade, corPenas);
        } else if (tipo == 8) {
            String corPenas = Input.scanString("Cor das penas: ");
            animal = new Tucano(nome, idade, corPenas);
        } else if (tipo == 9) {
            String corPenas = Input.scanString("Cor das penas: ");
            animal = new PicaPau(nome, idade, corPenas);
        } else if (tipo == 10) {
            animal = new PeixeMorcego(nome, idade);
        } else if (tipo == 11) {
            animal = new Traira(nome, idade);
        } else if (tipo == 12) {
            animal = new Salmao(nome, idade);
        } else if (tipo == 13) {
            animal = new PeixeEspada(nome, idade);
        } else if (tipo == 14) {
            animal = new Cobra(nome, idade);
        } else if (tipo == 15) {
            animal = new Iguana(nome, idade);
        } else if (tipo == 16) {
            animal = new Dinossauro(nome, idade);
        } else if (tipo == 17) {
            animal = new Crocodilo(nome, idade);
        }

        animais.add(animal);
        IO.println("Animal cadastrado.");
    }

    private static void listarTodosAnimais() {
        if (animais.size() == 0) {
            IO.println("Nenhum animal cadastrado.");
            return;
        }

        for (Animal animal : animais) {
            mostrarAnimal(animal);
            animal.emitirSom();
            animal.comer();
            IO.println("");
        }
    }

    private static void listarAnimaisCorredores() {
        boolean encontrou = false;

        for (Animal animal : animais) {
            if (animal instanceof Corrida) {
                mostrarAnimal(animal);

                Corrida corredor = (Corrida) animal;
                corredor.correr();

                encontrou = true;
                IO.println("");
            }
        }

        if (!encontrou) {
            IO.println("Nenhum animal corredor cadastrado.");
        }
    }

    private static void listarAnimaisNadadores() {
        boolean encontrou = false;

        for (Animal animal : animais) {
            if (animal instanceof Nado) {
                mostrarAnimal(animal);

                Nado nadador = (Nado) animal;
                nadador.nadar();

                encontrou = true;
                IO.println("");
            }
        }

        if (!encontrou) {
            IO.println("Nenhum animal nadador cadastrado.");
        }
    }

    private static void listarAnimaisVoadores() {
        boolean encontrou = false;

        for (Animal animal : animais) {
            if (animal instanceof Voo) {
                mostrarAnimal(animal);

                Voo voador = (Voo) animal;
                voador.voar();

                encontrou = true;
                IO.println("");
            }
        }

        if (!encontrou) {
            IO.println("Nenhum animal voador cadastrado.");
        }
    }

    private static void listarAnimaisPredadores() {
        boolean encontrou = false;

        for (Animal animal : animais) {
            if (animal instanceof Predacao) {
                mostrarAnimal(animal);

                Predacao predador = (Predacao) animal;
                predador.cacar();

                encontrou = true;
                IO.println("");
            }
        }

        if (!encontrou) {
            IO.println("Nenhum animal predador cadastrado.");
        }
    }

    private static void exibirTotalAnimais() {
        IO.println("Total de animais criados: " + Animal.getContador());
        IO.println("Total de animais na lista: " + animais.size());
    }

    private static void mostrarAnimal(Animal animal) {
        IO.println("Nome: " + animal.getNome());
        IO.println("Idade: " + animal.getIdade());
        IO.println("Espécie: " + animal.getEspecie());
    }
}