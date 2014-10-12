package edu.group13.spelling;

import java.util.ArrayList;

/**
 * Created by Quinn on 10/8/2014.
 */
public class WordList extends ArrayList<String> {
    private String name;

    public WordList(int initialCapacity, String name) {
        super(initialCapacity);
        this.name = name;
    }

    public WordList(String name) {
        this.name = name;
    }

    public WordList(ArrayList<String> c, String name) {
        super(c);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
