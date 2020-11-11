package com.callicoder.goparking.interaction.command;

import static org.junit.jupiter.api.Assertions.assertThrows;

import com.callicoder.goparking.exceptions.InvalidParameterException;
import com.callicoder.goparking.handler.ParkingLotCommandHandler;
import com.callicoder.goparking.interaction.commands.LeaveCommand;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LeaveCommandTest {
    private static ParkingLotCommandHandler parkingLotCommandHandler;
    private static LeaveCommand leaveCommand;

    @BeforeAll
    public static void createCommand() {
        parkingLotCommandHandler = new ParkingLotCommandHandler();
        leaveCommand = new LeaveCommand(parkingLotCommandHandler);
    }

    @Test
    public void executeWithNoArg_shouldThrowError() {
        String[] params = {};
        assertThrows(InvalidParameterException.class, () -> leaveCommand.execute(params));
    }

    @Test
    public void executeWithoutTwoArgs_shouldThrowError() {
        String[] params = { "Foo" };
        assertThrows(InvalidParameterException.class, () -> leaveCommand.execute(params));
    }

    @Test
    public void executeWithValidArgs_shouldWork() {
        String[] params = { "1" };
        Assertions.assertDoesNotThrow(() -> leaveCommand.execute(params));
    }
}
