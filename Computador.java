public class Computador {
    private String processador;
    private int memoriaRam;
    private String sistemaOperacional;
    private int armazenamento;

    public Computador(String processador, int memoriaRam, String sistemaOperacional, int armazenamento) {
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.sistemaOperacional = sistemaOperacional;
        this.armazenamento = armazenamento;
    }

    public void ligar() {
        System.out.println("Computador ligado.");
    }

    public void processarDados() {
        System.out.println("Processando dados...");
    }

    public void salvarArquivo(String nomeArquivo) {
        System.out.println("Arquivo '" + nomeArquivo + "' salvo com sucesso.");
    }

    public void executarPrograma(String programa) {
        System.out.println("Executando o programa: " + programa);
    }
}