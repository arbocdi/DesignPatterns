package arbocdi.dp.structural.composite;

public class Client {
    public static void main(String[] args) {
        Shape.Picture pic = new Shape.Picture()
                .addShape(new Shape.Circle())
                .addShape(new Shape.Circle())
                .addShape(new Shape.Rectangle());
        pic.draw();
        new Shape.Rectangle().draw();
    }
}
