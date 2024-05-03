public class oops_1 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("yellow");
        System.out.println(p1.color);
        p1.setTips(100);
        System.out.println(p1.Tip);
        p1.color = "red";
        p1.Tip = 300;
        System.out.println(p1.color);
        System.out.println(p1.Tip);
    }
}
class Pen{
    String color;
    int Tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTips(int newTip){
        Tip = newTip;
    }
}