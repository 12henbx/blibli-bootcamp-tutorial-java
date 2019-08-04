package bootcamp.java.animal;

public class Cat extends AbstractAnimal implements Animal {

  public Cat(String name) {
    super(10);
    this.name = name;
  }

  @Override
  public void eatingProcess() {
    System.out.println("Cat is eating");
  }
}
