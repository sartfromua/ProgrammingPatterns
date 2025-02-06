package lab_03.task01.factories;

import lab_03.task01.products.AbstractBus;
import lab_03.task01.products.AbstractTramway;
import lab_03.task01.products.AbstractTrolleybus;

public interface AbstractFactory {
    AbstractBus getBus();
    AbstractTramway getTramway();
    AbstractTrolleybus getTrolleybus();
}
