package WeatherStation;

public class WeatherStation {

    public static void main(String[] args) {
        RaspberryPi thermometer = new RaspberryPi((int) (Math.random() * 120), "Fahrenheit");    // generate a random number each time the temperature is requested
        RaspberryPi wind = new RaspberryPi((int) (Math.random() * 120), );
        RaspberryPi clock = new RaspberryPi();
        System.out.println(thermometer);
        System.out.println(wind);
        System.out.println(clock);
        
    }
    
}

class RaspberryPi {
    
    private int current;
    private String text;
    
    public RaspberryPi(int current) {    // constructor - same name as class
        this.current = current;    // this keyword determines that the value is different from the field
        this.text = text;
    }
    
    public static int getCurrent(int current) {
        return current;
    }
    
    public static String getText(String text) {
        return text;
    }
    
    public static void printCurrent(int current) {
        System.out.println(current);
    }
    
    public static void printText(String text) {
        System.out.println(text);
    }
}

/*
Thermometer
>Properties
Current temperature
Units (Fahrenheit, Celsius or Kelvin)
Status (operational or not responding)

>Methods
Get temperature (generate a random number each time the temperature is requested)
Get temperature as a string (include text to match the units)
Check status

Wind
>Properties
Current direction (N, S, NNW, etc) - may be fixed/constant
Speed in knots
Status (operational or not responding)

>Methods
Get wind speed and direction  (generate a random speed each time the temperature is requested)
Get wind direction and speed as a string
Check status

Clock
>Properties
Current time (to get the current time)
import java.util.Calendar;

Calendar calendar = Calendar.getInstance();
int hours = calendar.get(Calendar.HOUR_OF_DAY);
int minutes = calendar.get(Calendar.MINUTE);
int seconds = calendar.get(Calendar.SECOND);
System.out.printf("%d:%d:%d", hours, minutes, seconds);

Format (12 hour or 24 hour)
Status (operational or not responding)

>Methods
Return time as a string
*/