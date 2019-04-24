package kingdom;

import java.util.*;

public class Main {
    public static void printAnimals(ArrayList<abstractAnimal> animals, CheckAnimal tester) {
        for (abstractAnimal a : animals) {
            if (tester.test(a)) {
                System.out.println(a.name + " " + a.dYear);
            }
        }
    }

    private static void workWithData() {
        // Make THE MAMALS!
        Mammal panda = new Mammal("Panda", 1774);
        Mammal zebra = new Mammal("zebra", 1778);
        Mammal koala = new Mammal("koala", 1816);
        Mammal sloth = new Mammal("sloth", 1804);
        Mammal armadillo = new Mammal("armadillo", 1758);
        Mammal raccoon = new Mammal("raccoon", 1758);
        Mammal bigfoot = new Mammal("bigfoot", 2021);
        // BRING THE BIRDS
        Bird pigeon = new Bird("pigeon", 1837);
        Bird peacock = new Bird("peacock", 1821);
        Bird toucan = new Bird("toucan", 1758);
        Bird parrot = new Bird("parrit", 1824);
        Bird swan = new Bird("swan", 1758);
        // hmm cant think of good alliteration
        Fish salmon = new Fish("salmon", 1758);
        Fish catfish = new Fish("catfish", 1817);
        Fish perch = new Fish("perch", 1758);

        ArrayList<abstractAnimal> animalList = new ArrayList<abstractAnimal>();
        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(sloth);
        animalList.add(armadillo);
        animalList.add(raccoon);
        animalList.add(bigfoot);
        animalList.add(pigeon);
        animalList.add(peacock);
        animalList.add(toucan);
        animalList.add(parrot);
        animalList.add(swan);
        animalList.add(salmon);
        animalList.add(catfish);
        animalList.add(perch);
        System.out.println("DECENDING BY YEAR");
        animalList.sort((a1, a2) -> a1.dYear - a2.dYear);
        animalList.forEach((a) -> System.out.println(a.name));
        System.out.println("ALPHABATIZE ME CAPTAIN");
        animalList.sort((a1, a2) -> a1.name.compareToIgnoreCase(a2.name));
        animalList.forEach((a) -> System.out.println(a.name));
        System.out.println("ALPHABETICALLY FROM 1758");
        printAnimals(animalList, a -> (a.dYear == 1758));
        System.out.println("MOVEMENT");
        printAnimals(animalList, a -> (a.getMove() == "Walk"));
        printAnimals(animalList, a -> (a.getMove() == "Fly"));
        printAnimals(animalList, a -> (a.getMove() == "Swim"));
        System.out.println("LUNGS");
        printAnimals(animalList, a -> (a.getBreath() == "Lungs"));
        System.out.println("LUNGS IN 1758");
        printAnimals(animalList, a -> (a.dYear == 1758) && (a.getBreath() == "Lungs"));
        System.out.println("LAY EGGS AND HAVE LUNGS");
        printAnimals(animalList, a -> (a.getReproduce() == "Eggs") && (a.getBreath() == "Lungs"));

    }

    public static void main(String[] args) {
        workWithData();
    }
}