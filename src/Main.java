public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener doneListener = result -> System.out.println("Success: " + result);
        OnTaskErrorListener errorListener = error -> System.err.println("Error: " + error);

        Worker worker = new Worker(doneListener, errorListener);
        worker.start();
    }
}