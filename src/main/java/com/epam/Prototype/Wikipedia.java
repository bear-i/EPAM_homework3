package com.epam.Prototype;

import com.epam.Prototype.article.Article;

import java.util.HashMap;
import java.util.Map;

public class Wikipedia {
    private static Map<Integer, Article> articles = new HashMap<>();

    public static Map<Integer, Article> getArticles() {
        return articles;
    }

    public static  void setArticles(Map<Integer, Article> articles) {
        Wikipedia.articles = articles;
    }

    public static  void addArticle(int id, Article article){
        articles.put(id, article);
    }

    public static Article getArticleById(int id){
        return articles.get(id);
    }

    public static Article askForCopy(int id){
        return articles.get(id).clone();
    }
}
