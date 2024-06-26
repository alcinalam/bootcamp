import java.util.HashMap;
import java.util.Map;

/**
 * In this exercise, try to create an enum Fruit, with two fields, name (String) and price (int). Revise foodTable to HashMap<Integer, Fruit>.
 * 
 * Expected Output: Before change: 1 = Apple 3 = Strawberry
 * 
 * After change: 1 = APPLE, price = 20 3 = STRAWBERRY, price = 70
 */
class Exercise26 {
    // finite number of instances
    enum Fruit {
        // code here
        APPLE("Apple", 20),//
        ORANGE("Orange",10),//
        STRAWBERRY("Strawberry",70),//
        ;

        private String name;
        private int price;

        private Fruit (String name,int price) {
            this.name = name;
            this.price = price;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getName (){
            return this.name;
        }

        public int getPrice() {
            return this.price;
        }
    }

        public static void main(String[] args) {
            // initialize a HashMap
            HashMap<Integer, Fruit> foodTable = new HashMap<>();

            // Add elements using put method
            foodTable.put(1, Fruit.APPLE);
            foodTable.put(3, Fruit.STRAWBERRY);
            foodTable.put(2, Fruit.ORANGE);

            // Remove elements 2
            foodTable.remove(2);

           // System.out.println(foodTable);

            // Iterate the map using
            // for-each loop
            // Iterating HashMap through for loop
            for (Map.Entry<Integer, Fruit> set : foodTable.entrySet()) {
                // Printing all elements of a Map
                System.out.println(set.getKey() + " = " + set.getValue() + ", price = " + set.getValue().getPrice());
            }

           // After change: 1 = APPLE, price = 20 3 = STRAWBERRY, price = 70
        }
}
