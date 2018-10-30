import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapIterator implements Iterator {

    private TreeMap<String, Integer> treeMap;

    public TreeMapIterator() {

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
