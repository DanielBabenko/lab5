package org.example.lab5.workWithCollections;

import org.example.lab5.ElementCommand;
import org.example.lab5.LabWork;

import java.util.regex.Pattern;

public class RemoveLower extends Invoker {
    private ElementCommand removeLowerEl;
    private static final String COMMAND_NAME = "remove_lower";
    String regex = "\\w*";

    public static String getCommandName() {
        return COMMAND_NAME;
    }

    public RemoveLower(ElementCommand removeLowerEl) {
        this.removeLowerEl = removeLowerEl;
    }

    public void removeLower(LabWork e) {
        removeLowerEl.execute(e);
    }

    @Override
    public void doCommand() {

    }
}
