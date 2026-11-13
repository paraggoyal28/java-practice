package Basics.WorkingWithFiles;

import java.io.File;

public class DirList {

	private static void recurse(File file) {
		if (file.isDirectory()) {
			String[] filePaths = file.list();
			  if (filePaths != null) {
				for (String filePath : filePaths) {
				  File f = new File(file + "/" + filePath);
				  if (f.isDirectory()) {
					recurse(f);
				  } else {
					System.out.println(f.getAbsolutePath());
				  }
				}
			}
		} else {
			System.out.print(file.getAbsolutePath());
		}
	}

	public static void main(String[] args) {
		String dirName = "java";
		File f = new File(dirName);
		recurse(f);

	}
}
