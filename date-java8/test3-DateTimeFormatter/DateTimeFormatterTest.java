import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest {

   public static void main(String[] args) {
      testFormat();
   }

   public static void testFormat() {
      LocalDate agora = LocalDate.now();
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      System.out.println("Data formatada: " + agora.format(formatter));
   }
}