package org.example.lab5.commands;

import org.example.lab5.Command;
import org.example.lab5.parserFromJson.Root;

public class ClearTheCollectionCommand implements Command {
    private Root root;

    public ClearTheCollectionCommand(Root root){
        this.root = root;
    }

    public void execute() {
        root.clearCollection();
    }
}
