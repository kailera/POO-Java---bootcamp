import br.com.domain.Conteudo;
import br.com.domain.Curso;
import br.com.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitle("Curso Java");
        curso1.setDescription("Curso Java Iniciante");
        curso1.setWorkload(10);

        Curso curso2 = new Curso();
        curso2.setTitle("JS Curso");
        curso2.setDescription("Curso Iniciante de JavaScript");
        curso2.setWorkload(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitle("Mentoria Java");
        mentoria1.setDescription("Mentoria de Java para inciantes");
        mentoria1.setDate(LocalDate.now());

        Conteudo conteudo = new Curso();

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}
