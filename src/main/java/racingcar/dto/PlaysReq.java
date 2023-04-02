package racingcar.dto;

public class PlaysReq {
    private final String names;
    private final int count;

    public PlaysReq(String names, int count) {
        this.names = names;
        this.count = count;
    }

    public String getNames() {
        return names;
    }

    public int getCount() {
        return count;
    }
}
