package lab_03.task01.factories;

import lab_03.task01.products.AbstractBus;
import lab_03.task01.products.AbstractTramway;
import lab_03.task01.products.AbstractTrolleybus;
import lab_03.task01.products.HyundaiProducts.HyundaiBus;
import lab_03.task01.products.HyundaiProducts.HyundaiTramway;
import lab_03.task01.products.HyundaiProducts.HyundaiTrolleybus;

public class HyundaiFactory implements AbstractFactory{
    @Override
    public AbstractBus getBus() {
        return new HyundaiBus();
    }

    @Override
    public AbstractTramway getTramway() {
        return new HyundaiTramway();
    }

    @Override
    public AbstractTrolleybus getTrolleybus() {
        return new HyundaiTrolleybus();
    }
}
