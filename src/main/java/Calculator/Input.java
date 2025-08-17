package Calculator;

public class Input {
    private double first;
    private double second;
    private String operator;



    public Input(double first, String operator, double second) {

        this.first = first;
        this.operator = operator;
        this.second = second;
    }

    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }

    public String getOperator() {
        return operator;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
