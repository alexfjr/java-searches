import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodTest {

   public static void main(String[] args) {
      testPeriod();
   }

   public static void testPeriod() {
      LocalDate agora = LocalDate.now();
      LocalDate date = LocalDate.of(2099, Month.JANUARY, 25);

      Period period = Period.between(agora, date);
      System.out.println("Periodo: " + period);
   }
}