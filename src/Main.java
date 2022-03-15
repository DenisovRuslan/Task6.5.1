public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setWeight(5);
        cat1.setHeight(38);
        cat1.setName("Кот-Леопольд");
        cat1.makeSound();
        cat1.eat();
        System.out.println("Вес " + cat1.getWeight() + " кг.");
        System.out.println("Рост " + cat1.getHeight() + " см.");
    }
}
