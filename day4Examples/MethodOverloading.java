
public class MethodOverloading {

    public static void printCharArray(char[] arr){
       for(char c : arr){
           System.out.print(c);
       }
    }

    public static void main(String[] args) {
        printCharArray(new char[]{'Y','U','S','I','F'});

        String s = "alma,banan,portağal,üzüm";

        System.out.println(s.toUpperCase());
    }
}
