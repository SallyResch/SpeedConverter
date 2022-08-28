public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }
        return Math.round(kilometersPerHour/ 1.609);
    }
    //Next lesson starts down here
    public static void printConversion(double kilometersPerHour){

    }
}
