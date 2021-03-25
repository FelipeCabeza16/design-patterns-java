public class Client {
    public static void main(String[] args) {
        //CREAR EL CONTEXTO
        String cadena = "paco";
        AbstractExpression tExpression = new TerminalExpression(cadena);
        UppercaseExpression uExpression = new UppercaseExpression(cadena);
        
        

        System.out.println("Expresión literal");
        System.out.println(tExpression.interpret(cadena));
        System.out.println("Expresión no literal (uppercase)");
        System.out.println(uExpression.interpret(cadena.toUpperCase()));
        System.out.println("Expresión literal");
        System.out.println(tExpression.interpret("perro"));
        System.out.println("Expresión no literal (uppercase)");
        System.out.println(uExpression.interpret(cadena.toLowerCase()));
    }
}
