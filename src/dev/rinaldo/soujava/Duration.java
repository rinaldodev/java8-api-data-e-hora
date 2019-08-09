package dev.rinaldo.soujava;
import java.time.LocalTime;

public class Duration {

  // Java 8 - API de Data e Hora
  
  public static void main(String[] args) {

    // Duration - espaço de tempo entre horas - armazenado em horas/min/seg
    
    java.time.Duration d = java.time.Duration.ofHours(2);
    
    System.out.println(d);
    
    java.time.LocalTime lt = java.time.LocalTime.now();
    System.out.println(lt);
    System.out.println(lt.plus(d));
    
    LocalTime lt2 = java.time.LocalTime.of(11, 30, 20);
    
    java.time.Duration between = java.time.Duration.between(lt2, lt);
    System.out.println(between);
    
    java.time.LocalDate ld = java.time.LocalDate.of(1990, 13, 6);
    ld.plus(between); // lança exceção
  }
  
}

// YouTube:  RinaldoDev
// Twitter:  @rinaldodev
// LinkedIn: rinaldodev
// Facebook: rinaldo.dev
// Blog:     rinaldo.dev
