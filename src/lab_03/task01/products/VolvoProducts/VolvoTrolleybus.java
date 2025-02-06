package lab_03.task01.products.VolvoProducts;

import lab_03.task01.products.AbstractTrolleybus;

public class VolvoTrolleybus extends AbstractTrolleybus {

    @Override
    public Integer getPrice() {
        return 7000000;
    }

    @Override
    public Integer getOperatingCosts() {
        return 13;
    }
}
