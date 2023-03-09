package view;
import java.util.Scanner;

public class View {
    private Scanner in;

    public View() {
        in = new Scanner(System.in);
    }

    public int readInt(String message) {
        System.out.println(message);
        int number = Integer.parseInt(in.nextLine());
        return number;
    }

    public float readFloat(String message) {
        System.out.println(message);
        float number = Float.parseFloat(in.nextLine());
        return number;
    }

    public String readString(String message) {
        System.out.println(message);
        String text = in.nextLine();
        return text;
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}