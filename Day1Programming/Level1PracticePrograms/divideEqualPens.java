
public class divideEqualPens {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;
        int nonDistributedPens = pens%students;
        int penPerStudents= pens/students;
        System.out.println("The Pen Per Student is "+ penPerStudents +" and the remaining pen not distributed is "+ nonDistributedPens);

    }
    
}
