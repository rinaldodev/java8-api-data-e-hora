package dev.rinaldo.soujava;
import java.time.LocalDate;
public class Period {

  // Java 8 - API de Data e Hora
  
  public static void main(String[] args) {

    // Period - um espaço de tempo entre datas
    
    java.time.Period p = java.time.Period.of(1, 2, 5);
    
    System.out.println(p);
    
    java.time.LocalDate now = java.time.LocalDate.now();
    java.time.LocalDate dn = java.time.LocalDate.of(1990, 8, 6);
   
    java.time.Period between = java.time.Period.between(dn, now);
    System.out.println(between);
    
    LocalDate ld = dn.plus(between).plus(between);
    System.out.println(ld);
    
    java.time.LocalTime lt = java.time.LocalTime.now();
    lt.plus(between); // exceção em runtime
  }
  
}

// YouTube:  RinaldoDev
// Twitter:  @rinaldodev
// LinkedIn: rinaldodev
// Facebook: rinaldo.dev
// Blog:     rinaldo.dev
