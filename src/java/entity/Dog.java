package java.entity;

import java.impl.CanSwim;
import java.impl.CanWalk;
import java.impl.CannotFly;

/**
 * Created by Sophy on 19.02.2015.
 */
public class Dog extends Animal {
    public Dog(){
        swimBehaviour = new CanSwim() {
            @Override
            public void swim() {
                super.swim();
            }
        };

        flyBehaviour = new CannotFly() {
            @Override
            public void fly() {
                super.fly();
            }
        };

        walkBehaviour = new CanWalk() {
            @Override
            public void walk() {
                super.walk();
            }
        };
    }
}
