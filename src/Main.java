import java.util.*;

public class Main {
    public static Main obj = new Main();
    public static void main(String[] args) throws Exception {        
        obj.startTimer();
    }

    public void startTimer() throws InterruptedException {
        Timer timer = new Timer();
        Time time = new Time();
        TimerTask schedule = new Time();
        time.stopTime(timer, obj, schedule);
    }
}
