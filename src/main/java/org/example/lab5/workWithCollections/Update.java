package org.example.lab5.workWithCollections;

import org.example.lab5.LabWork;
import org.example.lab5.UpdateCommand;

public class Update extends Invoker {
    public UpdateCommand updateEl;
    private static final String COMMAND_NAME = "update";

    public static String getCommandName() {
        return COMMAND_NAME;
    }

    public Update(UpdateCommand updateEl) {
        this.updateEl = updateEl;
    }

    public void update(int id, LabWork e){
        updateEl.execute(id, e);
    }

    @Override
    public void doCommand() {

    }
}
