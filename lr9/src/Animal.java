public abstract class Animal {
    protected String name;
    private int age;

    private static int animalCount=0;

    public Animal(String name, int age){
        this.name=name;
        this.age=age;
        animalCount++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public abstract void makeSound();

    public abstract double calculateFood(double weight);

  // class Dog extends Animal {
    //
    //    public Dog(String name, int age) {
    //        super(name, age);
    //    }
    //
    //    @Override
    //    public void makeSound() {
    //        System.out.println(name + " лает: Гав-гав!");
    //    }
    //
    //
    //    @Override
    //    public double calculateFood(double weight) {
    //        return weight * 0.05; // 5% от веса
    //    }
    //}
    //
    //public class Main {
    //    public static void main(String[] args) {
    //        Dog dog = new Dog("Rex", 3);
    //        dog.makeSound();
    //    }
    //}
}
