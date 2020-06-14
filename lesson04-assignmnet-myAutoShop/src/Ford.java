public class Ford extends Sedan {
    private int manufacturerDiscount;
    private int year;
    //From the sale price computed from Car class, subtract the manufacturer Discount.
    double getSalePrice(){
        return (this.getRegularPrice() - this.manufacturerDiscount);
    }

    public Ford(int speed, double regularPrice, String color, int manufacturerDiscount, int year, int length)  {
        super(speed, regularPrice, color , length);
        this.manufacturerDiscount = manufacturerDiscount;
        this.year = year;
    }
}
