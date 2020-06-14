public class Sedan extends Car {
    //If length>20 feet, 5% discount, Otherwise, 10% discount.
    double getSalePrice(){
        if (this.length > 20) return (this.getRegularPrice()*0.95);
        else return (this.getRegularPrice()*0.9);
    };
    int length;



    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }
}
