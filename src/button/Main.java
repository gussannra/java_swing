package button;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        long startTime = System.nanoTime();
        new MyFrame();
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        double elapsedTimeMilliseconds = elapsedTime / 1_000_000.0;
        System.out.println(elapsedTimeMilliseconds);

        try {
            copyStats(elapsedTimeMilliseconds);
        } catch (IOException ex) {
            System.out.println("Something went wrong");
            ex.printStackTrace();
        }
    }

    public static void copyStats(double elapsedTimeMilliseconds) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("data/elapsedTimeStats.csv", true))) {
            bw.write(String.valueOf(elapsedTimeMilliseconds));
            bw.newLine();
        } catch (IOException ex) {
            System.out.println("Error with the file");
            ex.printStackTrace();
        }
    }
}