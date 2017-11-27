package chapter1;

import java.util.ArrayList;

public class arrayList {
    public ArrayList<String> lists=new ArrayList<>() ;
    private String listName;
    public arrayList(String name) {
        this.listName = name;
    }

    public void listAppend(String a){
        lists.add(a);
    }

}
