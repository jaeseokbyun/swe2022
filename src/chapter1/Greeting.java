package chapter1;

public class Greeting {
    public static void main(String[] args){
        for (int i =0; i<args.length; i++){
            String arg=args[i];
            if(arg.equals("-h")) arg="hello";
            else if (arg.equals("-g")) arg= "GoodBye";
            System.out.println(arg);

        }
    }
}
