public class Car {
    public static void main(String[] args) {

        Car2 car2 = new Car2();

    }
}
class Vehicle {
    Vehicle() {
        System.out.println("Vehicle 생성자 호출");
    }
}

class Car2 extends Vehicle {
    Car2() {
        super();  // 부모 클래스 생성자 호출
        System.out.println("Car 생성자 호출");
    }
}