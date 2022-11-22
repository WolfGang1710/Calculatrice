package Operations;

public class Div extends Operation{

    private int a;
    private int b;

    @Override
    public int resultat() {
        return this.a/this.b;
    }

    public Div(int a, int b){
        this.a = a;
        this.b = b;
    }
}
