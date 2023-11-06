public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        System.out.println(p1);
        p1.setXY(1, 1);
        System.out.println(p1);
        System.out.println("Distance to origin: " + p1.distance());

        MyPoint p2 = new MyPoint(2, 2);
        System.out.println(p2);
        System.out.println("Distance to p1: " + p1.distance(p2));
    }
}
public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance(MyPoint another) {
        return distance(another.x, another.y);
    }

    public double distance() {
        return distance(0, 0);
    }
}

