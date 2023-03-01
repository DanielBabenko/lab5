package org.example.lab5.workWithCollections;

import org.example.lab5.ElementCommand;
import org.example.lab5.LabWork;

public class RemoveGreater extends Invoker{
    private ElementCommand removeGreaterEl;
    private static final String COMMAND_NAME = "remove_greater";

    public static String getCommandName() {
        return COMMAND_NAME;
    }

    public RemoveGreater(ElementCommand removeGreaterEl) {
        this.removeGreaterEl = removeGreaterEl;
    }

    public void removeGreater(LabWork e){
        removeGreaterEl.execute(e);
    }

    @Override
    public void doCommand() {

    }
}

