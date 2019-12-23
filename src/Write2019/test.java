package Write2019;

public class test {
    public static void main(String[] args) {
        Integer a = 133;
        int b = 133;
        Integer c = new Integer(133);
        Integer d = 133;
        System.out.println(a == b); //true
        System.out.println(a == c); //false
        System.out.println(b == c); //true

        System.out.println(a == d); //false
        System.out.println(b == d); //true
        System.out.println(c == d); //false
    }
}
