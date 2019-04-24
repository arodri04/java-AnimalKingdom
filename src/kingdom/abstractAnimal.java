package kingdom;

public abstract class abstractAnimal {
    // fields
    public static int maxId = 0;
    public int id;
    public String name;
    public int dYear;

    // constructor
    public abstractAnimal(String name, int dYear) {
        maxId++;
        id = maxId;
        this.name = name;
        this.dYear = dYear;

    }

    public abstract String getMove();

    public abstract String getBreath();

    public abstract String getReproduce();

    public String getEat() {
        return "CRONCH";
    }
}