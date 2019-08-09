package dev.rinaldo.datahora;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * JAVA 8 - API de Data e Hora (Period)
 * 
 * @author RinaldoDev
 */
public class DataHoraJava8_Period {

  public static void main(String[] args) {
    
    Period of = Period.of(1, 5, 0);
    System.out.println(of);

    Period cincoAnos = Period.ofYears(5);
    System.out.println(cincoAnos);
    
    LocalDate ld = LocalDate.of(1990, Month.AUGUST, 6);
    LocalDate ld2 = ld.plusWeeks(2).plusDays(1).plusMonths(1);
    Period between = Period.between(ld, ld2);
    System.out.println(between);
    
    Period between2 = between.plusDays(10);
    System.out.println(between2);

    Period until = ld.until(ld2);
    System.out.println(until);

    LocalDate plus = ld.plus(cincoAnos);
    System.out.println(plus);
    
//    LocalTime ltNow = LocalTime.now();
//    LocalTime plus2 = ltNow.plus(cincoAnos);
//    System.out.println(plus2);
    
    LocalDate nascimento = LocalDate.of(1990, Month.AUGUST, 6);
    LocalDate hoje = LocalDate.now();
    Period between3 = Period.between(nascimento, hoje);
    System.out.println(between3);
  }
  
}

//YouTube:  RinaldoDev
//Twitter:  @rinaldodev
//GitHub:   rinaldodev
//Facebook: rinaldo.dev
//LinkedIn: rinaldodev
//Blog:     rinaldo.dev