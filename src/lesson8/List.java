package lesson8;

import java.util.ArrayList ;

public class List {
    static private ArrayList<String> names= new ArrayList<>();

    private String name;
    public List(String name) throws Exception{
        if(names.contains(name)) throw new Exception();
        this.name=name;
        names.add(this.name);
    }
    public void setName(String name) throws Exception{
        if (name == this. name) return;
        // 복잡 ==> 중복 없어질 떄까지 refactoring 해야함.
        if(names.contains(name)) throw new Exception();
        names.remove(this.name);
        this.name=name;
        names.add(this.name);
    }
}
