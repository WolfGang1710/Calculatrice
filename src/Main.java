import Operations.*;

public class Main {
    public static void main(String[] args) {
        Calculatrice c = new Calculatrice();
        System.out.println("Question 3.5.");
        System.out.println("2+3 : plus(2,3) : " + c.plus(2,3));
        System.out.println("1+2+3 : plus3(1,2,3) : " + c.plus3(1,2,3));
        System.out.println("1+2+3+4 : plus(plus3(1,2,3),4) : " + c.plus(c.plus3(1,2,3),4));
        System.out.println("\nQuestion 3.6.");
        System.out.println("4*(3+1) : mult(4,plus(3,1)) : " + c.mult(4,c.plus(3,1)));
        System.out.println("(3+2-1)/2 : div(moins(plus(3,2),1),2) : " + c.div(c.moins(c.plus(3,2),1),2)+ "\n");


        System.out.println("Question 4.4. ");

        Operation o = new Plus3(20,30,60);
        System.out.println("20+30+60 : " + c.calculate(o));

        Operation op = new Mult(10,20);
        System.out.println("10*20: " +  c.calculate(op));

    }
}
