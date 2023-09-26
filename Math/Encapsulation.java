class Second {
    private int marks;
    private String name;

    public void setMarks(int num) {
        this.marks = num;
    }

    public int getMarks() {
        return marks;
    }

}
public class Encapsulation {
    public static void main(String args[]) {
        Second obj = new Second();
        obj.setMarks(10);
        System.out.println(obj.getMarks());                
    }
}

