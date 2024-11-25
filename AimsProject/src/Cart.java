public class Cart {

    // Max Number of order
    public static final int MAX_NUMBERS_ORDERED = 20;

    // array store orders
    private DigitalVideoDisc itemsOrdered[] =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    // qtyOrdered: how many DigitalVideoDiscs are in the cart
    private int qtyOrdered = 0;

    // add an item to the list
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        // check the current quantity to assure that the cart is not already full
        if(qtyOrdered < 20) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        }
        else {
            System.out.println("The cart is almost full");
        }
    }
    // add a list of DVDs to the current cart
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            addDigitalVideoDisc(disc); // Call the individual item addition method
        }
    }
    // add two items to the list
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1); // Call the individual item addition method for dvd1
        addDigitalVideoDisc(dvd2); // Call the individual item addition method for dvd2
    }



    // remove the item passed by argument from the list
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {

        for(int index = 0; index < qtyOrdered; index++) {
            if(itemsOrdered[index].getTitle() == disc.getTitle()) {

                for(int j = index; j < qtyOrdered; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                qtyOrdered--;
                System.out.println("The disc has been removed");
                break;
            }
        }
    }

    // method which loops through the values of the array and sums the costs of the individual DigitalVideoDiscs
    public float totalCost() {
        float total = 0;
        for(int index = 0; index < qtyOrdered; index++) {
            total += itemsOrdered[index].getCost();
        }
        return total;
    }

    public void listCart(){
        for(int i = 0 ; i < qtyOrdered ; i++) System.out.println(itemsOrdered[i].getTitle());
    }
}
// Something change