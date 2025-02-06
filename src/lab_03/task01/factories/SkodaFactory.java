package lab_03.task01.factories;

import lab_03.task01.products.AbstractBus;
import lab_03.task01.products.AbstractTramway;
import lab_03.task01.products.AbstractTrolleybus;
import lab_03.task01.products.SkodaProducts.SkodaBus;
import lab_03.task01.products.SkodaProducts.SkodaTramway;
import lab_03.task01.products.SkodaProducts.SkodaTrolleybus;

public class SkodaFactory implements AbstractFactory {
    @Override
    public AbstractBus getBus() {
        return new SkodaBus();
    }

    @Override
    public AbstractTramway getTramway() {
        return new SkodaTramway();
    }

    @Override
    public AbstractTrolleybus getTrolleybus() {
        return new SkodaTrolleybus();
    }
}
