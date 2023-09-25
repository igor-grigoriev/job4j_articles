package ru.job4j.articles.service.generator;

import ru.job4j.articles.model.Article;
import ru.job4j.articles.model.Word;

import java.util.List;

public interface ArticleGenerator {
    Article generate(List<Word> words);
}
