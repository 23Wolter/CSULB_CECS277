package Part3; /**
 * Josephine and Oliver
 * November 12, 2018
 * Purpose: Create a team object containing either an ArrayList or a LinkedList
 * Inputs: An ArrayList or LinkedList of scavenger hunt items
 * Outputs: An ArrayList or LinkedList of scavenger hunt items
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class Team {

    //fields for storing collections
    private ArrayList<String> arrayListItems;
    private LinkedList<String> linkedListItems;

    /**
     * Multiargument constructor - initializes collection
     * @param items - ArrayList for storing scavenger hunt items
     */
    public Team(ArrayList<String> items) {
        arrayListItems = new ArrayList<>(items);
    }

    /**
     * Multiargument constructor - initializes collection
     * @param items - LinkedList for storing scavenger hunt items
     */
    public Team(LinkedList<String> items) {
        linkedListItems = new LinkedList<>(items);
    }


    /**
     * @return ArrayList of scavenger hunt items
     */
    public ArrayList<String> getArrayListItems() {
        return arrayListItems;
    }

    /**
     * @return LinkedList of scavenger hunt items
     */
    public LinkedList<String> getLinkedListItems() {
        return linkedListItems;
    }

    public String toString() {
        return "This is a  with ArrayList: " + arrayListItems + "\nand LinkedList: " + linkedListItems;
    }
}
