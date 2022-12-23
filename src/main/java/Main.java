import br.com.domain.*;

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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Orange Tech");
        bootcamp.setDescription("Bootcamp Java Developer");
        bootcamp.getContents().add(curso1);
        bootcamp.getContents().add(curso2);
        bootcamp.getContents().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setName("Jhon");
        dev1.subscribeBootcamp(bootcamp);
        System.out.println(dev1.getName() + " Subscribed Content: " + dev1.getSubscribedContent());
        dev1.progress();
        System.out.println(dev1.getName() + " Subscribed Content: " + dev1.getSubscribedContent());
        System.out.println("Earned XP: " + dev1.calcFullXp());
        System.out.println(dev1.getName() + " Completed Content: "+ dev1.getCompletedContent() + "\n");

        Dev dev2 = new Dev();
        dev2.setName("Mary");
        dev2.subscribeBootcamp(bootcamp);
        System.out.println(dev2.getName() + " Subscribed Content: " + dev2.getSubscribedContent());
        dev2.progress();
        System.out.println(dev2.getName() + " Subscribed Content: " + dev2.getSubscribedContent());
        System.out.println("Earned XP: " + dev2.calcFullXp());
        dev2.progress();
        dev2.progress();
        System.out.println("Earned XP: " + dev2.calcFullXp());
        System.out.println(dev2.getName() + " Completed Content: "+ dev2.getCompletedContent()+ "\n");
    }
}
