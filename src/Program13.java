public class Program13 {

    public static void  main(String args[]) {
        String a = "Welcome To Java";
        String reversed = reverseString(a);
        System.out.println("Original string: " + a);
        System.out.println("Reversed string: " + reversed);
    }
public static String reverseString(String a) {
    StringBuilder reversed = new StringBuilder();
    for (int i = a.length() - 1; i >= 0; i--) {
        reversed.append(a.charAt(i));
    }
    return reversed.toString();
}
}
