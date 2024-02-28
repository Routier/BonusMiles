
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);

        int price2 = -10_000;
        int miles2 = service.calculate(price2); // должно получиться -500
        System.out.println(miles2);

        int price3 = 0;
        int miles3 = service.calculate(price3);
        System.out.println(miles3); // должно получиться 0

    }
}