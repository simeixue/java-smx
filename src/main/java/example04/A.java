package example04;

public class A {
    private int a;
    int b;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    A show() {
        System.out.println("父类的show方法");
        return null;
    }
}
