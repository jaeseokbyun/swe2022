package kr.co.jaeseok;
import java.util.ArrayList;
import java.util.Comparator;
import static java.util.Collections.reverseOrder;
import static java.util.Comparator.naturalOrder;
import static java.util.Comparator.nullsFirst;
// deleteTask, setListName, setTheme, addTask, sorting
// getListTheme, getListName,
public class TodoList {
    private ArrayList<TodoTask> taskList = new ArrayList<TodoTask>();
    private String listName;
    private TodoTheme listTheme;
    private boolean hidingCompleted = true;

    public TodoList(String name) {
        this.listName = name;
    }
    public void setHideCompleted() {
        this.hidingCompleted = true;
    }
    public ArrayList<TodoTask> getList() {
        if (isTaskEmpty()) {
            System.out.println("할 일이 비어있습니다.");
        }
        if ( hidingCompleted){
            ArrayList<TodoTask> copyList=this.taskList;
            copyList.removeIf(TodoTask::getTaskCompleted);
            return copyList;
        }
        else return this.taskList;
    }
    public boolean isTaskEmpty() {
        if (taskList == null) {

            return true;
        }
        return false;
    }

    public void setListName(String aName) {
        this.listName = aName;
    }

    public void setTheme(TodoTheme aTheme) {
        this.listTheme = aTheme;
    }

    public void deleteTask(TodoTask taskName) {
        taskList.remove(taskName);
    }

    public void addTask(String name) {
        TodoTask task1= new TodoTask(name);
        taskList.add(task1);
    }

    public String getListName() {
        return this.listName;
    }

    public void sorting(String method) {
        if (method.equals("dueDate")) {
            taskList.sort(Comparator.comparing(TodoTask::getDueDate,nullsFirst(naturalOrder())));
        }
        else if (method.equals("dueDate reverse")) {
            taskList.sort(Comparator.comparing(TodoTask::getDueDate,nullsFirst(reverseOrder())));
        }
        else if (method.equals("name")) {
            taskList.sort(Comparator.comparing(TodoTask::getTaskName,nullsFirst(naturalOrder())));
        }
        else if (method.equals("name reverse")) {
            taskList.sort(Comparator.comparing(TodoTask::getTaskName,nullsFirst(reverseOrder())));}
        else if (method.equals("generatedDate")) {
            taskList.sort(Comparator.comparing(TodoTask::getTaskGeneratedDate,nullsFirst(naturalOrder())));
        }
        else if (method.equals("generatedDate reverse")) {
            taskList.sort(Comparator.comparing(TodoTask::getTaskGeneratedDate,nullsFirst(reverseOrder())));}
        else System.out.println(" method를 재설정해주십시오");
    }
}