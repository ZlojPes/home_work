package jv17_05.pavliuk.lesson10.library;

import java.util.List;

public interface Composite {
    public List<Composite> getChild();

    public int getInventoryNumber();
}
