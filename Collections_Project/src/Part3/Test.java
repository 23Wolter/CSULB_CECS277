package Part3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {

        System.out.println("*** Constructor testing ***");
        System.out.println("* Testing Team class with ArrayList as argument");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");

        Team team = new Team(arrayList);
        System.out.println(team);

        System.out.println("");
        System.out.println("* Testing Team class with LinkedList as argument");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Foo");
        linkedList.add("Bar");

        Team team2 = new Team(linkedList);
        System.out.println(team2);

        System.out.println("");
        System.out.println("");

        System.out.println("*** Method testing ***");
        System.out.println("* Testing getArrayListItems");
        System.out.println("ArrayList team: " + team.getArrayListItems());
        System.out.println("LinkedList team: " + team2.getArrayListItems());

        System.out.println("");
        System.out.println("* Testing getLinkedListItems");
        System.out.println("ArrayList team: " + team.getLinkedListItems());
        System.out.println("LinkedList team: " + team2.getLinkedListItems());

    }
}
