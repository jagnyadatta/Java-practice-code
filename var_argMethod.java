public class var_argMethod{
    public static void m1(int... x) {
        System.out.println("var_arg Method:"+x.length);
    }
    public static void main(String[] args) {
        m1();
        m1(10,20);
        m1(10,20,30);
        m1(10,20,30,40);
    }
}