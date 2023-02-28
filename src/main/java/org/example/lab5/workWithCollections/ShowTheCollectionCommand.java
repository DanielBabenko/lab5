package org.example.lab5.workWithCollections;

import org.example.lab5.Command;
import org.example.lab5.LabWork;
import org.example.lab5.parserFromJson.Root;

import java.util.HashSet;

public class ShowTheCollectionCommand implements Command {
    private Root root;
    public ShowTheCollectionCommand(Root root){
        this.root = root;
    }

    public void execute() {
        root.show();
    }
}
