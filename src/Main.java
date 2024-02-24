/**
 * The project describes the operation of the store relative to the standard behavior of customers
 * @authot Dmitriy
 * @ version 2.0
 */

import classes.*;
public class Main {
    public static void main(String[] args)throws Exception {
        Market magnit = new Market();
        Actor client1 = new OrdinaryClient("Oleg");
        Actor client2 = new OrdinaryClient("Igor");
        Actor client3 = new SpecialClient("Olga", 777);
        TaxInspector client4 = new TaxInspector();
        Actor client5 = new PromotionalClient("Pavel", "Sale",75);

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        magnit.update();
        magnit.returnOrder(client2);



    }
}