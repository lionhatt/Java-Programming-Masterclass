public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
        
    }

    private static String getDurationString(long minutes, long seconds) {

        if ((minutes >= 0) && (seconds >= 0) && (seconds <=59)) {
            long hours = 0;
            while (minutes >= 60){
                minutes = minutes - 60;
                hours += 1;
            }           
            return hours + "h "+ minutes+"m "+seconds +"s";
        }
        return "Invalid value";
    }

    private static String getDurationString(long seconds) {
        if (seconds >= 0) {
            long minutes = 0;
            while (seconds >= 60){
                seconds = seconds - 60;
                minutes += 1;
            }
            return getDurationString(minutes, seconds);
        }
        return "Invalid value";
    }
}
