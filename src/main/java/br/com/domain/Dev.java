package br.com.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

// polimorphism -> set and linked hashset

public class Dev {
    private String name;
    private Set<Conteudo> subscribedContent = new LinkedHashSet<>();
    private Set<Conteudo> completedContent = new LinkedHashSet<>( );

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Conteudo> getSubscribedContent() {
        return subscribedContent;
    }

    public void setSubscribedContent(Set<Conteudo> subscribedContent) {
        this.subscribedContent = subscribedContent;
    }

    public Set<Conteudo> getCompletedContent() {
        return completedContent;
    }

    public void setCompletedContent(Set<Conteudo> completedContent) {
        this.completedContent = completedContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(subscribedContent, dev.subscribedContent) && Objects.equals(completedContent, dev.completedContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContent, completedContent);
    }

    public void subscribeBootcamp(Bootcamp bootcamp){
        this.subscribedContent.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevs().add(this);
    }

    public void progress (){
        Optional<Conteudo> content = this.subscribedContent.stream().findFirst();
        if (content.isPresent()){
            this.completedContent.add(content.get());
            this.subscribedContent.remove(content.get());
        }else{
            System.err.println("You aren't subscribed to any content.");
        }
    }

    public double calcFullXp(){
        return this.completedContent.stream()
                .mapToDouble(content -> content.calcXp())
                .sum();
    }
}
