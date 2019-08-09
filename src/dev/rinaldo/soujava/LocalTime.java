package dev.rinaldo.soujava;
import java.util.Locale;

public class LocalTime {

  // Java 8 - API de Data e Hora
  
  public static void main(String[] args) {

    // LocalTime - armazena apenas hora
    System.out.println(java.time.LocalTime.now());
    java.time.LocalTime lt = java.time.LocalTime.of(11, 30, 20);
    System.out.println(lt);
    
    java.time.LocalTime localTime = lt.plusHours(13);
    
    System.out.println(localTime);
    
  }
  
}

// YouTube:  RinaldoDev
// Twitter:  @rinaldodev
// LinkedIn: rinaldodev
// Facebook: rinaldo.dev
// Blog:     rinaldo.dev
