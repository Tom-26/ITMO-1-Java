package SMTH;

public enum feeling {
    BAD ("плохая"),
    GOOD ("хорошо"),
    WOORING ("тревожно"),
    HAPPY ("весело"),
    BRILLIANT ("прекрасным");
    private String feel =new String();
    feeling (String feel){
        this.feel=feel;
    }
    @Override
    public String toString(){
        return feel;
    }
}
