
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOCopy {

	public static void main(String[] args) throws IOException{
		File source = new File(args[0]);
		File dest = new File(args[1]);
		long start = System.currentTimeMillis();
		try (FileInputStream is = new FileInputStream(source); FileOutputStream os = new FileOutputStream(dest);
				FileChannel inChannel = is.getChannel(); FileChannel outChannel = os.getChannel()) {
			
			ByteBuffer buffer = ByteBuffer.allocate(1024 * 8);
			int i = 0;
			do {
				buffer.clear();
				i = inChannel.read(buffer);
				buffer.flip();
				outChannel.write(buffer);
			} while (i != -1);
		}

		long end = System.currentTimeMillis();

		System.out.println("Time taken in copying file size: " + source.length() / 1024 + " kbs is: "+ (end - start));
	}
}
