package dev.rinaldo.datahora;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

/**
 * JAVA 8 - API de Data e Hora (Duration)
 * 
 * @author RinaldoDev
 */
public class DataHoraJava8_Duration {

  public static void main(String[] args) {

    Duration ofDays = Duration.ofDays(2);
    System.out.println(ofDays);
    
    Duration ofHours = Duration.ofHours(1);
    System.out.println(ofHours);
    
    Duration ofMinutes = Duration.ofMinutes(500);
    System.out.println(ofMinutes);
    
    Duration ofSeconds = Duration.ofSeconds(10, 5000);
    System.out.println(ofSeconds);

    LocalTime ltNow = LocalTime.now();
    LocalTime lt = LocalTime.of(11, 10, 01);
    Duration between = Duration.between(ltNow, lt);
    System.out.println(between);
    
    Duration plusMillis = between.plusMillis(500);
    System.out.println(plusMillis);
    
    LocalDate ld = LocalDate.of(1990, Month.AUGUST, 6);
    LocalDate ld2 = ld.plusWeeks(2).plusDays(1).minusMonths(1);    
    Duration between2 = Duration.between(ld, ld2);
    System.out.println(between2);
  }
  
}

//YouTube:  RinaldoDev
//Twitter:  @rinaldodev
//GitHub:   rinaldodev
//Facebook: rinaldo.dev
//LinkedIn: rinaldodev
//Blog:     rinaldo.dev