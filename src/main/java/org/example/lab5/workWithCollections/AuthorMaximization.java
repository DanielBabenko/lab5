package org.example.lab5.workWithCollections;

import org.example.lab5.Command;

public class AuthorMaximization extends Invoker{
    private Command maxAuthorCommand;

    public AuthorMaximization(Command maxAuthorCommand){
        this.maxAuthorCommand = maxAuthorCommand;
    }

    public void maxByAuthor(){
       maxAuthorCommand.execute();
    }

    @Override
    public void doSomething() {
        maxAuthorCommand.execute();
    }
}