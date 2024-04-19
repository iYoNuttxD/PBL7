package PBL7;
import PBL7.Baixavel;
import PBL7.ItemBibliotecaDigital;

public class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel {

    private int duracaoEmMinutos;
    private String formatoVideo;

    public VideoDigital(String titulo, String autor, int duracaoEmMinutos, String formatoVideo) {
        super(titulo, autor);
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.formatoVideo = formatoVideo;
    }

    @Override
    public String descricao() {
        return "Vídeo Digital: " + getTitulo() + " - Autor: " + getAutor() + " - Duração: " +
                duracaoEmMinutos + " minutos - Formato: " + formatoVideo;
    }

    @Override
    public void baixar() {
        System.out.println("Baixando vídeo digital: " + getTitulo());
    }

    @Override
    public void visualizar() {
        System.out.println("Visualizando vídeo digital: " + getTitulo());
    }
}