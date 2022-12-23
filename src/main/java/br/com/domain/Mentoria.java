package br.com.domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    LocalDate date;

    public Mentoria() {
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public double calcXp() {
        return DEFAULT_XP + 20;
    }
    @Override
    public String toString() {
        return "Mentoria{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }

}
