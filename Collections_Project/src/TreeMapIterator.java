import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapIterator implements Iterator {

    private TreeMap<String, Integer> treeMap;
    private int index;

    public TreeMapIterator(TreeMap<String, Integer> treeMap) {
        this.treeMap = treeMap;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index >= treeMap.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        //return KEY or VALUE??
        index++;
        return null;
    }
}
