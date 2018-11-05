public class MementoClient {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("Lion");
        originator.setAge(10);

        Memento memento = originator.createMemento();
        Caretaker caretaker = new Caretaker();
        caretaker.addMemento(memento);

        originator.setState("Tiger");
        originator.setAge(2);

        originator.setState("Horse");
        originator.setAge(16);
        memento = originator.createMemento();
        caretaker.addMemento(memento);

        originator.setState("Elephant");
        originator.setAge(50);

        System.out.println("Originator Current State and age: " + originator.getState() + ", " + originator.getAge());

        System.out.println("Originator restoring to previous state and age...");
        memento = caretaker.getMemento(1);
        originator.setMemento(memento);

        System.out.println("Originator Current State and age: " + originator.getState() + ", " + originator.getAge());

        System.out.println("Again restoring to previous state and age...");
        memento = caretaker.getMemento(0);
        originator.setMemento(memento);
        System.out.println("Originator Current State and age: " + originator.getState() + ", " + originator.getAge());
    }
}
