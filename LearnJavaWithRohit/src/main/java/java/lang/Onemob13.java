package java.lang;


public final class Onemob13 {
	
    class Inner {
        void test() {
                if (Onemob13.this.flag); {
                        sample();
                }
        }
}
private boolean flag = true;
public void sample() {
        System.out.println("Sample");
}
public Onemob13() {
        (new Inner()).test();
}
public static void main(String args []) {
        new Onemob13();
}
}
