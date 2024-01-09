package HW2;

public class HomeTwo {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        Market myMarket = new Market();
        System.out.println();
        myMarket.acceptToMarket(new Human("Павел"));

        myMarket.update();

        myMarket.acceptToMarket(new Human("Александр"));
        myMarket.acceptToMarket(new Human("Пётр"));

        myMarket.update();

    } 
}