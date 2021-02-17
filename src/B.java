public class B extends A {

    public int getI() {
        return this.i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public void method() {
        this.i = i * 5;
    }

}