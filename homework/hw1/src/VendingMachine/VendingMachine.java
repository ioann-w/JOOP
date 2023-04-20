package homework.hw1.src.VendingMachine;

import java.util.ArrayList;
import java.util.List;

import homework.hw1.src.Product.Product;

public class VendingMachine {
    private int volume;
    private List<Product> products;
    private List<String> workLog;

    public VendingMachine(int volume) {
        this.volume = volume;
        products = new ArrayList<Product>();
        workLog = new ArrayList<String>();
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }

    public Product getProdByName(String name)
    {
        for(Product prod: products)
        {
            if(prod.getName().contains(name))
            {
                return prod;
            }
        }
        return null;
    }
}