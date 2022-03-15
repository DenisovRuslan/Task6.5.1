public class Cat extends Animal {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " Муррр!!!");
    }
}