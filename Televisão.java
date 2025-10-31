public class Televisao {
    private String marca;
    private int tamanho;
    private String resolucao;
    private String tipoTela;

    public Televisao(String marca, int tamanho, String resolucao, String tipoTela) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.resolucao = resolucao;
        this.tipoTela = tipoTela;
    }

    public void ligar() {
        System.out.println("Televisão " + marca + " ligada.");
    }

    public void mudarCanal(int canal) {
        System.out.println("Canal alterado para " + canal + ".");
    }

    public void aumentarVolume() {
        System.out.println("Aumentando o volume...");
    }

    public void desligar() {
        System.out.println("Televisão desligada.");
    }
}