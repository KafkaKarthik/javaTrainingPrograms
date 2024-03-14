public class Program21 {
/*Write a program to replace the - (Use appropriate String methods)
Original name from “Liverpool” to “Liverpool Football Club”
Original name from “City” to “Manchester City”*/

    public static void main(String[] args) {
        String club1 = "Liverpool";
        String club1Updated = club1.replace("Liverpool", "Liverpool Football Club");

        System.out.println("Original name: " + club1);
        System.out.println("Corrected name: " + club1Updated);

            String club2 = "City";
            String club2Updated = club2.replace("City", "Manchester City");

            System.out.println("Original name: " + club2);
            System.out.println("Corrected name: " + club2Updated);
    }
}
