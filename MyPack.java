package mypack;

public class MyPackClass {
    public void display() {
        System.out.println("This is mypack.");
    }
}

import mypack.MyPackClass;

public class Test {
    public static void main(String[] args) {
        MyPackClass obj = new MyPackClass();
        obj.display();
    }
}

// will not work properly. need to setup folder structure in an IDE like IntelliJ or Eclipse

