public class main {

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program");
        // Checking Equals
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(1, 2);
        Point p4 = new Point(3, 5);
        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p3, p4);
        System.out.println("Line 1 is equal to Line 2: " + l1.equals(l2));
        int a = l1.compareTo(l2);
        if (a == -1) {
            System.out.println("l2 is greater than l1");
        }
        else if(a==0){
            System.out.println("L2 is equal to L1");
        }else{
            System.out.println("L2 is smaller to L1");
        }
    }
}