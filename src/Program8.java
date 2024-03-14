public class Program8 {

    public static void main(String[] args) {
        String a = "welcome to Java";

        int spaceCount = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        System.out.println("Number of spaces: " + spaceCount);


        String[] words = a.split(" ");


        System.out.println("First word: " + words[0]);

    }
}
