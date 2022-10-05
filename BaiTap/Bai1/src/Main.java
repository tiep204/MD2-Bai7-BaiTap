public class Main {
    public static void main(String[] args) {
        Shape[] sp = new Shape[3];
        sp[0] = new Circle(5, "blue", true);
        System.out.println("-------------------------hinh tron-------------------------");
        System.out.println("hình tròn ban đầu là---------------------------  " + sp[0]);
        System.out.println("------------------------------------------------------------------------");


        sp[1] = new Rectangle(3, 5, "red", false);
        System.out.println("----------------------hinh vhu nhat----------------------");
        System.out.println("hinh chư nhat ban đầu là ----------------------- " + sp[1]);
        System.out.println("------------------------------------------------------------------------");

        sp[2] = new Square(3, "green", true);
        System.out.println("------------------------hinh vuong-------------------------------");
        System.out.println("hinh vuong ban đầu là:---------------- " + sp[2]);
        System.out.println("------------------------------------------------------------------------");


        System.out.println("-------------------------các hình sau khi thay đổi---------------------");
        for (Shape a : sp) {
            a.resize(Math.random() * 100);
            System.out.println("\n");
        }
        System.out.println("\n");
        Shape.printShape(sp);


    }
}