package java.impl;

import java.interfaces.SwimBehaviour;

/**
 * Created by Sophy on 19.02.2015.
 */
public abstract class CannotSwim implements SwimBehaviour {
    @Override
    public void swim() {
        System.out.println("Cannot swim!");
    }
}
