/**
 * The interface describing the functionality of the client in the queue
 */
package interfaces;

import classes.TaxInspector;

public interface iQueueBehaviour {
    /**
     * The method of adding a customer to the queue
     * @param actor customer of the store
     */
    public void takeInQueue(iActorBehaviour actor);

    /**
     * * Method of excluding customers who have received an order from the queue
     */
    public void releaseFromQueue();
    /**
     * The method describing the creation of an order
     */
    public void takeOrder();

    /**
     *The method of receiving the order by customers
     * @exception TaxInspector Changing further actions upon receipt of the order TaxInspector
     */
    public void giveOrder();

}
