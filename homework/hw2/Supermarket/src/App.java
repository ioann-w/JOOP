package homework.hw2.Supermarket.src;

import homework.hw2.Supermarket.src.Classes.SelloutClient;
import homework.hw2.Supermarket.src.Classes.Market;
import homework.hw2.Supermarket.src.Classes.OrdinaryClient;
import homework.hw2.Supermarket.src.Classes.SpecialClient;
import homework.hw2.Supermarket.src.Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {

        Market market = new Market();
        iActorBehaviour item1 = new OrdinaryClient("Boris");
        iActorBehaviour item2 = new SpecialClient("Fedor", 1101);
        iActorBehaviour item3 = new OrdinaryClient("Dasha");
        iActorBehaviour item4 = new SelloutClient("Kostik", "Cola");

        market.acceptToMarket(item1);
        market.acceptToMarket(item2);
        market.acceptToMarket(item3);
        market.acceptToMarket(item4);
        market.update();
    }
}