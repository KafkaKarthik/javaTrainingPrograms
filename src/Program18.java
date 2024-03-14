public class Program18 {


/*Write a program to print – (Use appropriate String methods)
Only First name from “Sachin Tendulkar”
Only Second name from “Rahul Dravid”*/

    public static void main(String[] args) {
        String fullName1 = "Sachin Tendulkar";
        String fullName2 = "Rahul Dravid";

        String[] firstName1 = fullName1.split(" ");
        String[] firstName2 = fullName2.split(" ");

        System.out.println("First name from Sachin Tendulkar: " + firstName1[0]);
        System.out.println("Second name from Rahul Dravid: " + firstName2[1]);
    }
}

