import java.entity.Cat;
import java.entity.Chicken;
import java.entity.Dog;
import java.entity.Fish;
import java.impl.CanSwim;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.display("java.entity.Cat");
        cat.show_name("Tom");
        cat.SetNewSwimBehaviour(new CanSwim() {
            @Override
            public void swim() {
                super.swim();
            }
        });
        cat.performFly();
        cat.performSwim();
        cat.performWalk();
        System.out.println("+---------------------------------------------+\n");

        Dog dog = new Dog();
        dog.display("java.entity.Dog");
        dog.show_name("Mike");
        dog.performFly();
        dog.performSwim();
        dog.performWalk();
        System.out.println("+---------------------------------------------+\n");

        Chicken chicken = new Chicken();
        chicken.display("java.entity.Chicken");
        chicken.show_name("Kate");
        chicken.performFly();
        chicken.performSwim();
        chicken.performWalk();
        System.out.println("+---------------------------------------------+\n");

        Fish fish = new Fish();
        fish.display("java.entity.Fish");
        fish.show_name("Goldy");
        fish.performFly();
        fish.performSwim();
        fish.performWalk();


    }
}
