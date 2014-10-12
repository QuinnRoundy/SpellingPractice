package edu.group13.spelling;

import java.util.ArrayList;

/**
 * Created by Quinn on 10/8/2014.
 */
public class Student {
    private String name;
    private ArrayList<WordScore> scores;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<WordScore> getScores() {
        return scores;
    }

    public void addWord(String word, boolean isCorrect)
    {
        scores.add(new WordScore(word,isCorrect));
    }
}
