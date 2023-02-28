package org.example.help;

import org.example.lab5.Command;
import org.example.lab5.workWithCollections.Invoker;

public class Help extends Invoker {
    private Command getHelpCommand;
    public Help(Command getHelpCommand){
        this.getHelpCommand = getHelpCommand;
    }

    public void getHelp(){
        getHelpCommand.execute();
    }

    @Override
    public void doSomething() {
        getHelpCommand.execute();
    }
}
