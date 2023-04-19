public class Main {
    public static void main(String[] args) {
//        Food[] foods = new Food[3];

        Food food1 = new Food("pizza");
        Food food2 = new Food("spagheti");
        Food food3 = new Food("kebab");

        Food[] foods = {food1,food2,food3};

//        foods[0] = food1;
//        foods[1] = food2;
//        foods[2] = food3;

        System.out.println(foods[0].name);
        System.out.println(foods[1].name);
        System.out.println(foods[2].name);
    }
}