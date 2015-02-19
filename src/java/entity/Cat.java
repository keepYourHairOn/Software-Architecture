package java.entity;

import java.impl.CanWalk;
import java.impl.CannotFly;
import java.impl.CannotSwim;

/**
 * Created by Sophy on 19.02.2015.
 */
public class Cat extends Animal{
    public Cat(){
        walkBehaviour = new CanWalk() {
            @Override
            public void walk() {
                super.walk();
            }
        };

        swimBehaviour = new CannotSwim() {
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
    }
}
