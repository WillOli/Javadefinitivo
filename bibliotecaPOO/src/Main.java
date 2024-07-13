public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        LivroFisico livroFisico = new LivroFisico("1984", "George Orwell", 1949, 328);
        Ebook ebook = new Ebook("Clean Code", "Robert C. Martin", 2000, "PDF");

        biblioteca.adicionarLivro(livroFisico);
        biblioteca.adicionarLivro(ebook);
        biblioteca.mostraLivros();
    }
}