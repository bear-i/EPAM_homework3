package com.epam.Prototype;

import com.epam.Prototype.article.Article;
import com.epam.Prototype.article.MusicArticle;
import com.epam.Prototype.article.PictureArticle;
import com.epam.Prototype.article.ProgrammingLanguageArticle;

public class Main {
    public static void main(String[] args) {
        init();

        Article copyRockArticle = Wikipedia.askForCopy(101);
        copyRockArticle.setDescription("Article about rock history 1980-2000");

        System.out.println(Wikipedia.getArticleById(101));
        System.out.println(copyRockArticle);
    }

    public static void init(){
        Article prototypeRockArticle = new MusicArticle(101, "Article about rock history", 5,
                "Cooper", "Rock");
        Article prototypeJavaArticle = new ProgrammingLanguageArticle(102, "Article about programming language",
                10, "Coul", "Java");
        Article prototypeMonaLisaArticle = new PictureArticle(103, "Article about painting", 4, "Jack",
                "Mona Lisa");

        Wikipedia.addArticle(101, prototypeRockArticle);
        Wikipedia.addArticle(102, prototypeJavaArticle);
        Wikipedia.addArticle(103, prototypeMonaLisaArticle);
    }
}
