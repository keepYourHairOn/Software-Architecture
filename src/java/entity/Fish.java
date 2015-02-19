package java.entity;

import java.impl.CanSwim;
import java.impl.CannotFly;
import java.impl.CannotWalk;

/**
 * Created by Sophy on 19.02.2015.
 */
public class Fish extends Animal{
    public Fish(){
        walkBehaviour = new CannotWalk() {
            @Override
            public void walk() {
                super.walk();
            }
        };

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
    }
}
