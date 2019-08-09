package dev.rinaldo.soujava;
import java.time.ZoneId;
import java.util.Set;

public class ZonedDateTime {

  // Java 8 - API de Data e Hora
  
  public static void main(String[] args) {

    // ZonedDateTime - data + hora + fuso horário
    
    System.out.println(java.time.ZonedDateTime.now());
    
    java.time.LocalDate localDate = java.time.LocalDate.of(2018, 11, 3);
    java.time.LocalTime localTime = java.time.LocalTime.of(0, 0);
    
    java.time.ZonedDateTime zdt = 
        java.time.ZonedDateTime.of(localDate, localTime, ZoneId.of("America/Sao_Paulo"));
    
    System.out.println(zdt);
    
    java.time.ZonedDateTime zdt2 = zdt.plusHours(48);
    
    System.out.println(zdt2);
    
//    Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//    for (String string : availableZoneIds) {
//      System.out.println(string);
//    }
  }
  
}

// YouTube:  RinaldoDev
// Twitter:  @rinaldodev
// LinkedIn: rinaldodev
// Facebook: rinaldo.dev
// Blog:     rinaldo.dev
