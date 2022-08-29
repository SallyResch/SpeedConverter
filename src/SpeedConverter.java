public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
        //returns a long value
        if(kilometersPerHour < 0){
            return -1;
        }
        return Math.round(kilometersPerHour/ 1.609);
    }
    //Next lesson starts down here
    //Void = does not have to return anything
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour +
                    " km/h = " + milesPerHour +
                    " mi/h");
        }
    }
}
