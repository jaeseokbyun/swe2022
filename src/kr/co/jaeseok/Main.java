package kr.co.jaeseok;
import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        String casekey;
        App todoApp = new App("jaeseok");
        TodoList list1 = new TodoList("집에서할일");
        TodoList list2 = new TodoList("학교숙제");
        TodoTask task1 = new TodoTask("java");
        TodoTask task2 = new TodoTask("statistics");
        TodoTask task3 = new TodoTask("inference");
        list1.addTask(task1);
        list1.addTask(task2);
        list1.addTask(task3);
        TodoTask task4 = new TodoTask("machine");
        TodoTask task5 = new TodoTask("learning");
        list2.addTask(task4);
        list2.addTask(task5);
        todoApp.addList(list1);
        todoApp.addList(list2);

        todoApp.getInfo(); // 문제 1
        boolean loopcontinue=false;
        Scanner in = new Scanner(System.in ).useDelimiter("\\n");
        TodoList k=null;
        while (!loopcontinue){
            casekey = in.next();
            if (casekey.startsWith("addlist:")){
                String new1= casekey.substring(8,casekey.length());
                TodoList newlist1 = new TodoList(new1);
                todoApp.addList(newlist1);
                todoApp.getInfo();// 문제 2
                 }
            else if(casekey.startsWith("list:")){
                String testname=casekey.substring(5,casekey.length());
                k=todoApp.findInfo(testname);
                k.listTaskInfo();
                }
            //문제 3
            else if(casekey.startsWith("addTodo:")){
                String todoTaskName= casekey.substring(8,casekey.length()).split(",")[0];
                String todoDate= casekey.substring(8,casekey.length()).split(",")[1];
                int year=Integer.parseInt(todoDate.split("\\.")[0]);
                int month=Integer.parseInt(todoDate.split("\\..")[1]);
                int date=Integer.parseInt(todoDate.split("\\.")[2]);
                String todoAlarm1= casekey.substring(8,casekey.length()).split(",")[2];
                if (todoAlarm1=="true"){
                    boolean todoAlarm=true;
                }
                else {
                    boolean todoAlarm = false;
                }
                TodoTask atask= new TodoTask(todoTaskName);
                atask.setFinishDate(year,month,date);
                k.addTask(atask);
                k.listTaskInfo(); //문제 4
    }
    else if(casekey.startsWith("complete:")) {
                String new5= casekey.substring(9,casekey.length());
                TodoTask task15= k.findTask(new5);
                task15.setTaskIsDone();
                k.listTaskInfo();
            }
            else if(casekey.startsWith("incomplete:")) {
                String new6= casekey.substring(11,casekey.length());
                TodoTask task16= k.findTask(new6);
                task16.setTaskIsNotDone();
                k.listTaskInfo();
            }
            else if(casekey.startsWith("exit")) {
                 loopcontinue=true;
            }


        }}}
