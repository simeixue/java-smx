package example08;

public class Person {
    public void feed(Pet pet){//多态的应用一
        pet.eat();
    }
    public Pet getPet(String type){//多态的应用二
        if(type.equals("dog")){
            return new Dog();
        }
        else{
            return new Cat();
        }
    }
    public static void main(String[] args) {
        Person person=new Person();
        Pet pet=person.getPet("dog");
        person.feed(pet);//多态的应用二
        person.feed(new Cat());//多态的应用一，可以改成new别的，如Dog
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