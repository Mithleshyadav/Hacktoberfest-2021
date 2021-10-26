
public class Outerclass {

    class Inner {
        int a = 34;
        // String name = "outer";

        public void displayA() {
            System.out.println(a);

        }
    }

    String city = "delhi";

    public void show() {
        System.out.print("city is " + city);
    }

    public static void main(String[] args) {
        Outerclass obj = new Outerclass();
        obj.show();

        Outerclass.Inner obj1 = obj.new Inner();
        obj1.displayA();
    }
}

//