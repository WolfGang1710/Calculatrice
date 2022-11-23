package Operations;

public class Plus3 extends Operation {
    private int a, b, c;

    public Plus3(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int resultat(){
        return (this.a+this.b+this.c);
    }
}
