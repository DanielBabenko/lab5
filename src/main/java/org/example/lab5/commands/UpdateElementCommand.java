package org.example.lab5.commands;


import org.example.lab5.LabWork;
import org.example.lab5.UpdateCommand;
import org.example.lab5.parserFromJson.Root;

public class UpdateElementCommand implements UpdateCommand {
    private Root root;

    public UpdateElementCommand(Root root){
        this.root = root;
    }

    @Override
    public void execute(int id, LabWork e) {
        root.update(id,e);
    }
}
