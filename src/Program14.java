import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Program14 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        String currentDateAsString = getCurrentDateAsString();
        System.out.println("Current Date as String: " + currentDateAsString);
    }

    public static String getCurrentDateAsString() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return currentDate.format(formatter);
    }
}


