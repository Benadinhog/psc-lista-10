public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private String placa;

    public Carro(String marca, String modelo, String cor, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
    }

    public void ligar() {
        System.out.println("O carro " + modelo + " está ligado.");
    }

    public void acelerar() {
        System.out.println("O carro " + modelo + " está acelerando.");
    }

    public void frear() {
        System.out.println("O carro " + modelo + " está freando.");
    }

    public void buzinar() {
        System.out.println("Biiip! Biiip!");
    }
}