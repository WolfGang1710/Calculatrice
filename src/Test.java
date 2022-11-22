public class Test {

    Calculatrice c;

    private void testMult()
    {
        assert c.mult(1, 1)==1;
        assert c.mult(0, 1)==0;
        assert c.mult(1, 0)==0;
        assert c.mult(20, 10)==200;
        assert c.mult(2, 12)==24;
        assert c.mult(-1, 12)==-12;
        assert c.mult(1, -12)==-12;
    }

    private void testPlus()
    {
        assert c.plus(1, 1)==2;
        assert c.plus(0, 1)==1;
        assert c.plus(1, 0)==1;
        assert c.plus(20, 10)==30;
        assert c.plus(2, 12)==14;
        assert c.plus(-2, 12)==10;
        assert c.plus(2, -12)==-10;
    }

    private void testPlus3()
    {
        assert c.plus3(1, 1, 0)==2;
        assert c.plus3(0, 1, 5)==6;
        assert c.plus3(1, 0, -4)==-3;
        assert c.plus3(20, 10, 3)==33;
        assert c.plus3(2, 12, 2)==16;
        assert c.plus3(-2, 12, -20)==-10;
        assert c.plus3(2, -12, 20)==0;
    }

    private void testMoins()
    {
        assert c.moins(1, 1)==0;
        assert c.moins(0, 1)==-1;
        assert c.moins(1, 0)==1;
        assert c.moins(20, 10)==10;
        assert c.moins(2, 12)==10;
        assert c.moins(-2, 12)==-14;
        assert c.moins(2, -12)==14;
    }

    private void testDiv()
    {
        assert c.div(1, 1)==1;
        assert c.div(0, 1)==0;
        assert c.div(20, 10)==2;
        assert c.div(2, 12)==0;
        assert c.div(-2, 12)==0;
        assert c.div(2, -12)==0;

        boolean thrown = false;
        try {
            c.div(1,0);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        assert thrown;
    }

    private Test()
    {
        this.c = new Calculatrice();
    }


    public static void testMain(){
        Test test= new Test();
        test.testMult();
        test.testPlus();
        test.testMoins();
        test.testDiv();
        test.testPlus3();
    }
}
