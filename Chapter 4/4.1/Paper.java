public class Paper
{
    public static void main(String[] args) {
        //8.5 x 11 sheet of paper
        final double PAPERWIDTH = 8.5; //8.5 inches
        final double PAPERHEIGHT = 11; //11 inches
        
        //milimeter conversion
        final double MILICONVERT = 25.4; //25.4 mm = 1 inch
        
        //Size of paper in milimeters
        final double PAPERWIDTHMILI = MILICONVERT * PAPERWIDTH; //215.9 mm
        final double PAPERHEIGHTMILI = MILICONVERT * PAPERHEIGHT; //279.4 mm
        
        System.out.println("Size of paper in inches:  " + PAPERWIDTH + " x " + PAPERHEIGHT);
        System.out.println("Size of paper in milimeters:  " + PAPERWIDTHMILI + " x " + PAPERHEIGHTMILI);
    }
}
