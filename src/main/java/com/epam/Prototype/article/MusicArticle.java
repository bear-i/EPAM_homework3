package com.epam.Prototype.article;

public class MusicArticle extends Article {
    private String musicStyle;

    MusicArticle(){

    }

    public MusicArticle(int id, String description, int length, String author, String musicStyle) {
        super(id, description, length, author);
        this.musicStyle = musicStyle;
    }

    MusicArticle(MusicArticle target){
        super(target);
        this.musicStyle = target.musicStyle;
    }

    public String getMusicStyle() {
        return musicStyle;
    }

    public void setMusicStyle(String musicStyle) {
        this.musicStyle = musicStyle;
    }

    @Override
    public Article clone() {
        return new MusicArticle(this);
    }

    @Override
    public String toString() {
        return super.getDescription() + ", " + super.getLength() + " pages, author: " + super.getAuthor() + ", subject: "
        + musicStyle;
    }
}
