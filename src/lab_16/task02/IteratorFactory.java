package lab_16.task02;

import java.util.Iterator;

interface IteratorFactory {

	Iterator<ShopItem> createIterator(Shop collection);
}
