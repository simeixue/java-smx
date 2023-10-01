package example04;

public class B extends A{
    public B(){
        setA(1);
    }
    public B show(){
        super.show();
        System.out.println("子类的show方法");
        return null;
    }
}
