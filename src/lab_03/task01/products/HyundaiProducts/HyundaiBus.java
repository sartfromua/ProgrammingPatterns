package lab_03.task01.products.HyundaiProducts;

import lab_03.task01.products.AbstractBus;

public class HyundaiBus extends AbstractBus {

    @Override
    public Integer getPrice() {
        return 5500000;
    }

    @Override
    public Integer getOperatingCosts() {
        return 20;
    }
}
