public class UppercaseExpression implements AbstractExpression {

    private String data;

    public UppercaseExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (data.toUpperCase().equals(context))
            return true;
        return false;
    }
    
}
