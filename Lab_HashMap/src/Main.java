import java.security.Key;
import java.util.*;

/**
 * Created by josep on 24-10-2018.
 */
public class Main {

    public static void main(String[] args){

        Map<String,ArrayList<String>> friendsWith = new HashMap<>();

        ArrayList<String> friendsOfSue = new ArrayList<>();

        friendsOfSue.add("Bob");
        friendsOfSue.add("Jose");
        friendsOfSue.add("Alex");
        friendsOfSue.add("Cathy");

        friendsWith.put("Sue", friendsOfSue);

        ArrayList<String> friendsOfCathy = new ArrayList<>();

        friendsOfCathy.add("Bob");
        friendsOfCathy.add("Alex");

        friendsWith.put("Cathy", friendsOfCathy);

        ArrayList<String> friendsOfBob = new ArrayList<>();
        friendsOfBob.add("Alex");
        friendsOfBob.add("Jose");
        friendsOfBob.add("Jerry");

        friendsWith.put("Bob", friendsOfBob);

        Scanner in = new Scanner(System.in);
        System.out.println("Which person would you like to know the friends of??");
        boolean foundName = false;

        Set<String> newSet = friendsWith.keySet();
        String next = in.next();
        for(String key : newSet){
            if(next.equals(key)){

                System.out.println(friendsWith.get(key));
                foundName = true;
                break;
            }
        }
        if(!foundName){
            System.out.println("The system does not know this person!");

        }





    }
}
