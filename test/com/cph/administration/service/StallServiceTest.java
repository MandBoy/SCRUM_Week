package com.cph.administration.service;

import com.cph.AirportTestProgram.administration.service.StallService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StallServiceTest {

    private static StallService stallService;

    @BeforeAll
    static void init() {
        stallService = new StallService();
    }

    @Test
    public void assignStallTest() {
        //1-3 is the range of plane sizes
        //assume that 0 and 4 will then fail
        assertNull(stallService.findAvailableStall(0));
        assertNull(stallService.findAvailableStall(4));

        //assert 1-3 to be available
        assertNotNull(stallService.findAvailableStall(1));
        assertNotNull(stallService.findAvailableStall(2));
        assertNotNull(stallService.findAvailableStall(3));
    }
}