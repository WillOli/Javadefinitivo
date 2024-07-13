public class Ebook extends Livro{
    private String formato;

    public Ebook(String titulo, String autor, int anoPublicacao, String formato) {
        super(titulo, autor, anoPublicacao);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void mostrarDetalhes() {
        System.out.println("Ebook: "
                + getTitulo()
                + " por " + getAutor()
                + ", publicado em  "
                + getAnoPublicacao()
                + ", formato "
                + formato
                + ";");
    }

}
