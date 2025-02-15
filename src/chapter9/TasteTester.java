package chapter9;

public class TasteTester {

    public static void main(String[] args){

        Cake cake = new Cake("vanilla");
        cake.setPrice(399.99);
        System.out.println("Cake flavor: " + cake.getFlavor());
        System.out.println("Price is: " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(500.86);
        System.out.println("Cake flavor is " + birthdayCake.getFlavor());
        System.out.println("Price is " + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setPrice(2500);
        System.out.println("Cake flavor is " + weddingCake.getFlavor());
        System.out.println("Price is " + weddingCake.getPrice());

    }
}
