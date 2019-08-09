package dev.rinaldo.soujava;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateTimeFormatter_ {

  // Java 8 - API de Data e Hora
  
  public static void main(String[] args) {

    LocalDateTime now = LocalDateTime.now();
    
    DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
    String format = now.format(formatter);
    String format2 = formatter.format(now);
    
    System.out.println(format);
    System.out.println(format2);
    
    DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    System.out.println(now.format(ofPattern));

    LocalDateTime ldt = LocalDateTime.parse("06 08 1990 - 11 40 00", ofPattern);
    System.out.println(ldt);
  }
  
}

// YouTube:  RinaldoDev
// Twitter:  @rinaldodev
// LinkedIn: rinaldodev
// Facebook: rinaldo.dev
// Blog:     rinaldo.dev
