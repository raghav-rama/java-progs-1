// Define the Resizable interface
public interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

// Define the Rectangle class that implements the Resizable interface
public class Rectangle implements Resizable {
    private int width;
    private int height;

    // Constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Implement the resizeWidth method
    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }

    // Implement the resizeHeight method
    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }

    // Method to display the current size of the rectangle
    public void displaySize() {
        System.out.println("Width: " + this.width + ", Height: " + this.height);
    }
}
public class Resize {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        rect.displaySize(); // Outputs: Width: 10, Height: 20

        rect.resizeWidth(30);
        rect.resizeHeight(40);
        rect.displaySize(); // Outputs: Width: 30, Height: 40
    }
}

