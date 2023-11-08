public class OuterClass {
    public void display() {
        System.out.println("This is the display method of the outer class");
    }

    public class InnerClass {
        public void display() {
            System.out.println("This is the display method of the inner class");
        }
    }
}
public class NestedClass {
    public static void main(String[] args) {
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();

        outerObject.display();
        innerObject.display();
    }
}

