package module7package;


public class module7test {

    public static void main(String[] args) {

        Point p1 = new Point();

        p1.x = 2.5;
        p1.y = 3.5;

        System.out.println(p1.x);
        System.out.println(p1.y);
        
        
    }
    
    static class Point{
        //declare varibales used 
        double x;
        double y;
    }
}
