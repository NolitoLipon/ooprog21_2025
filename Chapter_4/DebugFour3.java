import java.util.Scanner;

public class DebugFour3 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int w, l, h;

        System.out.print("Enter width of box >> ");
        w = input.nextInt();

        System.out.print("Enter length of box >> ");
        l = input.nextInt();

        System.out.print("Enter height of box >> ");
        h = input.nextInt();

        DebugBox box1 = new FixDebugBox(w, l, h);
        DebugBox box2 = new FixDebugBox(w, l, h);

        System.out.println("The dimensions of the first box are:");
        box1.showData();

        System.out.print("The volume of the first box is: ");
        showVolume(box1);

        System.out.println("The dimensions of the second box are:");
        box2.showData();

        System.out.print("The volume of the second box is: ");
        showVolume(box2);
    }

    public static void showVolume(DebugBox aBox) {
        double vol = aBox.getVolume();
        System.out.println(vol);
    }

    public static abstract class DebugBox {
        public abstract void showData();
        public abstract double getVolume();
    }

    public static class FixDebugBox extends DebugBox {
        private int width;
        private int length;
        private int height;

        public FixDebugBox(int w, int l, int h) {
            width = w;
            length = l;
            height = h;
        }

        public void showData() {
            System.out.println("Width: " + width);
            System.out.println("Length: " + length);
            System.out.println("Height: " + height);
        }

        public double getVolume() {
            return width * length * height;
        }
    }
}
