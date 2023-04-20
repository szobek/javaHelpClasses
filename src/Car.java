import interfaces.IFoldi;
import interfaces.IHangJelzes;

public final class  Car extends Jarmu implements IFoldi, IHangJelzes {
    private String color;
    private String brand;
    private int window;
    private int door;
    private int seat;

    public Car(String color, String brand, int window, int door, int seat) {
        this.color = color;
        this.brand = brand;
        this.window = window;
        this.door = door;
        this.seat = seat;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public int getWindow() {
        return window;
    }

    public int getDoor() {
        return door;
    }

    public int getSeat() {
        return seat;
    }

    @Override
    public void kiir() {
        System.out.println("Implementált interfész");
    }

    @Override
    public void jelzes() {
        System.out.println("nínóóóóóóóóóóóóóóóóóó");
    }
}
