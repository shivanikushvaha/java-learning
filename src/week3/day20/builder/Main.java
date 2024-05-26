package week3.day20.builder;

public class Main {
    public static void main(String[] args) {
        // Building a house with a garage and a garden
        House house1 = new House.HouseBuilder("Concrete Foundation", "Wooden Structure")
                .setRoof("Metal Roof")
                .setHasGarage(true)
                .setHasGarden(true)
                .build();

        // Building a house with a swimming pool
        House house2 = new House.HouseBuilder("Concrete Foundation", "Brick Structure")
                .setHasSwimmingPool(true)
                .build();

        // Building a simple house
        House house3 = new House.HouseBuilder("Stone Foundation", "Stone Structure")
                .build();


        // Print the details of the houses
        System.out.println(house1);
        System.out.println(house2);
        System.out.println(house3);
    }
}
