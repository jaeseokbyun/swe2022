package kr.co.jaeseok;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class App implements Serializable {
    private String appName;

    public ArrayList<TodoList> mylists;

    public App(String name) {
        this.appName = name;
        this.mylists = new ArrayList<>();
    }
    public void save() {try {
        Path p = Paths.get("c:/test", "test.txt");
        if (!Files.exists(p)) {
            Files.createDirectories(Paths.get("c:/test"));
            Files.createFile(p);
        }
        ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(p));
        out.writeObject(this);
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    static App load(){
        try {
            Path p = Paths.get("c:/test", "test.txt");
            ObjectInputStream in = new ObjectInputStream(Files.newInputStream(p));
            return  (App) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }}

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
        System.out.println("++++++++++");
        if (this.mylists.isEmpty()){
            System.out.println("비어있습니다");
        }
        else{
        for (TodoList i : this.mylists) {
            String result = i.getListName() + " " + i.getListSize();
            System.out.println(result);
        }}
        System.out.println("++++++++++");
    }

    public TodoList findInfo(String name) {
        TodoList result=null;
        for (TodoList i : this.mylists) {
            if(i.getListName().equals(name)) { result=i;}
        }
        return result;
    }
}
