package homework.hw2.Supermarket.src.Interfaces;

import homework.hw2.Supermarket.src.Classes.Actor;

/**
 * Интерфейс возврата заказа посетителем
 */
public interface iReturnOrder {
  /* посетитель сделал заявку на возврат */
  void setMakeReturnOrder(boolean makeReturnOrder);

  /* забрал деньги */
  void setTakeCash(boolean takeCash);

  /* сделал ли заявку */
  boolean isMakeReturnOrder();

  /* забрал ли деньги */
  boolean isTakeCash();

  /* возврат самого посетителя */
  Actor getActor();
}
