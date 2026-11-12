package Basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StudentReportGenerator {
	public static void main(String[] args) {
		// File placed in src/main/resources
		String resourceFileName = "/files/students.csv";
		// Define your target output directory and file name
		Path outputDir = Paths.get("output_files");
		Path outputPath = outputDir.resolve("student_report.txt");

		try {
			// 1. Ensure the output directory exists (creates if it is missing)
			if (!Files.exists(outputPath)) {
				Files.createDirectories(outputDir);
				System.out.println("Created directory: " + outputDir.toAbsolutePath());
			}

			// 2. Read from resources using Class.getResourceAsStream()
			try (InputStream inputStream  = StudentReportGenerator.class.getResourceAsStream(resourceFileName)) {
				if (inputStream == null) {
					System.err.println("Error: " + resourceFileName + " not found in resource!");
					return;
				}

				try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
					BufferedWriter writer = Files.newBufferedWriter(outputPath, StandardCharsets.UTF_8)) {
					writer.write("----STUDENT GRADE REPORT-----");
					writer.newLine();

					String line;
					while ((line = reader.readLine()) != null) {
						if (line.isBlank()) continue;

						String[] parts = line.split(",");
						String name = parts[0];

						double sum = 0;
						for (int i = 1; i < parts.length; ++i) {
							sum += Double.parseDouble(parts[i].trim());
						}

						double average = sum/(parts.length - 1);
						String status = average >= 60 ? "PASS": "FAIL";

						String reportLine = String.format("Name: %-10s | Avg: %.2f | Status: %s", name, average, status);
						writer.write(reportLine);
						writer.newLine();
					}

					System.out.println("Report successfully generated!");
					System.out.println("-> Saved to: " + outputPath.toAbsolutePath());
				}
			}

		} catch (IOException e) {
			System.err.println("An I/O error has occurred: " + e.getMessage());
		}
	}
}
