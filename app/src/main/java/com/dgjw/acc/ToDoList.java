package com.dgjw.acc;

/**
 * Created by Ducks on 7/3/2015.
 */
public class ToDoList implements CheckList{

    private Task[] tasks;
    private TaskGenerator taskGenerator;

    public Task[] getList() {
        //temp measure to satisfy return
        return new Task[0];
    }

}
