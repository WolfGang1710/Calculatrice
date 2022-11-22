import Operations.*;

public class Calculatrice {

    public Calculatrice(){}

    public int plus(int a, int b){
        return a+b;
    }

    public int moins (int a, int b){ return a-b; }

    public int mult (int a, int b) { return a*b; }

    public int div(int a,int b) {
        if (b == 0)
            throw new IllegalArgumentException("Cannot divide by 0.");
        return a/b;
    }

    public int plus3(int a, int b, int c){return a+b+c;}

    public int calculate(Operation ope){
        return ope.resultat();
    }
}
