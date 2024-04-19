package PBL7;

public class Main {
    public static void main(String[] args) {

        Ebook ebook1 = new Ebook("O Senhor dos Anéis", "J.R.R. Tolkien", 1178, "EPUB");
        Ebook ebook2 = new Ebook("Java para Iniciantes", "Fulano de Tal", 450, "PDF");
        VideoDigital video1 = new VideoDigital("Introdução ao Python", "Beltrano de Tal",
                30, "MP4");
        VideoDigital video2 = new VideoDigital("Desenvolvimento Web com HTML e CSS", "Ciclano de Tal",
                120, "AVI");

        System.out.println("**Ebooks:**");
        System.out.println(ebook1.descricao());
        System.out.println(ebook2.descricao());

        System.out.println("\n**Vídeos Digitais:**");
        System.out.println(video1.descricao());
        System.out.println(video2.descricao());

        System.out.println("\n\n**Simulando download de ebooks:**");
        ebook1.baixar();
        ebook2.baixar();

        System.out.println("\n\n**Simulando visualização de vídeos digitais:**");
        video1.visualizar();
        video2.visualizar();
    }
}

