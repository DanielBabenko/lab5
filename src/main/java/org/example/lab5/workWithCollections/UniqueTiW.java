package org.example.lab5.workWithCollections;

import org.example.lab5.Command;

public class UniqueTiW extends Invoker {
    private Command printTiW;
    private static final String COMMAND_NAME = "print_unique_tuned_in_works";

    public static String getCommandName() {
        return COMMAND_NAME;
    }

    public UniqueTiW(Command printTiW){
        this.printTiW = printTiW;
    }

    public void printUniqueTunedInWorks(){
        printTiW.execute();
    }

    @Override
    public void doCommand() {
        printTiW.execute();
    }
}
