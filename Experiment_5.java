class Experiment_5 {
    int a, b;
    Experiment_5() {
        a = 0;
        b = 0;
    }
    Experiment_5(int x) {
        a = x;
        b = 0;
    }
    Experiment_5(int x, int y) {
        a = x;
        b = y;
    }
    void display() {
        System.out.println("a="+a+",b="+b);
    }
    void display(String msg) {
        System.out.println(msg+":a="+a+",b="+b);
    }
    void display(int z) {
        System.out.println("Sum of a + b + z = " + (a + b + z));
    }
    public static void main(String[] args) {
        Experiment_5 obj1=new Experiment_5();
        Experiment_5 obj2=new Experiment_5(10);
        Experiment_5 obj3=new Experiment_5(10, 20);

        obj1.display();
        obj2.display("Single parameter constructor");
        obj3.display(30);  // uses method with int parameter
    }
}
