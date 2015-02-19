package java.impl;

import java.interfaces.WalkBehaviour;

/**
 * Created by Sophy on 19.02.2015.
 */
public abstract class CannotWalk implements WalkBehaviour {
    @Override
    public void walk() {
        System.out.println("Cannot walk!");
    }
}
