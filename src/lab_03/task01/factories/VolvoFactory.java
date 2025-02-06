package lab_03.task01.factories;

import lab_03.task01.products.AbstractBus;
import lab_03.task01.products.AbstractTramway;
import lab_03.task01.products.AbstractTrolleybus;
import lab_03.task01.products.VolvoProducts.VolvoBus;
import lab_03.task01.products.VolvoProducts.VolvoTramway;
import lab_03.task01.products.VolvoProducts.VolvoTrolleybus;

public class VolvoFactory implements AbstractFactory{
    @Override
    public AbstractBus getBus() {
        return new VolvoBus();
    }

    @Override
    public AbstractTramway getTramway() {
        return new VolvoTramway();
    }

    @Override
    public AbstractTrolleybus getTrolleybus() {
        return new VolvoTrolleybus();
    }
}
