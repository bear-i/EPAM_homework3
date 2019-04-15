package com.epam.Prototype.article;

public class PictureArticle extends Article {
    private String pictureName;

    PictureArticle(){

    }

    public PictureArticle(int id, String description, int length, String author, String pictureName) {
        super(id, description, length, author);
        this.pictureName = pictureName;
    }

    PictureArticle(PictureArticle target){
        super(target);
        this.pictureName = target.pictureName;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    @Override
    public String toString() {
        return super.getDescription() + ", " + super.getLength() + " pages, author: " + super.getAuthor() + ", subject: "
                + pictureName;
    }

    @Override
    public Article clone() {
        return new PictureArticle(this);
    }
}
