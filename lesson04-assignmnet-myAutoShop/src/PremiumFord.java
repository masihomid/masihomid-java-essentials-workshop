public class PremiumFord extends Ford implements Premium{

    public PremiumFord(int speed, double regularPrice, String color, int manufacturerDiscount, int year, int length) {
        super(speed, regularPrice, color, manufacturerDiscount, year, length);
    }

    public int warrantyYears(){
        return Math.floorDiv((int) this.getRegularPrice(),10);

    }

}
