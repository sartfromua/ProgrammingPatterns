package lab_03.task01.products.VolvoProducts;

import lab_03.task01.products.AbstractTramway;

public class VolvoTramway extends AbstractTramway {
    @Override
    public Integer getPrice() {
        return 1000000;
    }

    @Override
    public Integer getOperatingCosts() { return 7; }
}
