public class Vulcan implements AlienCellPhone {
    @Override
    public void alienSendText(String fileName) {
        System.out.println("vulcan sending message to file: " + fileName);
    }

    @Override
    public void alienReadText(String fileName) {
        System.out.println("vulcan reading message from file: " + fileName);
    }

    @Override
    public String translateText(String fileName) {
        return "vulcan translating message from file: " + fileName;
    }
}
