package kingdom;

public class Bird extends abstractAnimal {

    public Bird(String name, int dYear) {
        super(name, dYear);

    }

    @Override
    public String getMove() {
        return "Fly";
    }

    @Override
    public String getBreath() {
        return "Lungs";
    }

    @Override
    public String getReproduce() {
        return "Eggs";
    }

    @Override
    public String getEat() {
        return "CRONCH";
    }
}