package com.epam.Prototype.article;

public class ProgrammingLanguageArticle extends Article{
    private String programmingLanguage;

    ProgrammingLanguageArticle(){

    }

    public ProgrammingLanguageArticle(int id, String description, int length, String author, String programmingLanguage) {
        super(id, description, length, author);
        this.programmingLanguage = programmingLanguage;
    }

    ProgrammingLanguageArticle(ProgrammingLanguageArticle target){
        super(target);
        this.programmingLanguage = target.programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return super.getDescription() + ", " + super.getLength() + " pages, author: " + super.getAuthor() + ", subject: "
                + programmingLanguage;
    }

    @Override
    public Article clone() {
        return new ProgrammingLanguageArticle(this);
    }
}
