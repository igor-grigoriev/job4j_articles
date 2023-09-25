package ru.job4j.articles.service;

import ru.job4j.articles.model.Article;
import ru.job4j.articles.model.Word;
import ru.job4j.articles.store.Store;

public interface ArticleService {
    void generate(Store<Word> wordStore, int count, Store<Article> articleStore);
}
