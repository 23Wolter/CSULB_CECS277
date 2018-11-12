package Part3;

/**
 * Josephine and Oliver
 * November 12, 2018
 * Purpose: Load input from a scavenger hunt file into a LinkedList and loop through it
 * Inputs: A textfile containing a list of 100 scavenger hunt items
 * Outputs: The content of the LinkedList and the time it takes to loop
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListLoop {

    private static long time;

    //Main method to run the program
    public static void main(String[] args){

        //Creating LinkedList
        LinkedList<String> ll = new LinkedList<>();

        //Initializes the chosen file
        File inputFile = new File("scavengerItems.txt");

        try {
            //Reads from file
            Scanner in = new Scanner(inputFile);

            while(in.hasNext()){
                //Put every word from file into LinkedList
                ll.add(in.next());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(ll);


        System.out.println("traversing to the end of list");

        //Get current time in nanoseconds
        time = System.nanoTime();

        ListIterator iterator1 = ll.listIterator();
        while (iterator1.hasNext()) {
            iterator1.next();
        }
        System.out.println("end of list reached");
        long t = System.nanoTime() - time;
        System.out.println(t + " ns, " + t/1000000 + " ms");

        System.out.println("traversing from end to start of list");

        ListIterator iterator2 = ll.listIterator(ll.size());
        while(iterator2.hasPrevious()) {
            iterator2.previous();
        }
        System.out.println("start of list reached");

        //Get current time minus last timestamp
        time = System.nanoTime() - time;

        System.out.println(time + " ns, " + time/1000000 + " ms");

    }
}
