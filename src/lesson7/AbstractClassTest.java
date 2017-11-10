package lesson7;

public class AbstractClassTest {
    abstract class Person{
        private String name;
        //private  는 자기만, 자식 클래스도 못봄.


        public Person (){this.name=""};
        public Person (String name){this.name=name;}
        public final String getName(){return name;}
        // 바깥에 아무도 접근 못하니까, 보여주긴할게
        // final은 override 불가하게 하는 것.
        // 여기서 final 은 의무적으로 반드시 해야하는것

        public abstract int getid();
        //abstract class에서만 abstract method사용가능.
    }
    static class Student extends Person{
        private int id;
        public Student(String name, int id){  //extend 로부터 만든 자식은  부모의 생성자(super)를 호출할 의무가 있음.
            //super는 동적패치를 통해서 부모 생성자를 호출할 책임 ㅇㅇ

            super(name);
            // super는 반드시 처음에 생성할 의무를 가짐.
            this.id =id;
        }
        @Override
        public int getid() {
            return 0;
        }
    }
    static public   void main(String[] arg){
        Person c= new Person (name: "jaeseok"){

        }
        // abstract class로 만들었으면, 람다 x interface 에만 됌
    }
}
