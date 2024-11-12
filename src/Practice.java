public class Practice {
    public static void main(String[] args) {
        People p = new People();
        p.showPeople();

        People p2 = new People("최선우",20);
        p2.showPeople();

        Run run = new Run();
        run.run();

    }
}
class People {

    String name;
    int age;

    public People() {
        this("이름 없음",1);
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void showPeople() {
        System.out.println(name+","+age);
    }
}
class Run extends People {
    void run() {
        super.showPeople();
        System.out.println("달리기");
    }
}