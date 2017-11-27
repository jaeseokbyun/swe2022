package kr.co.jaeseok;

import java.util.ArrayList;

public class App {
    private String appName;

    public ArrayList<TodoList> mylists;

    public App(String name) {
        this.appName = name;
        this.mylists = new ArrayList<>();
    }

    public void removeList(TodoList aList) {
        mylists.remove(aList);
    }

    public void addList(TodoList listName) {
        mylists.add(listName);
    }

    public boolean isAppEmpty() {
        if (this.mylists == null) return true;
        else return false;
    }

    public void getInfo() {
        for (TodoList i : this.mylists) {
            String result = i.getListName() + " " + i.getListSize();
            System.out.println(result);
        }
    }

    public TodoList findInfo(String name) {
        TodoList result=null;
        for (TodoList i : this.mylists) {
            if(i.getListName().equals(name)) { result=i;}
        }
        return result;
    }
}
