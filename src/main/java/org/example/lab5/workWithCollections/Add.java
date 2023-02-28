package org.example.lab5.workWithCollections;

import org.example.lab5.Command;
import org.example.lab5.ElementCommand;
import org.example.lab5.LabWork;

public class Add {

    private Command add;

    public Add(Command add){
        this.add = add;
    }

    public void add(LabWork e){
        add.execute(e);
    }
}
