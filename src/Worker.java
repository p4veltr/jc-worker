public class Worker {
    private final OnTaskDoneListener callback;
    private final OnTaskErrorListener callbackError;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener callbackError) {
        this.callback = callback;
        this.callbackError = callbackError;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                callbackError.onError("Task " + i + " runtime error!!!");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}
