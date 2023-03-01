package org.example.lab5.workWithCollections;

import org.example.lab5.ElementCommand;
import org.example.lab5.LabWork;

public class AddIfMax extends Invoker {
    private ElementCommand addMax;
    private static final String COMMAND_NAME = "add_if_max";

    public static String getCommandName() {
        return COMMAND_NAME;
    }

    public AddIfMax(ElementCommand addMax){
        this.addMax = addMax;
    }

    public void addIfMax(LabWork e){
        addMax.execute(e);
    }

    @Override
    public void doCommand() {

    }
}
