public class TaskRunner extends Game implements Runnable {
    private volatile boolean exit;
    public String currentPlayer;

    public TaskRunner() {
        this.exit = false;
    }

    public void terminateThread() {
        this.exit = true;
    }

    @Override
    public void run() {
        while(!exit) {
            System.out.println("########################################################################################");
            System.out.println("\nThe game has been started!\n");
            System.out.println("########################################################################################");
            randomCategory(currentPlayer);
        }
        return;
    }
}