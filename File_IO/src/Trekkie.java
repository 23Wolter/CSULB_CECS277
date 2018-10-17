public class Trekkie implements EarthCellPhone {
    @Override
    public void sendMessage(String languageType, String fileName) {
        System.out.println("trekkie sending message in language: " + languageType + " to file: " + fileName);
    }

    @Override
    public void readMessage(String fileName) {
        System.out.println("trekkie reading message from file: " + fileName);
    }
}
