/**
 * A class describing the creation of a client participant in the promotion
 */
package classes;
import interfaces.iActorBehaviour;

public class PromotionalClient extends Actor{
    private String promotional; //The name of the promotion
    private int id; //Customer ID Number field
    public static Integer numPromClient; /** {@value Number of participants in the campaign}*/
    static {
        numPromClient = 2;
    }

    /**
     * Constructor - creating a new object with certain values
     * @param name Client's name
     * @param promotional The name of the promotion
     * @param id Customer ID Number field
     */
    public PromotionalClient(String name, String promotional,Integer id) {
        super(name);
        this.promotional = promotional;
        numPromClient --;
    }

    /**
     * Method of getting the client's name
     * @return Client's name
     */
    @Override
    String getName() {
        return super.name;
    }

    /**
     * method of changing the client's name
     * @param name Client's name
     */
    @Override
    void setName(String name) {
        super.name = name;
    }


    /**
     * The method of checking for the presence of an order made
     * @return true or false, depending on the availability of the ordered
     */
    public boolean isMakeOrder(){
        return  super.isMakeOrder;
    }

    /**
     * The method checks whether the order has been received by the buyer
     * @return true or false depending on whether the order has been received
     */
    public boolean isTakeOrder(){
        return  super.isTakeOrder;
    }

    /**
     * The method of changing the status of the order
     * @param isGreated true or false, false by default
     */
    public void setMakeOrder(boolean isGreated){
        super.isMakeOrder = isGreated;
    }

    /**
     * Method of changing the order receipt status
     * @param isGreated true or false, false by default
     */
    public void setTakeOrder(boolean isGreated) {
        super.isTakeOrder = isGreated;
    }

    /**
     * The method of getting a client of this class
     * @return The current client
     */
    public Actor getActor(){
        return this;
    }

    /**
     * The method describing the return of the purchased product
     * @param actor customer of the store
     */
    @Override
    public void returnOrder(iActorBehaviour actor) {

    }
}
