public class Truck extends Car{
 private int weight;
double getSalePrice(){
    ;//If weight>2000,10%discount.Otherwise,20%discount.
    if (weight>2000) {
      return (this.getRegularPrice()*.09);
  }
  else return (this.getRegularPrice()*0.8);

};

}
