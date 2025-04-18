class Experiment_5_2{
    String name;
    int age;
    double grade;
    Experiment_5_2(){
        name="Not Given";
        age=0;
        grade=0.0;
    }
    Experiment_5_2(String n) {
        name=n;
        age=0;
        grade=0.0;
    }
    Experiment_5_2(String n,int a) {
        name=n;
        age=a;
        grade=0.0;
    }
    Experiment_5_2(String n,int a,double g) {
        name=n;
        age=a;
        grade=g;
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
    public static void main(String[] args) {
        Experiment_5_2 s1=new Experiment_5_2();
        Experiment_5_2 s2=new Experiment_5_2("Heer");
        Experiment_5_2 s3=new Experiment_5_2("Heer", 18);
        Experiment_5_2 s4=new Experiment_5_2("Heer", 18, 9.5);
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}

