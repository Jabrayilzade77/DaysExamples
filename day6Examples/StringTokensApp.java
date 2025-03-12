import java.util.Scanner;

public class StringTokensApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] tokens = s.trim().split("[^A-Za-z]+");

        if(s.trim().isEmpty()) {
            System.out.println(0);
        }
        else{
            System.out.println(tokens.length);
            for(String token : tokens) {{
                System.out.println(token);}
            }
        }

    }
}
