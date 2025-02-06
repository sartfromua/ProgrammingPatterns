package lab_03.task01.products.SkodaProducts;

import lab_03.task01.products.AbstractTrolleybus;

public class SkodaTrolleybus extends AbstractTrolleybus {

    @Override
    public Integer getPrice() {
        return 6800000;
    }

    @Override
    public Integer getOperatingCosts() {
        return 12;
    }
}
