/**
 * The Market class describes the main methods of operation of the store and the behavior of shoppers
 */
package classes;
import interfaces.iActorBehaviour;
import interfaces.iMarketBehaviour;
import interfaces.iQueueBehaviour;
import interfaces.iReturnOrder;

import java.util.ArrayList;
import java.util.List;


public class Market implements iMarketBehaviour, iQueueBehaviour,iReturnOrder {
    private List<iActorBehaviour> queue;

    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    /**
     *The method that determines the appearance of customers in the store
     * @param actor customer of the store
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    /**
     * The method of adding a customer to the queue
     * @param actor customer of the store
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    /**
     * The method of the customer leaving the store
     * @param actors customer of the store
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }
    }

    /**
     * The main method of operation of the store
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    /**
     *The method of receiving the order by customers
     * @exception TaxInspector Changing further actions upon receipt of the order TaxInspector
     */
    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
            if (actor.getClass() == TaxInspector.class){
              ((TaxInspector) actor).returnOrder(actor);
            }
        }
    }

    /**
     * Method of excluding customers who have received an order from the queue
     */
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }

    /**
     * The method describing the creation of an order
     */
    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");

            }
        }

    }

    /**
     * The method describing the return of the purchased product
     * @param actor customer of the store
     */
    @Override
    public void returnOrder(iActorBehaviour actor) {
        acceptToMarket(actor);
        if (actor.isTakeOrder()) {
            System.out.println(actor.getActor().getName() + " клиент вернул заказ ");
        } else {
            System.out.println(actor.getActor().getName() + " клиенту нечего возвращать");
        }
        releaseFromQueue();
    }
}
