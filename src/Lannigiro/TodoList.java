package Lannigiro;

import java.util.ArrayList ;

public class TodoList extends TodoTask {
    //목록으로..
    static private ArrayList<String> Listnames= new ArrayList<>();

    //변수 설정
    private String name;
    private Boolean sorting;
    TodoTheme theme;
    //생성자
    public TodoList(String name, String result) {
        super(name,result);

    }
    public void AddList(String name){
        this.Listnames.add(name);
    }
    public void SetListName(String name){
        this.name=name;
    }
    public void DeleteList(String name){
        this.Listnames.remove(name);
    }

    public void SetTheme(String names){
        this.theme=new TodoTheme();
    }

    public void ChangeTheme(String theme){

    }

    public void SortList(boolean sorting){
        if (sorting==true){

        }
        else{

        }
    }

}