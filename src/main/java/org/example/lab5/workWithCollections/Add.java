package org.example.lab5.workWithCollections;

import org.example.lab5.Command;
import org.example.lab5.ElementCommand;
import org.example.lab5.LabWork;

public class Add extends Invoker {

    private ElementCommand add;
    private static final String COMMAND_NAME = "add";

    public static String getCommandName() {
        return COMMAND_NAME;
    }

    public Add(ElementCommand add){
        this.add = add;
    }

    public void add(LabWork e){
        add.execute(e);
    }

    @Override
    public void doCommand() {

    }
}
