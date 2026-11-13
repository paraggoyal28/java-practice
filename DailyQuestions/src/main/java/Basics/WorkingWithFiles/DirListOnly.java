package Basics.WorkingWithFiles;

import java.io.File;
import java.io.FilenameFilter;

public class DirListOnly {
	public static void main(String[] args) {
		String dirName = "java";
		File file = new File(dirName);
    	FilenameFilter only = new OnlyExt("txt");
		String s[] = file.list(only);

		for (String f: s) {
			System.out.println(f);
		}
	}
}
