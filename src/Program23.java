public class Program23 {

    /*Write a program to Catch any exception in java.
    Use try catch and finally statements*/

    public static void main(String[] args) {
        try {
            int[] array = new int[3];
            System.out.println(array[4]);
        } catch (Exception e) {

            System.out.println("An exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}