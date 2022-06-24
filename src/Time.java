import java.util.*;

public class Time extends TimerTask {
    public static GameBegin game = new GameBegin();
    
    public void run() {
        synchronized(Main.obj){
            System.out.println("\nTimes up! 2 minutes is over.");
            Main.obj.notify();
        }
    }

    public void stopTime(Timer timer, Main obj, TimerTask schedule) throws InterruptedException {
        timer.schedule(schedule, 2000);
        game.queryStartGame();
        
        synchronized(obj) { 
            obj.wait(); 
            timer.cancel();
        }

        timer.purge();
    }
}