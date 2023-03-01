package org.example.help;

import org.example.lab5.Command;
import org.example.lab5.LabWork;

public class GetHelpCommand implements Command {

    private Info instruction;
    public GetHelpCommand(Info i){
        this.instruction = i;
    }
    @Override
    public void execute() {
        instruction.getInstruction();
    }
}
