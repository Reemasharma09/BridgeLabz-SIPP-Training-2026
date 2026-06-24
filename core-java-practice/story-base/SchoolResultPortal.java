import java.io.*;
import java.util.*;

public class SchoolResultPortal {

    public static void main(String[] args) {

        String inputFile = "students.txt";
        String outputFile = "reportcard.txt";

        try {
            BufferedReader reader =
                    new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer =
                    new BufferedWriter(new FileWriter(outputFile, true));

            String line;

            writer.write("\nREPORT CARD\n");

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];

                int mark1 = Integer.parseInt(data[1]);
                int mark2 = Integer.parseInt(data[2]);
                int mark3 = Integer.parseInt(data[3]);

                double average =
                        (mark1 + mark2 + mark3) / 3.0;

                writer.write("Name    : " + name + "\n");
                writer.write("Marks   : "
                        + mark1 + ", "
                        + mark2 + ", "
                        + mark3 + "\n");

                writer.write("Average : "
                        + String.format("%.2f", average)
                        + "\n");

                writer.write("\n");
            }

            reader.close();
            writer.close();

            System.out.println(
                    "Report cards generated successfully in "
                            + outputFile);

        }

        catch (FileNotFoundException e) {

            System.out.println(
                    "Error: Student file not found! Please check "
                            + inputFile);
        }

        catch (IOException e) {

            System.out.println(
                    "Error while reading/writing file: "
                            + e.getMessage());
        }

        catch (Exception e) {

            System.out.println(
                    "Unexpected Error: "
                            + e.getMessage());
        }
    }
}