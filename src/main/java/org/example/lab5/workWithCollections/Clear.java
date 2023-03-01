package org.example.lab5.workWithCollections;

import org.example.lab5.Command;
import org.example.lab5.ElementCommand;

public class Clear extends Invoker {
    private Command clearUpCommand;
    private static final String COMMAND_NAME = "clear";

    public static String getCommandName() {
        return COMMAND_NAME;
    }

    public Clear(Command clearUpCommand){
        this.clearUpCommand = clearUpCommand;
    }

    public void clear(){
        clearUpCommand.execute();
    }

    @Override
    public void doCommand() {

    }
}
