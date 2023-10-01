package example02;

public class ThisDog {
    String name;
    int age;
    String sex;
    public ThisDog(String name,int age){
        this.name=name;
        this.age=age;
    }
    public ThisDog(String name,int age,String sex){
        this(name,age);
        this.sex=sex;
    }
}
