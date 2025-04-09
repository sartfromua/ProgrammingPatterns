package lab_16.task02;

import java.util.*;

public class ShopItemQuantityIterator implements Iterator<ShopItem> {

	private List<ShopItem> items;
	private int index = 0;

	public ShopItemQuantityIterator(Shop collection) {
		items = new ArrayList<>(collection.getItems());
		Collections.sort(items, Comparator.comparing(ShopItem::getQuantity));
	}

	@Override
	public boolean hasNext() {
		return index < items.size();
	}

	@Override
	public ShopItem next() {
		return items.get(index++);
	}
}
