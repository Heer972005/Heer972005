class Experiment_5_1 {
    int x, y;
    Experiment_5_1() {
        x = 0;
        y = 0;
    }
    Experiment_5_1(int a, int b) {
        x = a;
        y = b;
    }
    Experiment_5_1(Experiment_5_1 obj) {
        x = obj.x;
        y = obj.y;
    }
    void show() {
        System.out.println("x = " + x + ", y = " + y);
    }
    public static void main(String[] args) {
        Experiment_5_1 obj1 = new Experiment_5_1();
        Experiment_5_1 obj2 = new Experiment_5_1(5, 10); 
        Experiment_5_1 obj3 = new Experiment_5_1(obj2); 
        obj1.show();
        obj2.show();
        obj3.show();
    }
}
