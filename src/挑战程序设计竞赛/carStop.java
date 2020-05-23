package 挑战程序设计竞赛;


class Car {
    double start;
    double leave;

    public Car(double start, double leave) {
        this.start = start;
        this.leave = leave;
    }

    public double money() {
        return (leave - start) * 10;
    }
}

public class carStop {
    public static void main(String[] args) {
        Car car = new Car(10.30, 12);
        System.out.println(car.money());
    }
}




