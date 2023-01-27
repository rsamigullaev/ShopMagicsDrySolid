public class Camera extends Product implements Device, Objective { //Interface Segregation Principle, Dependency Inversion Principle
    private final String name = "Камера";
    private final int price = 15000;

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
    public void shootVideo() {
        System.out.println(name + " снимает видео");
    }

}
