package java.impl;

import java.interfaces.FlyBehaviour;

/**
 * Created by Sophy on 19.02.2015.
 */
public abstract class CannotFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Cannot fly!");
    }
}
