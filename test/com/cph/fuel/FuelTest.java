package com.cph.fuel;

import com.cph.fuel.client.FuelService;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class FuelTest {

    FuelService fuelService = new FuelService();

    @Test
    public void receiveFuelRequestTest(String flightNo, String size, int stall, int groupId)
    {

    }

    @Test
    public void fillingUpFlightTest(String flightNo, String size, String stall)
    {
        size = "small";
        LocalDateTime timeStamp = LocalDateTime.now();
        fuelService.fillUpWithFuel(size, stall, flightNo);
        assertEquals(timeStamp.plusSeconds(10), LocalDateTime.now());
    }

    @Test
    public void setFlightToFullFuelTest(String flightNo)
    {

    }
}
