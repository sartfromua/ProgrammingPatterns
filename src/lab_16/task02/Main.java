package lab_16.task02;

import java.util.Iterator;

public class Main {

  public static void main(String[] args) {

    ShopItem pens = new ShopItem("pen", 175);
    ShopItem pencils = new ShopItem("pencil", 0);
    ShopItem paper = new ShopItem("paper", 500);

    Shop shop = new Shop();
    shop.putItem(pens);
    shop.putItem(pencils);
    shop.putItem(paper);


    System.out.println("Names of shop items: ");
//    shop.setIteratorFactory(ShopItemNamesIterator::new);
    for (ShopItem item : shop) System.out.println(item);
    System.out.println("Quantity of shop items: ");
    shop.setIteratorFactory(ShopItemQuantityIterator::new);
    for (ShopItem item : shop) System.out.println(item);

  }

}
