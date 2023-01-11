package br.com.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DevTest {

    Curso curso;
    Mentoria mentoria;
    Bootcamp bootcamp;
    Dev dev;



    @BeforeEach
    void setUp() {
        curso = new Curso();
        mentoria = new Mentoria();
        bootcamp = new Bootcamp();
        dev = new Dev();

        curso.setWorkload(1);

        bootcamp.getContents().add(curso);
        bootcamp.getContents().add(mentoria);

        dev.subscribeBootcamp(bootcamp);
        dev.progress();
        dev.progress();
    }

    @Test
    @DisplayName("Calc xp based on courses and mentors finished")
    void calcFullXp() {
        assertEquals(40, dev.calcFullXp());
    }
}