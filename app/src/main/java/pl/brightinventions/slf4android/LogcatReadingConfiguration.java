package pl.brightinventions.slf4android;

class LogcatReadingConfiguration {
    private boolean shouldClear;

    public LogcatReadingConfiguration clearLogcat(boolean shouldClear) {
        this.shouldClear = shouldClear;
        return this;
    }

    public boolean shouldClear() {
        return shouldClear;
    }
}
