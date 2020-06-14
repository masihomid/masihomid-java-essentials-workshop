public class Main {


    public static void main(String[] args) {
        Tablet myTab = new Tablet();
        System.out.println(myTab.getDeviceType());
        System.out.println(myTab.getSpeed());
        System.out.println(myTab.receiveSMS());
        System.out.println(myTab.sendSMS());

        Computer c = myTab;

        Phone p = myTab;

        if (myTab instanceof Computer) System.out.println("myTab is a Computer");
        if (myTab instanceof Phone) System.out.println("myTab is a Phone as well");
        if (myTab instanceof Object) System.out.println("myTab is an Object ");

    }
}