package talkingpets;

public class Pets {
    private String name;
    private String type;

    public Pets(String type,String name){
        this.type = type;
        this.name = name;
    }

    public void speak(){
        System.out.println(name + "'s say something");
    }

    public static Pets createPet(String petType, String petName) {
         switch (petType) {
            case "Dog":
                return new Dog(petName);
            case "Cat":
                return new Cat(petName);
            case "Frog":
                return new Frog(petName);
            default:
                System.out.println("Invalid pet type");
                return new Pets("Unknown", petName);
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

}
