package kingdom;

public class Fish extends abstractAnimal {

    public Fish(String name, int dYear) {
        super(name, dYear);

    }

    @Override
    public String getMove() {
        return "Swim";
    }

    @Override
    public String getBreath() {
        return "Gills";
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