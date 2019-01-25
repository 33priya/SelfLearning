import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferCopy {

	public static void main(String[] args) throws IOException {
		File source = new File(args[0]);
		File dest = new File(args[1]);
		long start = System.currentTimeMillis();
		try (InputStream is = new FileInputStream(source); OutputStream os = new FileOutputStream(dest)) {
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = is.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	    }
		long end = System.currentTimeMillis();
		System.out.println("Time taken in copying file size: " + source.length() / 1024 + " kbs is: "+ (end - start));
	}
}
