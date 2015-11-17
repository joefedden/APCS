public class Triangle {
    private double x1, y1;
    private double x2, y2;
    private double x3, y3;
    private String coord1, coord2, coord3;
    private double side1, side2, side3;
    private double angle1, angle2, angle3;
    private double perimeter, area;
    private double height;
    
    public Triangle (double x1,double y1,double x2,double y2,double x3,double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }
    
    public void setDistance() {
        side1 = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        side2 = Math.sqrt(Math.pow((x3-x2),2) + Math.pow((y3-y2),2));
        side3 = Math.sqrt(Math.pow((x3-x1),2) + Math.pow((y3-y1),2));
    }
    
    public void setAngles() {
        angle1 = Math.atan(side1/side2) * (180/Math.PI);
        angle2 = Math.asin(side1/side2) * (180/Math.PI);
        angle3 = Math.acos(side3/side2) * (180/Math.PI);
    }
    
    public void perimeter() {
        perimeter = side1 + side2 + side3;
    }
    
    public void setHeight() {
        height = Math.sqrt(Math.pow((x3-x1),2) + Math.pow((y3-y1),2));
    }
    
    public void area() {
        area = (height * side1) / 2;
    }
    
    public String getCoordinates() {
        coord1 = "(" + x1 + "," + y1 + ")";
        coord2 = "(" + x2 + "," + y2 + ")";
        coord3 = "(" + x3 + "," + y3 + ")";
        
        return "\nCoord1: " + coord1 + "\nCoord2: " + coord2 + "\nCoord3: " + coord3;
    }
    
    public String getSides() {
        return "\nSide1: " + String.valueOf(side1) + "\nSide2: " + String.valueOf(side2) + "\nSide3: " + String.valueOf(side3);
    }
    
    public String getAngles() {
        return "\nAngle1: " + String.valueOf(angle1) + "\nAngle2: " + String.valueOf(angle2) + "\nAngle3: " + String.valueOf(angle3); 
    }
    
    public String getPerimeter() {
        return "\nperimeter: " + String.valueOf(perimeter);
    }
    
    public String getArea() {
        return "\nArea: " + String.valueOf(area);
    }
}