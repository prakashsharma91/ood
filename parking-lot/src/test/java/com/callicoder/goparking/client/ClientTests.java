package com.callicoder.goparking.client;

import com.callicoder.goparking.handler.ParkingLotCommandHandler;
import com.callicoder.goparking.interaction.CommandFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ClientTests {
    private static CommandFactory commandFactory;

    @BeforeAll
    public static void setup() {
        ParkingLotCommandHandler parkingLotCommandHandler = new ParkingLotCommandHandler();
        commandFactory = CommandFactory.init(parkingLotCommandHandler);
    }

    @Test
    public void handleInput_shouldHandleInput() {
        Client client = new CLIClient(new BufferedReader(new StringReader("exit")), commandFactory);
        assertDoesNotThrow(() -> client.handleInput());
    }
}
