public class Phone extends Product implements Device, Ring, Objective {
    private final String name = "Телефон";
    private final int price = 10000;

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

    @Override
    public void toCall() {
        System.out.println(name + " звонит");
    }

    @Override
    public void shootVideo() {
        System.out.println(name + " снимает видео");
    }
}