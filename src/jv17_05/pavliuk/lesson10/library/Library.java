package jv17_05.pavliuk.lesson10.library;

import java.util.ArrayList;
import java.util.List;

public class Library implements Composite {
    private List<Composite> readers;

    public Library(List<Composite> readers) {
        this.readers = readers;
    }

    public Library() {
        readers = new ArrayList<>();
    }

    public void addReader(LibraryReader reader) {
        readers.add(reader);
    }

    @Override
    public List<Composite> getChild() {
        return readers;
    }

    @Override
    public String toString() {
        return "Библиотека UIT:";
    }
}
