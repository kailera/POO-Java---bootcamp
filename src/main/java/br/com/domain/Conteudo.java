package br.com.domain;

// abstract -> doesnt instance
public abstract class Conteudo {
    protected static final double DEFAULT_XP = 10;

    private String title;
    private String description;

    public abstract double calcXp();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
