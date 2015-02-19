package java.impl;

import java.interfaces.FlyBehaviour;

/**
 * Created by Sophy on 19.02.2015.
 */
abstract class CanFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Can fly!");
    }
}
