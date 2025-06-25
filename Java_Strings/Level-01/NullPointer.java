package Java_Strings.Level-01;

public class NullPointer {

    public static void causeNullPointer() {
        String text = null;
        System.out.println(text.length()); 
    }

    public static void handleNullPointer() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException!");
        }
    }

    public static void main(String[] args) {
        handleNullPointer();
    }
}
