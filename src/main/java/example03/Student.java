package example03;

public class Student extends SE{
    int score;
    public void learn() {
        System.out.println(name+"在学习");
    }

    public void getScore() {
        System.out.println(name+"的分数是："+score);
    }
}
