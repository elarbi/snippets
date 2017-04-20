package my.java.snippets.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadWriteFiles {
	public static void main(String[] args) {
		Charset charset = Charset.forName("US-ASCII");
	String s = "BOF";
	try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("tmp/file.txt"), charset)) {
	    writer.write(s, 0, s.length());
	} catch (IOException x) {
	    System.err.format("IOException: %s%n", x);
	}	
	}
}
