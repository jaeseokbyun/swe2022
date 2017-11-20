package kr.co.jaeseok;
import java.util.ArrayList;

public class App {
    private String appName;
    private ArrayList<TodoList> mylists = new ArrayList<TodoList>();
    public App(String name){
        this.appName=name;
    }
    public void removeList(TodoList aList){
        mylists.remove(aList);
    }

    public void addList(TodoList aList){
        mylists.add(aList);
    }

    }

