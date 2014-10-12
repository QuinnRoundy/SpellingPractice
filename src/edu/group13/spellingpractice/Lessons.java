package edu.group13.spelling;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Quinn on 10/8/2014.
 */
public class Lessons extends ArrayList<WordList> {
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Lessons()
    {
        super();
    }

    public Lessons(int initialCapacity, String name)
    {
        super(initialCapacity);
        this.name = name;
    }

    public Lessons(String name)
    {
        this.name = name;
    }

    public Lessons(Collection<? extends WordList> c, String name)
    {
        super(c);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lessons{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lessons)) return false;
        if (!super.equals(o)) return false;

        Lessons wordLists = (Lessons) o;

        if (name != null ? !name.equals(wordLists.name) : wordLists.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public void load(String filename) {}
    public void load(File fd) {}

    public void save(String filename) {}
    public void save(File fd) {}


}
