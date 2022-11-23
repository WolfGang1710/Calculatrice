package Operations;

public class Plus extends Operation {

    private int a,b;

    public Plus(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public int resultat(){
        return this.a+this.b;
    }

}
