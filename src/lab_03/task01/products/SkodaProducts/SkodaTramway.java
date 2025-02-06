package lab_03.task01.products.SkodaProducts;

import lab_03.task01.products.AbstractTramway;

public class SkodaTramway extends AbstractTramway {
    @Override
    public Integer getPrice() {
        return 9000000;
    }

    @Override
    public Integer getOperatingCosts() {
        return 8;
    }
}
