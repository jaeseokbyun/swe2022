package Lannigiro;
//이름 완료 날짜
import java.time.LocalDate;
public class TodoTask {
    String TaskName;
    Boolean TaskResult;
    public int TaskDate;

    public TodoTask(String TaskName, Boolean TaskResult ) {
        this.TaskName=TaskName;
        this.TaskResult=TaskResult;

    }
}
