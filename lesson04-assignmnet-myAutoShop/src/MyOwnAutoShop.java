import java.util.*;

//filename: MyOwnAutoShop.java
// Testing class with the main() method
    public class MyOwnAutoShop {


        public static void main(String[] args) {
            Sedan mySedan = new Sedan(160, 20000, "Red", 10);
            Ford myFord1 = new Ford (156,4452.0,"Black",2005, 10 , 11);
            Ford myFord2 = new Ford (155,5000.0,"Pink",1998, 5, 11);
            PremiumFord myPremiumFord = new PremiumFord(180,5000,"blue",3,20,100);
            Car myCar = new Car (555, 56856.0, "Red");
            System.out.printf("MySedan Price %.2f", mySedan.getSalePrice());
            System.out.printf("MyFord1 Price %.2f", myFord1.getSalePrice());
            System.out.printf("MyFord2 Price %.2f", myFord2.getSalePrice());
            System.out.printf("MyCar Price %.2f", myCar.getSalePrice());

///------------------------------------------------------------------------
            House myHouse = new House("yonge","999");

            Map map = new HashMap();

            map.put("home",myHouse);
            map.put("car",myFord1);

            Set mySet = new HashSet();
            mySet.add(myHouse);
            mySet.add(myFord1);

            List mylist = new ArrayList();
            mylist.add(35);
            Collections.shuffle(mylist);
            }
        }



