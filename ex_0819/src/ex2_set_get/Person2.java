package ex2_set_get;

public class Person2 {
    
    private String name;
    private int age;

    /* public void setInfo( String a, int b ){
       name = a;
       age = b;
    }*/
       public void setInfo( String name, int age ){
        //this : 현재 클래스 자신
        this.name = name; //Person2
        this.age = age;
       }

    public String getName(){
        return name; //getter에는 this 안 써도 되는 이유.
        //지역변수 아니고 전역변수 name
    }

    public int getAge(){
        return age;
    }
}
