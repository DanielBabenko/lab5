package org.example.help;

import org.example.lab5.Command;
import org.example.lab5.LabWork;

public class GetHelpCommand implements Command {

    private Instruction instruction;
    public GetHelpCommand(Instruction i){
        this.instruction = i;
    }
    @Override
    public void execute() {
        instruction.getInstruction();
    }
}
