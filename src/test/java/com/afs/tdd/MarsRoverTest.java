package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MarsRoverTest {

    List<Command> batchCommand = new ArrayList<>();

    @Test
    void should_change_to_location_0_1_North_when_executeCommand_given_0_0_North_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals(1 , currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH , currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_West_when_executeCommand_given_0_0_North_and_command_Turn_Left(){
        //Given
        Location initialLocation = new Location(0,0,Direction.NORTH);
        Command givenCommand = Command.TURN_LEFT;
        MarsRover marsRover = new MarsRover(initialLocation);
        //When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        //Then
        Assertions.assertEquals(0,currentLocation.getX());
        Assertions.assertEquals(0,currentLocation.getY());
        Assertions.assertEquals(Direction.WEST,currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_East_when_executeCommand_given_0_0_North_and_command_Turn_Right(){
        //Given
        Location initialLocation = new Location(0,0,Direction.NORTH);
        Command givenCommand = Command.TURN_RIGHT;
        MarsRover marsRover = new MarsRover(initialLocation);
        //When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        //Then
        Assertions.assertEquals(0,currentLocation.getX());
        Assertions.assertEquals(0,currentLocation.getY());
        Assertions.assertEquals(Direction.EAST,currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_negative_1_South_when_executeCommand_given_0_0_South_and_command_Move() {
        //Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);
        //When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        //Then
        Assertions.assertEquals(0,currentLocation.getX());
        Assertions.assertEquals(-1,currentLocation.getY());
        Assertions.assertEquals(Direction.SOUTH,currentLocation.getDirection());
    }
    @Test
    void should_change_to_location_0_0_East_when_executeCommand_given_0_0_South_and_command_Turn_Left(){
        //Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        Command givenCommand = Command.TURN_LEFT;
        MarsRover marsRover = new MarsRover(initialLocation);
        //When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        //Then
        Assertions.assertEquals(0,currentLocation.getX());
        Assertions.assertEquals(0,currentLocation.getY());
        Assertions.assertEquals(Direction.EAST,currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_West_when_executeCommand_given_0_0_South_and_command_Turn_Right(){
        //Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        Command givenCommand = Command.TURN_RIGHT;
        MarsRover marsRover = new MarsRover(initialLocation);
        //When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        //Then
        Assertions.assertEquals(0,currentLocation.getX());
        Assertions.assertEquals(0,currentLocation.getY());
        Assertions.assertEquals(Direction.WEST,currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_1_0_East_when_executeCommand_given_0_0_East_and_command_Move() {
        //Given
        Location initialLocation = new Location(0, 0, Direction.EAST);
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);
        //When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        //Then
        Assertions.assertEquals(1,currentLocation.getX());
        Assertions.assertEquals(0,currentLocation.getY());
        Assertions.assertEquals(Direction.EAST,currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_North_when_executeCommand_given_0_0_East_and_command_Turn_Left(){
        //Given
        Location initialLocation = new Location(0, 0, Direction.EAST);
        Command givenCommand = Command.TURN_LEFT;
        MarsRover marsRover = new MarsRover(initialLocation);
        //When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        //Then
        Assertions.assertEquals(0,currentLocation.getX());
        Assertions.assertEquals(0,currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH,currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_South_when_executeCommand_given_0_0_East_and_command_Turn_Right(){
        //Given
        Location initialLocation = new Location(0, 0, Direction.EAST);
        Command givenCommand = Command.TURN_RIGHT;
        MarsRover marsRover = new MarsRover(initialLocation);
        //When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        //Then
        Assertions.assertEquals(0,currentLocation.getX());
        Assertions.assertEquals(0,currentLocation.getY());
        Assertions.assertEquals(Direction.SOUTH,currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_negative_1_0_West_when_executeCommand_given_0_0_West_and_command_Move() {
        //Given
        Location initialLocation = new Location(0, 0, Direction.WEST);
        Command givenCommand = Command.MOVE;
        MarsRover marsRover = new MarsRover(initialLocation);
        //When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        //Then
        Assertions.assertEquals(-1,currentLocation.getX());
        Assertions.assertEquals(0,currentLocation.getY());
        Assertions.assertEquals(Direction.WEST,currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_South_when_executeCommand_given_0_0_West_and_command_Turn_Left(){
        //Given
        Location initialLocation = new Location(0, 0, Direction.WEST);
        Command givenCommand = Command.TURN_LEFT;
        MarsRover marsRover = new MarsRover(initialLocation);
        //When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        //Then
        Assertions.assertEquals(0,currentLocation.getX());
        Assertions.assertEquals(0,currentLocation.getY());
        Assertions.assertEquals(Direction.SOUTH,currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_North_when_executeCommand_given_0_0_West_and_command_Turn_Right(){
        //Given
        Location initialLocation = new Location(0, 0, Direction.WEST);
        Command givenCommand = Command.TURN_RIGHT;
        MarsRover marsRover = new MarsRover(initialLocation);
        //When
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        //Then
        Assertions.assertEquals(0,currentLocation.getX());
        Assertions.assertEquals(0,currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH,currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_1_1_East_when_executeBatchCommands_given_0_0_West_and_commands_Move_Turn_Right_Move(){
        //Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        batchCommand.add(Command.MOVE);
        batchCommand.add(Command.TURN_RIGHT);
        batchCommand.add(Command.MOVE);
        MarsRover marsRover = new MarsRover(initialLocation);
        //When
        marsRover.executeBatchCommands(batchCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        //Then
        Assertions.assertEquals(1,currentLocation.getX());
        Assertions.assertEquals(1,currentLocation.getY());
        Assertions.assertEquals(Direction.EAST,currentLocation.getDirection());
    }
}
