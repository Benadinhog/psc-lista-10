public class Cachorro {
    private String nome;
    private String raca;
    private int idade;
    private String corPelo;

    public Cachorro(String nome, String raca, int idade, String corPelo) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.corPelo = corPelo;
    }

    public void latir() {
        System.out.println(nome + " está latindo: Au Au!");
    }

    public void correr() {
        System.out.println(nome + " está correndo.");
    }

    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }
}