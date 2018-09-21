import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {

   public static void main(String[] args) {
      testDataAtual();

      testSetandoData();
   }

   public static void testDataAtual() {
      LocalDate date = LocalDate.now();
      System.out.println("Data atual: " + date);
   }

   public static void testSetandoData() {
      //LocalDate date = LocalDate.now()
      //   .withDayOfMonth(25).withMonth(1).withYear(2099);
      LocalDate date = LocalDate.of(2099, Month.JANUARY, 25);
      System.out.println("Data setada: " + date);
   }
}