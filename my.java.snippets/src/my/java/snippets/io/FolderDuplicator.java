package my.java.snippets.io;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

/**
 * Duplidates an input folder and its sub files into renamed folders Usage: java
 * -jar cloneFolder.jar sourceDirPath targetDirPath clone1Name[, clone2name,
 * ...]
 * 
 * @author elarbiaboussoror
 *
 */

public class FolderDuplicator {

	public static void main(String[] args) {
		if (args.length < 2) {
			System.err.println("Usage error: not enough arguments");
			return;
		}

		// get folder path argument
		String srcFolderPath = args[1];

		// create a copy and rename the new folder
		List<String> folderNames = new ArrayList<String>();
		for (int i = 2; i < args.length; i++) {
			folderNames.add(args[i]);
		}

		for (String fName : folderNames) {
			try {
				cloneFolder(srcFolderPath, fName);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	private static void cloneFolder(String srcFolderPath, String fName)
			throws IOException {

		Path srcPath = Paths.get(srcFolderPath + "/__MODEL__");
		Path targetPath = Paths.get(srcFolderPath + "/" + fName);

		Files.copy(srcPath, targetPath, StandardCopyOption.REPLACE_EXISTING);

		DirectoryStream<Path> newDirectoryStream = Files
				.newDirectoryStream(srcPath);

		for (Path path : newDirectoryStream) {
			String fileName = createName(path.getFileName().toString(), fName);
			Path clone = Paths.get(targetPath.toString(), fileName);
			Path newFile = Files.copy(path, clone,
					StandardCopyOption.REPLACE_EXISTING);
		}

	}

	private static String createName(String originalName, String fileName) {
		String[] splitted = originalName.split("\\.");
		return splitted[0]+"_"+fileName+"."+splitted[1];
	}

}
