public class TaskRunner extends Game implements Runnable {
    private volatile boolean exit;

    public TaskRunner() {
        this.exit = false;
    }

    public void terminateThread() {
        automaticEnter();
        this.exit = true;
    }

    @Override
    public void run() {
        while(!exit) {
            randomCategory();
        }
        return;
    }
}