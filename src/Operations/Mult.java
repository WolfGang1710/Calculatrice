package Operations;

public class Mult extends Operation{

    private  int a,b;

    public Mult(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int resultat(){
        return this.a*this.b;
    }
}
