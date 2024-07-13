import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> acervo;

    public Biblioteca() {
        this.acervo = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
    }

    public void mostraLivros() {
        for(Livro livro : acervo) {
            livro.mostrarDetalhes();
        }
    }
}
