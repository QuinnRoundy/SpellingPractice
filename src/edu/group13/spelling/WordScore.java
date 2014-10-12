package edu.group13.spelling;

/**
 * Created by Quinn on 10/8/2014.
 */
public class WordScore  {

    private String word;
    private boolean wasCorrect;
    private int attemptsMade;

    public WordScore(String word, boolean wasCorrect, int attemptsMade) {
        this.word = word;
        this.wasCorrect = wasCorrect;
        this.attemptsMade = attemptsMade;
    }

    public WordScore(String word, boolean wasCorrect) {
        this.word = word;
        this.wasCorrect = wasCorrect;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public boolean isWasCorrect() {
        return wasCorrect;
    }

    public void setWasCorrect(boolean wasCorrect) {
        this.wasCorrect = wasCorrect;
    }

    public int getAttemptsMade() {
        return attemptsMade;
    }

    public void setAttemptsMade(int attemptsMade) {
        this.attemptsMade = attemptsMade;
    }

    @Override
    public String toString() {
        return "WordScore{" +
                "word='" + word + '\'' +
                ", wasCorrect=" + wasCorrect +
                ", attemptsMade=" + attemptsMade +
                '}';
    }
}
