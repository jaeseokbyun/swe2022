package Lannigiro;
//이름 정렬방향
import java.util.ArrayList ;
import java.util.Collections ;

public class TodoList extends TodoTask {
    //목록으로..
    static private ArrayList<String> Listnames= new ArrayList<>();

    private int sorting;
    TodoTheme theme;
    private String name;

    //생성자
    public TodoList(String name, Boolean result) {
        super(name, result);

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

    public void SetTheme(){
        this.theme=new TodoTheme();
    }

    public void ChangeTheme(TodoTheme theme){
        this.theme=theme;
    }

    public void SortList(int sorting){
        if (sorting==1){
        Collections.sort(Listnames);
        }
    }

}