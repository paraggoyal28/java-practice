package Basics.WorkingWithFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LogFilter {
	public static void main(String[] args) {
		String resourceFileName = "/files/server.log";

		Path outputDir = Paths.get("output_files");
		Path outputFilePath = outputDir.resolve("filtered_logs.txt");

		try {
			// 1. Ensure the output directory exists (create if it is missing)
			if (!Files.exists(outputFilePath)) {
				Files.createDirectories(outputDir);
				System.out.println("Created directory: " + outputDir.toAbsolutePath());
			}

			try (InputStream inputStream = LogFilter.class.getResourceAsStream(resourceFileName)) {
				if (inputStream == null) {
					System.err.println("Error: " + resourceFileName + " not found in the database");
					return;
				}

				try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
					BufferedWriter writer = Files.newBufferedWriter(outputFilePath, StandardCharsets.UTF_8)) {
					writer.write("---- FILTERED LOGS-----");
					writer.newLine();

					String line;
					while ((line = reader.readLine()) != null) {
						if (line.isBlank()) continue;
						System.out.println(line);
						if (line.contains("ERROR")) {
							System.out.println(line);
							writer.write(line);
							writer.newLine();
						}
					}
				}
			}
			System.out.println("File successfully written!");
			System.out.println("-> Saved to: " + outputFilePath.toAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
