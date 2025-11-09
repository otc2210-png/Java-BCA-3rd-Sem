public class w3_5 {
    public static void main(String[] args) {
        int x1 = 12, y1 = 7;
        int x2 = 10, y2 = 9;

        System.out.println("At A, (x1,y1) = ("+x1+","+y1+")");
        System.out.println("At B, (x2,y2) = ("+x2+","+y2+")");

        double dist = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));

        System.out.println("Distance between A and B = "+dist);
    }
}
