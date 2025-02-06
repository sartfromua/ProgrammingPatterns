package lab_03.task01.products.HyundaiProducts;

import lab_03.task01.products.AbstractTramway;

public class HyundaiTramway extends AbstractTramway {
    @Override
    public Integer getPrice() {
        return 9500000;
    }

    @Override
    public Integer getOperatingCosts() {
        return 6;
    }
}
