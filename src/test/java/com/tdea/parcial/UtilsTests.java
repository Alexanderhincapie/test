package com.tdea.parcial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilsTests {

    @Test
    public void ShouldReturMorning() {

        int hora = 9;
        Assertions.assertEquals("Morning", Utils.getTimeOfDay(hora));
    }

    @Test
    public void ShouldReturAfternoon() {

        int hora = 15;
        Assertions.assertEquals("Afternoon", Utils.getTimeOfDay(hora));
    }
    @Test
    public void ShouldReturEvening() {

        int hora = 23;
        Assertions.assertEquals("Evening", Utils.getTimeOfDay(hora));
    }
    @Test
    public void ShouldReturInvalidHour() {

        int hora = 28;
        Assertions.assertEquals("Invalid hour", Utils.getTimeOfDay(hora));
    }
}
