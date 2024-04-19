package PBL7;

public class Ebook extends ItemBibliotecaDigital implements Baixavel {

    private int numeroPaginas;
    private String formato;

    public Ebook(String titulo, String autor, int numeroPaginas, String formato) {
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
        this.formato = formato;
    }

    @Override
    public String descricao() {
        return "Ebook: " + getTitulo() + " - Autor: " + getAutor() + " - Número de páginas: " + numeroPaginas +
                " - Formato: " + formato;
    }

    @Override
    public void baixar() {
        System.out.println("Baixando ebook: " + getTitulo());
    }
}