public class cordinatesnumber {
    public static void main (String[]args){

                int x = 7;
                int y = 9;
                if (x > 0 && y > 0) {
                    System.out.println("The coordinate point (" + x + "," + y + ") lies in the First quadrant.");
                } else if (x < 0 && y > 0) {
                    System.out.println("The coordinate point (" + x + "," + y + ") lies in the Second quadrant.");
                } else if (x < 0 && y < 0) {
                    System.out.println("The coordinate point (" + x + "," + y + ") lies in the Third quadrant.");
                } else if (x > 0 && y < 0) {
                    System.out.println("The coordinate point (" + x + "," + y + ") lies in the Fourth quadrant.");
                } else if (x == 0 && y != 0) {
                    System.out.println("The coordinate point lies on the Y-axis.");
                } else if (x != 0 && y == 0) {
                    System.out.println("The coordinate point lies on the X-axis.");
                } else {
                    System.out.println("The coordinate point lies at the Origin.");
                }

            }
        }




