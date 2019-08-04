package bootcamp.java.animal;

import bootcamp.java.food.Food;

import java.util.List;

public interface Animal {

  void consume(Food food);

  int getEnergy();

  String getName();

  default void consume(List<Food> foods) {
    for (Food food : foods) {
      consume(food);
    }
  }
}
