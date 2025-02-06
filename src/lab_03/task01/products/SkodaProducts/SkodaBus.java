package lab_03.task01.products.SkodaProducts;

import lab_03.task01.products.AbstractBus;

public class SkodaBus extends AbstractBus {

    @Override
    public Integer getPrice() {
        return 4500000;
    }

    @Override
    public Integer getOperatingCosts() {
        return 25;
    }
}
