package reinoutvanbets;

public class Overloading {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(7, 5));
        System.out.println(calcFeetAndInchesToCentimeters(14));

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) ||
                (inches > 12 || inches < 0)) {
            return -1;
        } else {
            double centimeters = (feet * 12) * 2.54;
            centimeters += (inches*2.54);
            return centimeters;
        }
    }


    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches<0){
            return -1;
        }
        else{
            return calcFeetAndInchesToCentimeters(0,inches);
        }
    }



}
