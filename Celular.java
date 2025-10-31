public class Celular {
    private String marca;
    private String modelo;
    private double tamanhoTela;
    private int bateria;

    public Celular(String marca, String modelo, double tamanhoTela, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoTela = tamanhoTela;
        this.bateria = bateria;
    }

    public void ligar() {
        System.out.println("O celular " + modelo + " está ligado.");
    }

    public void tirarFoto() {
        System.out.println("Foto tirada com o celular " + modelo + ".");
    }

    public void enviarMensagem(String mensagem) {
        System.out.println("Mensagem enviada: " + mensagem);
    }

    public void reproduzirMusica(String musica) {
        System.out.println("Tocando música: " + musica);
    }
}