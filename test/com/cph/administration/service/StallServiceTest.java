package com.cph.administration.service;

import com.cph.AirportTestProgram.administration.repository.AdminRepo;
import com.cph.AirportTestProgram.administration.service.StallService;
import com.cph.AirportTestProgram.models.Station;
import com.cph.AirportTestProgram.models.StationInfo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StallServiceTest {

    private static StallService stallService;

    @BeforeAll
    static void init() {
        stallService = new StallService();
    }

    @Test
    public void assignStallTest() {
        assertNotNull(stallService.findAvailableStall(1));
        assertNotNull(stallService.findAvailableStall(2));
        assertNotNull(stallService.findAvailableStall(3));
    }
}