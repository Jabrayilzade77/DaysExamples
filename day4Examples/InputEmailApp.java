import java.util.Scanner;

public class InputEmailApp {

    public static String getInputEmail(String email) {
        return email.substring(0, email.indexOf('@'));
    }

    public static int getSizeEmailName(String name) {
        return name.length();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String email = scan.nextLine();
        String name = getInputEmail(email);
        int size = getSizeEmailName(name);

        System.out.println(name);
        System.out.println(size);
    }
}
