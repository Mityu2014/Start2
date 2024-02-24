/**
 * The interface describing the functionality of the customer when returning the order
 */
package interfaces;
import classes.Actor;
public interface iReturnOrder {
    /**
     * The method describing the return of the purchased product
     * @param actor customer of the store
     */
    public void returnOrder(iActorBehaviour actor);
}
