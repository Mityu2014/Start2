/**
 * Abstract class creating a store buyer with a standard set of parameters
 */
package classes;
import interfaces.iActorBehaviour;
import interfaces.iReturnOrder;
public abstract class Actor implements iActorBehaviour,iReturnOrder {
    protected String name; //Client's name
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    /**
     * The method of getting a client of this class
     * @return The current client
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * Method of getting the client's name
     * @return Client's name
     */
    abstract String getName();

    /**
     * method of changing the client's name
     * @param name Client's name
     */
    abstract void setName(String name);

}
