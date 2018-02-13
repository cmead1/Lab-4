import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        double lengthRectangle, widthRectangle, radiusCircle, sideA, sideB, sideC, areaRectangle, areaCircle, perimeterRectangle, circumferenceCircle, areaTriangle, perimeterTriangle,s;


        System.out.println("Enter length of rectangle (positive integer): ");
        lengthRectangle = scnr.nextDouble();
        System.out.println("Enter width of rectangle (positive integer): ");
        widthRectangle = scnr.nextDouble();
        System.out.println("Now enter the radius of the circle (positive integer): ");
        radiusCircle = scnr.nextDouble();
        System.out.println("Enter side A of triangle (positive integer): ");
        sideA = scnr.nextDouble();
        System.out.println("Enter side B of triangle (positive integer): ");
        sideB = scnr.nextDouble();
        System.out.println("Enter side C of triangle (positive integer): ");
        sideC = scnr.nextDouble();

        s = (sideA + sideB + sideC)/2;
        areaRectangle = lengthRectangle * widthRectangle;
        areaCircle = 3.14 * ((radiusCircle * radiusCircle));
        perimeterRectangle = lengthRectangle + lengthRectangle + widthRectangle + widthRectangle;
        circumferenceCircle = 2 * 3.14 * radiusCircle;
        areaTriangle = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
        perimeterTriangle = sideA + sideB + sideC;

        System.out.println("Area of rectangle: "+areaRectangle );
        System.out.println("Area of circle: "+areaCircle );
        System.out.println("Perimeter of rectangle: "+perimeterRectangle );
        System.out.println("Circumference of circle: "+circumferenceCircle );
        System.out.println("Area of triangle: "+areaTriangle );
        System.out.println("Perimeter of triangle: "+perimeterTriangle );

        double radiusSphere, diameterrectangularPrism, heightrectangularPrism, widthrectangularPrism, heightCylinder, radiusCylinder, surfaceareaSphere, volumeSphere, surfacerarearectangularPrism, volumerectangularPrism, surfaceAreaCylinder, volumeCylinder;

        System.out.println("Enter the radius of the sphere: ");
        radiusSphere = scnr.nextDouble();
        System.out.println("Enter the diameter of the rectangular prism: ");
        diameterrectangularPrism = scnr.nextDouble();
        System.out.println("Enter the height of the rectangular prism: ");
        heightrectangularPrism = scnr.nextDouble();
        System.out.println("Enter the width of the rectangular prism: ");
        widthrectangularPrism = scnr.nextDouble();
        System.out.println("Enter the height of the cylinder: ");
        heightCylinder = scnr.nextDouble();
        System.out.println("Enter the radius of the cylinder: ");
        radiusCylinder = scnr.nextDouble();

        surfaceareaSphere = 4 * 3.14 * (radiusSphere * radiusSphere);
        volumeSphere = 4 * 3.14 * ((radiusSphere * radiusSphere * radiusSphere)/3);
        surfacerarearectangularPrism = 2 * (((heightrectangularPrism * diameterrectangularPrism) + (heightrectangularPrism * widthrectangularPrism) + (diameterrectangularPrism * widthrectangularPrism)));
        volumerectangularPrism = heightrectangularPrism * diameterrectangularPrism * widthrectangularPrism;
        surfaceAreaCylinder = (2 * 3.14 * radiusCylinder * heightCylinder) + (2 * 3.14 * radiusCylinder * radiusCylinder);
        volumeCylinder = 3.14 * (radiusCylinder * radiusCylinder) * heightCylinder;

        System.out.println("The surface area of the sphere is: "+surfaceareaSphere );
        System.out.println("The volume of the sphere is: "+volumeSphere );
        System.out.println("The surface area of the rectangular prism is: "+surfacerarearectangularPrism );
        System.out.println("The volume of the rectangular prism is:  "+volumerectangularPrism );
        System.out.println("The surface area of the cylinder is:  "+surfaceAreaCylinder );
        System.out.println("The volume of the cylinder is:  "+volumeCylinder );

    }
}
