package lab_16.task03;

import javax.swing.*;
import java.util.Iterator;

public class ItemValueDepthIterator implements Iterator<Item> {

	private Item[] items;
	private int index = 0;

	ItemValueDepthIterator(Box box) {

	}

	@Override
	public boolean hasNext() {
		return index < items.length;
	}

	@Override
	public Item next() {
		return items[index++];
	}
}
