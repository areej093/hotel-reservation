package hotel;

/**
 * This class represents a custom thread utility.
 */
class CustomThread {

    /**
     * Sleeps for the specified number of milliseconds.
     *
     * @param millis The number of milliseconds to sleep.
     * @throws InterruptedException If the thread is interrupted while sleeping.
     */
    public static void sleep(long millis) throws InterruptedException {
        Thread.sleep(millis);
    }
}

