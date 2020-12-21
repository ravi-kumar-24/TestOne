package test.ravi;


public class BolleanLocalVariable {

    public void test() {
        boolean b1 = true;
        boolean b2 = fix(b1);
        System.out.println(b1 + " " + b2);
    }

    public boolean fix(boolean b1) {
        // TODO Auto-generated method stub
        b1 = false;
        return b1;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BolleanLocalVariable B = new BolleanLocalVariable();
        B.test();

        try{
            System.exit(0);
        }finally{
            System.out.println("Hi i am in finally block");
        }
    }
}