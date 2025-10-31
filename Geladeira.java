public class Geladeira {
    private String marca;
    private int capacidade;
    private String cor;
    private String tipoPorta;

    public Geladeira(String marca, int capacidade, String cor, String tipoPorta) {
        this.marca = marca;
        this.capacidade = capacidade;
        this.cor = cor;
        this.tipoPorta = tipoPorta;
    }

    public void refrigerar() {
        System.out.println("Refrigerando os alimentos.");
    }

    public void congelar() {
        System.out.println("Congelando os alimentos.");
    }

    public void desligar() {
        System.out.println("Geladeira desligada.");
    }

    public void controlarTemperatura(int temperatura) {
        System.out.println("Temperatura ajustada para " + temperatura + "°C.");
    }
}