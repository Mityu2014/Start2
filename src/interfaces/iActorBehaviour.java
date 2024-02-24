/**
 * An interface describing the behavior and functionality of the customer in the store
 */
package interfaces;

import classes.Actor;

public interface iActorBehaviour {
    /**
     * The method of checking for the presence of an order made
     * @return true or false, depending on the availability of the ordered
     */
    public boolean isTakeOrder();

    /**
     * The method checks whether the order has been received by the buyer
     * @return true or false depending on whether the order has been received
     */
    public boolean isMakeOrder();

    /**
     * Method of changing the order receipt status
     * @param isCliented true or false, false by default
     */
    public void setTakeOrder(boolean isCliented);

    /**
     * The method of changing the status of the order
     * @param isCliented true or false, false by default
     */
    public void setMakeOrder(boolean isCliented);

    /**
     * The method of getting a client of this class
     * @return The current client
     */
    public Actor getActor();

}
