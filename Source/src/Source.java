import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Source {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLineCoordinates = br.readLine().split(" ");
        int a1 = Integer.parseInt(firstLineCoordinates[0]);
        int b1 = Integer.parseInt(firstLineCoordinates[1]);

        String[] secondLineCoordinates = br.readLine().split(" ");
        int a2 = Integer.parseInt(secondLineCoordinates[0]);
        int b2 = Integer.parseInt(secondLineCoordinates[1]);

        Line firstLine = new Line(a1, b1);
        Line secondLine = new Line(a2, b2);

        int totalSumOfLines = getTotalSumOfLines(firstLine, secondLine);
        System.out.println(totalSumOfLines);

        br.close();
    }


    private static int getTotalSumOfLines(Line firstLine, Line secondLine) {
        // Complete this method
        int AB=0,BA=0;
        if(firstLine.a > firstLine.b) {
            AB = firstLine.a - firstLine.b;
        }
        else {
            AB=firstLine.b - firstLine.a;
        }
        if(secondLine.a > secondLine.b) {
            BA = secondLine.a - secondLine.b;
        }
        else {
            BA=secondLine.b - secondLine.a;
        }
      return AB+BA;
   }


    public static class Line {
        private int a;
        private int b;
        int A = getA();

        public Line(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

    }
}
