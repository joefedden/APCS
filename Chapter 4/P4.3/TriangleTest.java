public class TriangleTest {
    public static void main(String[] args) {
        Triangle tri = new Triangle(0,0,0,5,5,0);
        
        tri.setDistance();
        tri.setAngles();
        tri.perimeter();
        tri.setHeight();
        tri.area();
        
        System.out.println("Triangle");
        System.out.println(tri.getCoordinates());
        System.out.println(tri.getAngles());
        System.out.println(tri.getSides());
        System.out.println(tri.getPerimeter());
        System.out.println(tri.getArea());
    }
}