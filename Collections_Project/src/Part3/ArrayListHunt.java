package Part3; /**
 * Josephine and Oliver
 * November 12, 2018
 * Purpose: Create x number of teams and load a scavenger hunt list to each team in an ArrayList
 * Inputs: A textfile containing a list of 100 scavenger hunt items
 * Outputs: The time it takes to do load and search operations
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ArrayListHunt {

    private static long time;

    public static void main(String[] args) {

        //Creating ArrayList
        ArrayList<String> al = new ArrayList<>();

        //Initializes the chosen file
        File inputFile = new File("scavengerItems.txt");

        try {
            //Reads from file
            Scanner in = new Scanner(inputFile);
            while(in.hasNext()){
                //Put every word from file into ArrayList
                al.add(in.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(al);


        System.out.println("");


        //Read input from console
        Scanner input = new Scanner(System.in);
        System.out.println("How many teams will play? [input only number]");

        int userInput = 0;
        //If user inputs other than number, catch exception
        try {
            userInput = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input is not a number " + e);
        }

        //Create array of teams
        Team[] teams = new Team[userInput];

        //Get current time in nanoseconds
        time = System.nanoTime();

        //Instantiate new teams with collection and shuffle collection
        for(int i=0; i<userInput; i++) {
            teams[i] = new Team(al);
            Collections.shuffle(al);
        }

        //Get current time minus last timestamp
        time = System.nanoTime() - time;

        System.out.println(time + " ns, " + time/1000000 + " ms");

        //For each team print the collection
        for(int i=0; i<teams.length; i++) {
            System.out.println(teams[i].getArrayListItems());
        }


        System.out.println("");


        System.out.println("Which position to be used for retrieving? [only number]");
        userInput = 0;
        try {
            userInput = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input is not a number " + e);
        }


        //Get current time in nanoseconds
        time = System.nanoTime();

        //For each team get element at position of user input
        for(int i=0; i<teams.length; i++) {
            System.out.println(teams[i].getArrayListItems().get(userInput));
        }
        //Get current time minus last timestamp3
        time = System.nanoTime() - time;
        System.out.println(time + " ns, " + time/1000000 + " ms");


        System.out.println("");
        System.out.println("Inserting 'Gold Medal' in the given position");

        //Get current time in nanoseconds
        time = System.nanoTime();

        //For each team insert element at given position
        for(int i=0; i<teams.length; i++) {
            teams[i].getArrayListItems().add(userInput, "Gold Medal");
        }
        //Get current time minus last timestamp3
        time = System.nanoTime() - time;
        System.out.println(time + " ns, " + time/1000000 + " ms");

        for(int i=0; i<teams.length; i++) {
            //Print every collection
            System.out.println(teams[i].getArrayListItems());
        }


        System.out.println("");


        System.out.println("Find the element from the scavenger list at a random position");

        //Get current time in nanoseconds
        time = System.nanoTime();

        int rand = new Random().nextInt(100); //Get a random number between [0-99]
        System.out.println("Random number: " + rand);

        String element = al.get(rand); //Get element at that position
        System.out.println("Element to look for: " + element);

        for(int i=0; i<teams.length; i++) {
            //Get the position of the given element in each team collection
            int index = teams[i].getArrayListItems().indexOf(element);

            if(index >= 0) { //check if element exists in collection
                //Print out element and position
                System.out.println(teams[i].getArrayListItems().get(index) + " is at position " + index);
            }
        }

        //Get current time minus last timestamp3
        time = System.nanoTime() - time;
        System.out.println(time + " ns, " + time/1000000 + " ms");
    }

}
