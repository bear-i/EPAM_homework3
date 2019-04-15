package com.epam.Prototype.article;

import com.epam.Prototype.Prototype;

public abstract class Article implements Prototype {
    private int id;
    private String description;
    private int length;
    private String author;

    Article(){

    }

    public Article(int id, String description, int length, String author) {
        this.description = description;
        this.length = length;
        this.author = author;
    }

    Article(Article target){
        if(target!=null){
            this.description = target.description;
            this.length = target.length;
            this.author = target.author;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract Article clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        return getId() == article.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }
}
