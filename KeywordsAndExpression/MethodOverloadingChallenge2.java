/*
    XXh YYm ZZs
   XX represents number of hours, YY number of minutes, ZZ number of seconds
 */
public class MethodOverloadingChallenge2 {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65,45));
        System.out.println(getDurationString(65,145));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }
    public static String getDurationString(int sec){
        if(sec < 0) {
            return "Invalid data for seconds ( "+sec+" ) must be a +ve value";
        }
            int min = sec / 60;
            return getDurationString(sec / 60, sec % 60);
    }
    public static String getDurationString(int min, int sec){
        if(min < 0) {
            return "Invalid data for minutes ( "+min+" ) must be a +ve value";
        }
        if( sec <= 0 || sec >=59){
            return "Invalid data for seconds( "+sec+ "), must be between 0 and 59";
        }
        int hour = min / 60;
        int remainingMinutes = min % 60;

        return hour +"h "+remainingMinutes+"m "+sec+"s ";
    }

}
