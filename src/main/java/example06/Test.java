package example06;

public class Test {
    public static void main(String[] args) {
        A a=new B();
        a.show();
//        a.showB(); //报错
    }
}
class A{
    public void show(){
        System.out.println("父类A的show方法");
    }
}

class B extends A{
    public void show(){
        System.out.println("子类B的show方法");
    }
    public void showB(){
        System.out.println("子类B的showB方法");
    }
}
