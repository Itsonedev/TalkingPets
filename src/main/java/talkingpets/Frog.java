package talkingpets;

public class Frog extends Pets{

    public Frog(String name) {
        super("Frog",name);
    }

    @Override
    public void speak() {
        System.out.println(getName()+" says Ribbet");
    }
}
