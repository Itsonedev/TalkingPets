package talkingpets;

public class Dog extends Pets{
    public Dog(String name) {
        super("Dog",name);
    }

    @Override
    public void speak() {
        System.out.println(getName()+ " says Woof");
    }
}
