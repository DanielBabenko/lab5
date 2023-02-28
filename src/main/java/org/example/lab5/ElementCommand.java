package org.example.lab5;

import org.example.lab5.Command;
import org.example.lab5.LabWork;

public interface ElementCommand extends Command {
    void execute(LabWork e);
}
