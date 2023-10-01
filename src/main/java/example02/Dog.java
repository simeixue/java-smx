package example02;

// 该例子展示了实例/成员变量、局部变量的作用范围，以及this关键字的使用：this指向当前对象
public class Dog {
    String name;
    public Dog(){ // 构造方法
        name="汪汪";
    }
    public void eat(){
        String name="局部变量汪汪";
        System.out.println(name+"在吃东西");//name=局部变量汪汪
        System.out.println(this.name+"在吃东西");//name=汪汪
    }
    public void sleep(){
        System.out.println(name+"在睡觉");//name=汪汪
    }

    public String getName() {
        return name; //name=汪汪
    }
}
