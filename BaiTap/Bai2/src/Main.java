public class Main {
    public static void main(String[] args) {
        System.out.println("\n \n \n");
        System.out.println(" ------------ +++++++++++++++++++++++++++ ------------");
        Shape[] sp = new Shape[3];
        sp[0]= new Square(10);
        sp[1] = new Rectangle(10,10);
        sp[2]= new Circle(10);


        for (int i = 0; i < sp.length; i++) {
            System.out.println(sp[i]);
            if (sp[i] instanceof Square) {
                ((Square) sp[i]).howToColor();
            }
        }

    }
}