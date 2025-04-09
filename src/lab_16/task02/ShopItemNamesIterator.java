package lab_16.task02;

import lab_16.task01.Employee;

import java.util.*;

public class ShopItemNamesIterator implements Iterator<ShopItem> {

	private List<ShopItem> items;
	private int index = 0;

	public ShopItemNamesIterator(Shop collection) {
		items = new ArrayList<>(collection.getItems());
		items.sort(Comparator.comparing(ShopItem::getName));
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
