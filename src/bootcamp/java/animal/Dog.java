package bootcamp.java.animal;

public class Dog extends AbstractAnimal implements Animal {

  public Dog(String name) {
    super(20);
    this.name = name;
  }

  @Override
  public void eatingProcess() {
    System.out.println("Dog is eating");
  }
}
