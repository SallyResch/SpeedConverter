public class Main {
    public static void main(String[] args) {
        long miles = SpeedConverter.toMilesPerHour(2);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(-1);
    }
}
