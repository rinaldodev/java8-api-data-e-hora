package dev.rinaldo.soujava;
public class Instant {

  // Java 8 - API de Data e Hora
  
  public static void main(String[] args) {

    // armazena data + hora com fuso horário UTC/GMT
    
    java.time.Instant now = java.time.Instant.now();
    System.out.println(now);
    
    java.time.Instant plus = now.plusSeconds(100);
    System.out.println(plus);
    
    System.out.println(java.time.Instant.ofEpochMilli(100000000000L));
    
  }
  
}

// YouTube:  RinaldoDev
// Twitter:  @rinaldodev
// LinkedIn: rinaldodev
// Facebook: rinaldo.dev
// Blog:     rinaldo.dev
