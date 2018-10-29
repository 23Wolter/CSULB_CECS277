import java.util.PriorityQueue;

public class Test {

    public static void main(String[] args) {

        Person p1 = new Person("Sam", "Smith");
        Person p2 = new Person("Charlie", "Black");
        Person p3 = new Person("Betty", "Brown");
        Person p4 = new Person("Jessica", "Stewart");
        Person p5 = new Person("John", "Friday");
        Person p6 = new Person("Frank", "Foley");

        PriorityQueue<Person> pq = new PriorityQueue<>();
        pq.add(p1);
        pq.add(p2);
        pq.add(p3);
        pq.add(p4);
        pq.add(p5);
        pq.add(p6);

        System.out.println("Printing");
        for(Person p: pq) {
            System.out.println(p);
        }

        System.out.println("");

        System.out.println("Polling");
        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

    }
}
