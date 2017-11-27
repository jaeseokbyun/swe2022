package chapter1;
import java.util.*;

public class Demo {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("what is your fucking name? ");
        String name = in.nextLine();
        Random generator = new Random();
        System.out.println(generator.nextInt(100));
        System.out.println(name);
        String[]names;
        names=new String[100];
        for (int i=0;i<names.length;i++){
            names[i]="";
        }
        arrayList fuck = new arrayList("you");
        fuck.lists.add("holy");
        fuck.lists.add("shit");
        System.out.println(fuck.lists);

    }

}
