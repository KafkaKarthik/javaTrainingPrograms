public class Program19 {
/*Write a program to - (Use appropriate String methods)
Correct the spelling mistake from “Davi Beckham” to “David Beckham”
Correct the number of goals scored by Lionel Messi from 400 to 579*/

    public static void main(String[] args) {
        String originalName = "Davi Beckham";
        String correctedName = originalName.replace("Davi", "David");

        System.out.println("Original name: " + originalName);
        System.out.println("Corrected name: " + correctedName);

        int originalGoal = 400;
        System.out.println("Original goal: " + originalGoal);

        originalGoal = 579;
        System.out.println("Corrected goal: " + originalGoal);

    }
}
