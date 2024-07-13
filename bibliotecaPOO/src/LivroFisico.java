public class LivroFisico extends Livro{
    private int numPaginas;

    public LivroFisico(String titulo, String autor, int anoPublicacao, int numPaginas) {
        super(titulo, autor, anoPublicacao);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void mostrarDetalhes() {
        System.out.println("Livro fisico: "
                + getTitulo()
                + " por " + getAutor()
                + ", publicado em  "
                + getAnoPublicacao()
                + ", "
                + numPaginas
                + " páginas;");
    }
}
