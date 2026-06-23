import java.io.*;
import java.util.*;
public class Day8 {
    public static void main(String[] args) {
        String inputFile = "students.txt";
        String outputFile = "reportcard.txt";
        try {
            File file = new File(inputFile);
            Scanner sc = new Scanner(file);
            FileWriter fw = new FileWriter(outputFile, true); 
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] data = line.split(",");
                String name = data[0];
                int m1 = Integer.parseInt(data[1]);
                int m2 = Integer.parseInt(data[2]);
                int m3 = Integer.parseInt(data[3]);
                double average = (m1 + m2 + m3) / 3.0;
                fw.write("Student: " + name + "\n");
                fw.write("Average Marks: " + average + "\n");
                fw.write("\n");
            }
            sc.close();
            fw.close();
            System.out.println("Report card generated successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: Student file not found.");
        } catch (IOException e) {
            System.out.println("Error while writing report card.");
        }
    }
}