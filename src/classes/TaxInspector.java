/**
 *  The class describing the creation TaxInspector
 */
package classes;

import interfaces.iActorBehaviour;
import interfaces.iReturnOrder;

public class TaxInspector implements iActorBehaviour, iReturnOrder {
    private String name; // Customer name field
    private boolean isTakeOrder;
    private boolean isMakeOrder;

    /**
     * Constructor - creating a new object with certain values
     */
    public TaxInspector() {
        this.name = "Налоговый инспектор";
    }

    /**
     * Method of getting the client's name
     * @return Client's name
     */
    public String getName()
    {
        return name;
    }

    /**
     * The method of checking for the presence of an order made
     * @return true or false, depending on the availability of the ordered
     */
    public boolean isMakeOrder(){
        return isMakeOrder;
    }

    /**
     * The method checks whether the order has been received by the buyer
     * @return true or false depending on whether the order has been received
     */
    public boolean isTakeOrder(){
        return  isTakeOrder;
    }

    /**
     * The method of changing the status of the order
     * @param isCliented true or false, false by default
     */
    public void setMakeOrder(boolean isCliented){
        isMakeOrder = isCliented;
    }

    /**
     * Method of changing the order receipt status
     * @param isCliented true or false, false by default
     */
    public void setTakeOrder(boolean isCliented) {
        isTakeOrder = isCliented;
    }

    /**
     * The method of getting a client of this class
     * @return The current client
     */
    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
    }

    /**
     * The method describing the return of the purchased product
     * @param actor customer of the store
     */
    @Override
    public void returnOrder(iActorBehaviour actor) {
        if (actor.isTakeOrder()) {
            actor.setTakeOrder(false);
            System.out.println(actor.getActor().getName() + " клиент вернул заказ ");
        } else {
            System.out.println(actor.getActor().getName() + " клиенту нечего возвращать");
        }
        System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
        System.out.println(getName() + " клиент ушел из магазина ");
    }
}
