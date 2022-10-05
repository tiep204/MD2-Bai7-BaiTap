public class Square extends Shape {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color,filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Hình vuông có cạnh="
                + getSide()+"\n"
                + " đó là một lớp con của "
                + super.toString()+"\n"
                + " Dien Tich=" +
                + getArea();
    }

    @Override
    public void resize(double percent) {

    }

    double getArea() {
        return side * side;
    }


}