package bootcamp.java;

import bootcamp.java.animal.Animal;
import bootcamp.java.animal.Cat;
import bootcamp.java.animal.Dog;
import bootcamp.java.food.ChickenFillet;
import bootcamp.java.food.Food;
import bootcamp.java.food.Water;

import java.util.ArrayList;
import java.util.List;

public class Application {

  public static void main(String[] args) {

    Cat cat = new Cat("Kocheng");
    Dog dog = new Dog("Doggy");

    List<Animal> animals = new ArrayList<>();
    animals.add(cat);
    animals.add(dog);

    for (Animal animal : animals) {
      System.out.println(animal.getName() + " has energy " + animal.getEnergy());
    }

    Food chickenFillet = new ChickenFillet();
    Food water = new Water();

    List<Food> foods = new ArrayList<>();
    foods.add(chickenFillet);
    foods.add(water);

    cat.consume(chickenFillet);
    dog.consume(foods);

    for (Animal animal : animals) {
      System.out.println(animal.getName() + " has energy " + animal.getEnergy());
    }
  }
}
