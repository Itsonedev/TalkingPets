package talkingpets;

public class Cat extends Pets {
    public Cat(String name) {
        super("Cat",name);
    }

    @Override
    public void speak() {
        System.out.println(getName()+ " says Meow");
    }
}
