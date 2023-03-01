package org.example.lab5.workWithCollections;

import org.example.lab5.Command;

public class Show extends Invoker{
    private Command showTheSummary;

    public Show(Command showTheSummary){
        this.showTheSummary = showTheSummary;
    }

    public void show(){
        showTheSummary.execute();
    }

    @Override
    public void doCommand() {
        showTheSummary.execute();
    }
}
