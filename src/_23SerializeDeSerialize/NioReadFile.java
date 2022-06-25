package _23SerializeDeSerialize;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NioReadFile {
	public static void main(String[] args) {
		try {
			Path path = Paths.get("D://DSA/abc.txt");
			List<String> list  = Files.readAllLines(path);
			for(String s: list)
			{
				System.out.println(s);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
