package Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
  public static void main(String[] args) throws IOException {
    int i;
    FileInputStream fin = null;
    FileOutputStream fout = null;

    try {
      // open input file
      if (args.length < 2) {
        System.out.println("Usage: java Copyfile <from> <to>");
        return;
      }

      // Open file input and output files
      fin = new FileInputStream(args[0]);
      fout = new FileOutputStream(args[1]);

      // Copy file loop
      do {
        i = fin.read();
        if (i != -1) {
          fout.write(i);
        }
      } while (i != -1);
      System.out.println("File copied successfully.");
    } catch (FileNotFoundException e) {
      System.out.println("Input or output file not found");
    } catch (IOException e) {
      System.out.println("File error during reading/writing");
    } finally {
      // Always close streams safely in the finally block
      try {
        if (fin != null) fin.close();
      } catch (IOException e) {
        System.out.println("Error closing input files.");
      }
      try {
        if (fout != null) fout.close();
      } catch (IOException e) {
        System.out.println("Error closing output files.");
      }
    }
	}
}
