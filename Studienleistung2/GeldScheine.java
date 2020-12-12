public enum GeldScheine{
    FIVE(5),
    TEN(10),
    TWENTY(20),
    FIFTY(50),
    ONEHUNDRED(100),
    TWOHUNDRED(200);

    private int value;

    private GeldScheine(final int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
