package example07;

public class Person {
    public void feed(Pet pet){//多态的应用一
        pet.eat();
    }
    public static void main(String[] args) {
        Person person=new Person();
        person.feed(new Dog());//多态的应用一
        person.feed(new Cat());//多态的应用一
    }

}
class Pet{
    public void eat(){
        System.out.println("在吃东西");
    }
}

class Dog extends Pet{
    public void eat(){
        System.out.println("狗狗在啃骨头");
    }
}
class Cat extends Pet{
    public void eat(){
        System.out.println("猫咪在吃鱼");
    }
}