package workshop.basics;
import java.time.LocalTime;

public class RegistrationTimeLeft {
            public static void main(String[]args){
                LocalTime currentTime = LocalTime.now();
                LocalTime registrationEndTime = LocalTime.of(18,59,59);
                 int hoursLeft = registrationEndTime.getHour() - currentTime.getHour();
                 int minutesLeft = registrationEndTime.getMinute() - currentTime.getMinute();
                 int secondsLeft = registrationEndTime.getSecond() - currentTime.getSecond();
                 System.out.print("you have " + hoursLeft + " hours," + minutesLeft + " minutes , and " + secondsLeft + " seconds left to register."); 
            }
        }