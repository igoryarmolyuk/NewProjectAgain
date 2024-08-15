package collabs.src;

public class Main {
    public static void main(String[] args) {
        printHello(10);
    }
    public static int printHello(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Hello Team!");
        }
        return count;
    }
}