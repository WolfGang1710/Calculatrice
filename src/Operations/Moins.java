package Operations;

public class Moins extends Operation{

    private int a,b;

    public Moins(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int resultat(){ return this.a-this.b; }
}
