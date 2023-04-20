package homework.hw1.src;

import homework.hw1.src.Product.Product;
import homework.hw1.src.VendingMachine.VendingMachine;

public class Main {
    public static void main(String[] args) {

            Product item1 = new Product("Cola",88.0);
            item1.setPrice(98.0);
            VendingMachine ver1 = new VendingMachine(300);
    }
}