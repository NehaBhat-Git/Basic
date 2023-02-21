public class SwitchChallenge {
    public static void main(String[] args) {
    printDayOfWeek(6);
    printDayOfWeek(7);
    printDayOfWeek(1);
    printDayOfWeek(8);
    printWeekDay(2);
    printWeekDay(4);
    printWeekDay(-2);


    }
    public static void printDayOfWeek(int day){
        switch (day){
            case 0 -> System.out.println(day+" Sunday");
            case 1 -> System.out.println(day+" Monday");
            case 2 -> System.out.println(day+" Tuesday");
            case 3 -> System.out.println(day+" Wednesday");
            case 4 -> System.out.println(day+" Thursday");
            case 5 -> System.out.println(day+" Friday");
            case 6 -> System.out.println(day+" Saturday");
            default -> System.out.println("Invalid value: "+day);
        }
    }
    public static void printWeekDay(int day){
        String dayOfWeek = "Invalid Day";
        if(day == 0 ){
            dayOfWeek ="Sunday";
        }
        else if(day == 1 ){
            dayOfWeek ="Monday";
        }else if(day == 2 ){
            dayOfWeek ="Tuesday";
        }else if(day == 3 ){
            dayOfWeek = "Wednesday";
        }else if(day == 4 ){
            dayOfWeek ="Thursday";
        }else if(day == 5 ){
            dayOfWeek ="Friday";
        }else if(day == 6 ){
            dayOfWeek ="Saturday";
        }
        System.out.println(day+" stands for "+dayOfWeek);
    }
}
