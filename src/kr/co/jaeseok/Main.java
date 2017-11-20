package kr.co.jaeseok;

import java.util.ArrayList;

public class Main {
    static public void main(String arg[]){
        App todoApp= new App("jaeseok");
        TodoList assignments= new TodoList("assignments");
        TodoList life= new TodoList("life");
        TodoTask java= new TodoTask("java");
        TodoTask statistics= new TodoTask("statistics");
        assignments.addTask("java");
        life.addTask("statistics");
    }
}
