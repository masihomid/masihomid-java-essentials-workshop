public class Spider extends Insect  {

    boolean isPoisonous;

    public Spider(int age, boolean isPoisonous) {
        super(age, 8);
        this.isPoisonous = isPoisonous;
    }

    public void crawl(){
        System.out.println("the spider crawled");
    }
    public void says() {
        System.out.println("HISSSS");
    }

    public void says(String str){
        System.out.println("HISSS" + str);
    }
}
