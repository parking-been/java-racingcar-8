package racingcar.domain;

public class Counter {

    private int totalCount;

    public Counter(int totalCount) {
        this.totalCount = totalCount;
    }

    public void decreaseCount(){
        totalCount--;
    }

    public int getTotalCount() {
        return totalCount;
    }

}
