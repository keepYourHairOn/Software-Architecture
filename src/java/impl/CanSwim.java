package java.impl;

import java.interfaces.SwimBehaviour;

/**
 * Created by Sophy on 19.02.2015.
 */
public abstract class CanSwim implements SwimBehaviour {
    @Override
    public void swim() {
        System.out.println("Can swim!");
    }
}
