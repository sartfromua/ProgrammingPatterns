package lab_16.task02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class Shop implements Iterable<ShopItem> {

    private final List<ShopItem> items = new ArrayList<ShopItem>();
    private IteratorFactory iteratorFactory = ShopItemNamesIterator::new;

    void putItem(ShopItem item){
        items.add(item);
    }

    public List<ShopItem> getItems(){
        return items;
    }

    public void setIteratorFactory(IteratorFactory factory){
        this.iteratorFactory = factory;
    }

    @Override
    public Iterator<ShopItem> iterator() {
        assert iteratorFactory != null;
        return iteratorFactory.createIterator(this);

    }
}
