package kr.co.jaeseok;

import java.time.LocalDate;


public class TodoTask {
    private String taskName;
    private boolean taskCompleted=false;
    private LocalDate taskDueDate;
    private LocalDate alarmDate;
    private final LocalDate taskGeneratedDate;

    public String getTaskName() {
        return this.taskName;
    }
    String taskInfo(){
        String name= this.getTaskName() ;
        LocalDate date= this.taskDueDate;
        Boolean alarm=this.isAlarm();
        Boolean completed=this.taskCompleted;
        String result= "# 할일명: " +name+" 완료 날짜: "+ date+ "\n  알림여부: " +alarm+ " 완료 여부 "+completed+"//";
        return result;
    }
    public TodoTask(String name){
        this.taskName=name;
        this.taskGeneratedDate=LocalDate.now();
    }
    boolean alarm=false;
    public void settingAlarm(){
        this.alarm=true;
    }
    public LocalDate getDueDate() {
        return this.taskDueDate;
    }
    public LocalDate getTaskGeneratedDate() {
        return this.taskGeneratedDate;
    }

    void setTaskName(String taskName){
        this.taskName=taskName;
    }
    void setTaskIsDone(){
        this.taskCompleted=true;
    }
    void setTaskIsNotDone(){
        this.taskCompleted=false;
    }

    public boolean getTaskCompleted(){
        return this.taskCompleted;
    }

    void setFinishDate(int years, int months, int dates){
        this.taskDueDate= LocalDate.of(years,months,dates);}
    void removeFinishDate(int years, int months, int dates){
        this.taskDueDate= null;}

    void setAlarm(int years, int months, int dates){
        this.alarmDate=LocalDate.of(years,months,dates);
    }

    void removeAlarm(int years, int months, int dates){
        this.alarmDate=null;
    }
    boolean isAlarm(){
        LocalDate presentTime= LocalDate.now();
        if (this.alarmDate==null ||  this.taskDueDate==null) return false;
        if (presentTime.getYear()==this.alarmDate.getYear() &&
                presentTime.getMonth()==this.alarmDate.getMonth() &&
                presentTime.getDayOfMonth()==this.alarmDate.getDayOfMonth())
            return true;
        else return false;
    }

    public static void main(String args[]){
        TodoTask test1= new TodoTask("aaa");
        test1.setFinishDate(2017,11,20);
        test1.setAlarm(2017,11,20);
        System.out.println(test1.isAlarm());
        System.out.println(test1.getTaskName());
    }
}
