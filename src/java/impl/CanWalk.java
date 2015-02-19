package java.impl;

import java.interfaces.WalkBehaviour;

/**
 * Created by Sophy on 19.02.2015.
 */
public abstract class CanWalk implements WalkBehaviour {
    @Override
    public void walk() {
        System.out.println("Can walk!");
    }
}
