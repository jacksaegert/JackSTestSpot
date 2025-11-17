public class App {
    public static void main(String[] args) throws Exception {
        Conductor Bobby = new Conductor("Bobby", 21, 3);
        Train express = new Train(90, 80, 10, 300, "Red", 70, Bobby);
        System.out.println(express.toString());
    }
}
