public class Bicicleta {
    private String cor;
    private String tipo;
    private int tamanhoQuadro;
    private int marchas;

    public Bicicleta(String cor, String tipo, int tamanhoQuadro, int marchas) {
        this.cor = cor;
        this.tipo = tipo;
        this.tamanhoQuadro = tamanhoQuadro;
        this.marchas = marchas;
    }

    public void pedalar() {
        System.out.println("Pedalando a bicicleta " + tipo + ".");
    }

    public void frear() {
        System.out.println("Bicicleta freando.");
    }

    public void virar(String direcao) {
        System.out.println("Virando para " + direcao + ".");
    }

    public void parar() {
        System.out.println("Bicicleta parada.");
    }
}