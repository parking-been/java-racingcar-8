package racingcar.domain;

public class Counter {
    private int currentCount;
    private int totalCount;

    public Counter(int totalCount) {
        this.totalCount = totalCount;
        this.currentCount = totalCount;
    }

    public void decreaseCount(){
        currentCount--;
    }

    public int getCurrentCount() {
        return currentCount;
    }
    public boolean isFirstCount(){
        return this.totalCount-1 == this.currentCount;
    }

}
