package CarParts;

public abstract class CarPart {
    private final String partNum;

    protected CarPart(String partNum) {
        this.partNum = partNum;
    }

    public String getPartNum() {
        return partNum;
    }
}
