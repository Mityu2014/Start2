/**
 * An interface describing the functionality of the store in relation to customers
 */
package interfaces;
import classes.Actor;
import java.util.List;

public interface iMarketBehaviour {
    /**
     *The method that determines the appearance of customers in the store
     * @param actor customer of the store
     */
    public void acceptToMarket(iActorBehaviour actor);

    /**
     * The method of the customer leaving the store
     * @param actors customer of the store
     */
    public void releaseFromMarket(List<Actor> actors);

    /**
     * The main method of operation of the store
     */
    public void update();
   }
