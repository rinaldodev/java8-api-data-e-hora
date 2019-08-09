package dev.rinaldo.soujava;
import java.time.temporal.ChronoUnit;

public class LocalDate {

  // Java 8 - API de Data e Hora
  
  public static void main(String[] args) {

    // LocalDate - armazena apenas Data
    System.out.println(java.time.LocalDate.now());
    
    java.time.LocalDate ld = java.time.LocalDate.of(1990, 8, 6);
    System.out.println(ld);
    
    java.time.LocalDate ld1 = ld.plusMonths(30);
    java.time.LocalDate ld2 = ld.plus(1, ChronoUnit.DAYS);
    
    System.out.println(ld1);
    System.out.println(ld2);
    
    java.time.LocalDate ld3 = java.time.LocalDate.of(1990, 13, 6);
    
  }
  
}

// YouTube:  RinaldoDev
// Twitter:  @rinaldodev
// LinkedIn: rinaldodev
// Facebook: rinaldo.dev
// Blog:     rinaldo.dev
