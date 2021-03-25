public class TerminalExpression implements AbstractExpression {
    private String data;

    //EXPRESION LITERAL
    public TerminalExpression(String data) {
        this.setData(data);
    }

    @Override
    public boolean interpret(String context) {
        if (context.equals(data))
            return true;
        return false;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
