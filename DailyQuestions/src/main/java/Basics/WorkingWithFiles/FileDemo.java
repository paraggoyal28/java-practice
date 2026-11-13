package Basics.WorkingWithFiles;

import java.io.File;

public class FileDemo {
  static void p(String s) {
    System.out.println(s);
  }

  public static void main(String[] args) {
    File file = new File("java/COPYRIGHT.txt");

	p("File Name: " + file.getName());
	p("Path: " + file.getPath());
	p("Abs Path: " + file.getAbsolutePath());
	p("Parent: " + file.getParent());
	p(file.exists() ? "exists" : "does not exists");
	p(file.canWrite() ? "is writable": "is not writable");
	p(file.canRead() ? "is readable" : "is not readable");
	p("is " + (file.isDirectory() ? "" : "not " + "a directory"));
	p(file.isFile() ? " is normal file" : "might be a named file");
	p(file.isAbsolute() ? "is absolute" : "is not absolute");
	p("File last modified: " + file.lastModified());
	p("File size: " + file.length() + " bytes");
  }
}
