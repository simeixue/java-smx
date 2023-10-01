package example05;

public class Test {
    public static void main(String[] args) {
        C c=new C(7,8,9);
        System.out.println(c.a+"---"+c.b+"---"+c.c);
    }
}
class A{
    int a=1;
    public A(int a){
        this.a=a;
        System.out.println("A的构造方法");
    }
}
class B extends A{
    int b=2;
    public B(int a,int b){
        super(a);
        this.b=b;
        System.out.println("B的构造方法");
//        System.out.println(this instanceof B);// true
//        System.out.println(this instanceof C);// true
    }
}
class C extends B{
    int c=3;
    public C(int a,int b,int c){
        super(a,b);
        this.c=c;
        System.out.println("C的构造方法");
    }
}
