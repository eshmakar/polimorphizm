package polimorphism;

public class Figure {
    static void play(Circle cc){
        cc.info();
    }
    public static void main(String[] args) {
        Circle c = new Circle();
        ByCircle b = new ByCircle();
        TriCircle t = new TriCircle();

        play(c);
        play(b);
        play(t);

    }
}
