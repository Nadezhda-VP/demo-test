package ru.netology;

import lombok.val;
import ru.netology.model.PurchaseItem;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        CartService service = new CartService();
        service.add(new PurchaseItem(1, 1_000, 1));
        service.add(new PurchaseItem(2, 4_000, 4));
        service.add(new PurchaseItem(3, 6_000, 1));
        service.add(new PurchaseItem(4, 7_000, 9));
        service.add(new PurchaseItem(5, 9_000, 1));
        service.add(new PurchaseItem(6, 8_000, 10));

        class LocalPriceAscComparator implements Comparator<PurchaseItem> {

            @Override
            public int compare(PurchaseItem o1, PurchaseItem o2) {
                return o1.getItemPrice() - o2.getItemPrice();
            }
        }

        System.out.println(service.sortedBy(new LocalPriceAscComparator()));
    }
}