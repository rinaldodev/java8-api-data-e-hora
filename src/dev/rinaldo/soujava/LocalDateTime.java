package dev.rinaldo.soujava;
public class LocalDateTime {

  // Java 8 - API de Data e Hora
  
  public static void main(String[] args) {

    // LocalDateTime - armazena data + hora
    System.out.println(java.time.LocalDateTime.now());
    
    java.time.LocalDate localDate = java.time.LocalDate.now();
    java.time.LocalTime localTime = java.time.LocalTime.now();
    java.time.LocalDateTime ldt = java.time.LocalDateTime.of(localDate, localTime);
    System.out.println(ldt);
    
    java.time.LocalDateTime ldt2 = ldt.plusHours(20);
    System.out.println(ldt2);
    
  }
  
}

// YouTube:  RinaldoDev
// Twitter:  @rinaldodev
// LinkedIn: rinaldodev
// Facebook: rinaldo.dev
// Blog:     rinaldo.dev
