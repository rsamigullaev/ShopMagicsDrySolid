public class Player extends Product implements Device {
    private final String name = "Плеер";
    private final int price = 5000;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void toCharge() {
        System.out.println(name + " заряжается");
    }
}
