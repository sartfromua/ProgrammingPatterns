package lab_03.task01.products.HyundaiProducts;

import lab_03.task01.products.AbstractTrolleybus;

public class HyundaiTrolleybus extends AbstractTrolleybus {

    @Override
    public Integer getPrice() {
        return 7000000;
    }

    @Override
    public Integer getOperatingCosts() {
        return 11;
    }
}
