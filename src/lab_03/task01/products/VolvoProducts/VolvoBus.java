package lab_03.task01.products.VolvoProducts;

import lab_03.task01.products.AbstractBus;

public class VolvoBus extends AbstractBus {

    @Override
    public Integer getPrice() {
        return 6000000;
    }

    @Override
    public Integer getOperatingCosts() {
        return 20;
    }
}
