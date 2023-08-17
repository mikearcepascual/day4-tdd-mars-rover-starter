package com.afs.tdd;

import java.util.List;

public class MarsRover {

    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeMoveCommand(){
        switch(location.getDirection()){
            case NORTH:
                location.setY(location.getY() + 1);break;
            case SOUTH:
                location.setY(location.getY() - 1);break;
            case EAST:
                location.setX(location.getX() + 1);break;
            case WEST:
                location.setX(location.getX() - 1);break;
        }
    }

    public void executeTurnLeftCommand(){
        switch(location.getDirection()){
            case NORTH:
                location.setDirection(Direction.WEST);break;
            case SOUTH:
                location.setDirection(Direction.EAST);break;
            case EAST:
                location.setDirection(Direction.NORTH);break;
            case WEST:
                location.setDirection(Direction.SOUTH);break;
        }
    }

    public void executeTurnRightCommand(){
        switch(location.getDirection()){
            case NORTH:
                location.setDirection(Direction.EAST);break;
            case SOUTH:
                location.setDirection(Direction.WEST);break;
            case EAST:
                location.setDirection(Direction.SOUTH);break;
            case WEST:
                location.setDirection(Direction.NORTH);break;
        }
    }
    public void executeCommand(Command givenCommand) {
        if(givenCommand == Command.MOVE) {
            executeMoveCommand();
        }
        else if(givenCommand == Command.TURN_LEFT){
            executeTurnLeftCommand();
        }
        else if(givenCommand == Command.TURN_RIGHT){
            executeTurnRightCommand();
        }
    }

    public Location getCurrentLocation() {
        return location;
    }

    public void executeBatchCommands(List<Command> batchCommands) {
        batchCommands.forEach(command -> {
           executeCommand(command);
        });
    }
}
