public class Livro {
    private String titulo;
    private String autor;
    private int paginas;
    private String genero;

    public Livro(String titulo, String autor, int paginas, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.genero = genero;
    }

    public void abrir() {
        System.out.println("Abrindo o livro '" + titulo + "'.");
    }

    public void ler() {
        System.out.println("Lendo o livro '" + titulo + "'.");
    }

    public void marcarPagina(int pagina) {
        System.out.println("Página " + pagina + " marcada no livro '" + titulo + "'.");
    }

    public void fechar() {
        System.out.println("Fechando o livro '" + titulo + "'.");
    }
}