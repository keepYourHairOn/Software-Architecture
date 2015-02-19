package java.entity;

import java.interfaces.FlyBehaviour;
import java.interfaces.SwimBehaviour;
import java.interfaces.WalkBehaviour;

/**
 * Created by Sophy on 19.02.2015.
 */
public abstract class Animal {
    WalkBehaviour walkBehaviour;
    FlyBehaviour flyBehaviour;
    SwimBehaviour swimBehaviour;

    public void display(String look){
        System.out.println("I look like " + look);
    }

    public void show_name(String name){
        System.out.println("My name is " + name);
    }

    public void performWalk(){
        walkBehaviour.walk();
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performSwim(){
        swimBehaviour.swim();
    }

    public void SetNewSwimBehaviour(SwimBehaviour f){

        swimBehaviour = f;
    }
}
