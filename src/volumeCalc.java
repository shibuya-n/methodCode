import java.util.*;

public class volumeCalc {
    double height;
    double width;
    double length;

    double radius;

    String type;

    double pi = 3.14;

    public static String type(){
        System.out.println("What shape? (Square Pyramid, Cylinder, Sphere)");
        return getUserInput().toLowerCase().strip();
    }
    public static String getUserInput() {
        Scanner input = new Scanner(System.in);
        String response = input.nextLine();

        return response;
    }

    public static double getUserVar() {
        Scanner input = new Scanner(System.in);
        double response = input.nextDouble();

        return response;
    }


    public volumeCalc(String e){

        type = e;

        if (e.equals("cylinder")){
            System.out.println("Insert your radius");
            radius = getUserVar();

            System.out.println("Insert your height");
            height = getUserVar();
        }
        else if (e.equals("sphere")) {
            System.out.println("Insert your radius");
            radius = getUserVar();
        }
        else {
            System.out.println("Insert your width");
            width = getUserVar();
            System.out.println("Insert your height");
            height = getUserVar();
            System.out.println("Insert your length");
            length = getUserVar();

        }

    }

    public void calculate() {

        double result;

        if (type.equals("cylinder")){
            result = pi * Math.pow(radius, 2) * height;
            System.out.println("Your cylinder's volume = " + result);
        }
        else if (type.equals("sphere")){

            result = ((double) 4 /3) * pi * Math.pow(radius, 3);
            System.out.println("Your sphere's volume = " + result);
        }
        else {
            double area = width * length;
            result = Math.pow(area, 2) * ((height/3));
            System.out.println("Your pyramid's volume = " + result);
        }
    }




}
