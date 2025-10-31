public class Relogio {
    private String marca;
    private String tipo;
    private String cor;
    private String materialPulseira;

    public Relogio(String marca, String tipo, String cor, String materialPulseira) {
        this.marca = marca;
        this.tipo = tipo;
        this.cor = cor;
        this.materialPulseira = materialPulseira;
    }

    public void mostrarHora(String hora) {
        System.out.println("Hora atual: " + hora);
    }

    public void despertar() {
        System.out.println("Alarme tocando!");
    }

    public void cronometrar() {
        System.out.println("Cronômetro iniciado.");
    }

    public void ajustarHora(String novaHora) {
        System.out.println("Hora ajustada para: " + novaHora);
    }
}