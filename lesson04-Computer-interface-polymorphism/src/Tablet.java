class Tablet extends Computer implements Phone {


    public String receiveSMS() {
        return ("I am able to receive SMS");
    }

    public String sendSMS() {
        return ("I am able to send SMS");

    }
}