package homework.hw2.Supermarket.src.Interfaces;

import java.util.List;

import homework.hw2.Supermarket.src.Classes.Actor;

/**
 * Поведение магазина
 */
public interface iMarketBehaviour {
    /* клиент пришел в магазин */
    void acceptToMarket(iActorBehaviour actor);

    /* клиент ушел из магазина */
    void releaseFromMarket(List<Actor> actors);

    /* обновить */
    void update();
}