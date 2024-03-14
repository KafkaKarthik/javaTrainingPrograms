import java.util.Random;
public class Program15 {
        public static String generateRandomAlphanumeric(int length) {
            String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            StringBuilder sb = new StringBuilder(length);
            Random random = new Random();
            for (int i = 0; i < length; i++) {
                int randomIndex = random.nextInt(characters.length());
                sb.append(characters.charAt(randomIndex));
            }
            return sb.toString();
        }

        public static void main(String[] args) {
            int length = 10; // Change the length as needed
            String randomAlphanumeric = generateRandomAlphanumeric(length);
            System.out.println("Random Alphanumeric Number: " + randomAlphanumeric);
        }
    }
