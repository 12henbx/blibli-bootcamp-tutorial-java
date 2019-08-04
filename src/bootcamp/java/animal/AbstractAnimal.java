package bootcamp.java.animal;

import bootcamp.java.food.Food;

public abstract class AbstractAnimal implements Animal {

  protected int energy;

  protected String name;

  protected AbstractAnimal(int energy) {
    this.energy = energy;
  }

  public abstract void eatingProcess();

  @Override
  public void consume(Food food) {
    eatingProcess();
    this.energy += food.getEnergy();
  }

  @Override
  public int getEnergy() {
    return energy;
  }

  @Override
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
