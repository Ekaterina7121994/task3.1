public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);
        int price1 = 19;
        int miles1 = service.calculate(price1);
        System.out.println(miles1);
        int price2 = 20;
        int miles2 = service.calculate(price2);
        System.out.println(miles2);
        int price3 = 21;
        int miles3 = service.calculate(price3);
        System.out.println(miles3);
    }

}


