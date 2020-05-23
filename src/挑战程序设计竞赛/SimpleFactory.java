package 挑战程序设计竞赛;

public class SimpleFactory {
    class Factory {
        public Vehicle produce(String type) {
            Vehicle v = null;
            if (type.equals("car")) {
                v = new Car();
                return v;
            }
            if (type.equals("bus")) {
                v = new Car();
                return v;
            }
            return v;
        }
    }

    //交通工具
    interface Vehicle {
        void run(); //抽象方法
    }

    class Car implements Vehicle {
        public void run() {
            System.out.println("car run");
        }
    }

    class Bus implements Vehicle {
        public void run() {
            System.out.println("bus run");
        }
    }
}

