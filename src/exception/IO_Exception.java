package exception;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IO_Exception {

	public static void main(String[] args) {

		// FileNotFoundException(Checked Exception)
		try {
			FileReader fr = new FileReader("D://file.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// UnknownHostException
		try {
			String ip = "127.0.0.1";
			String name = InetAddress.getByName(ip).getCanonicalHostName();
			if ("127.0.0.1".equals(ip)) {
				throw new UnknownHostException("Cannot find DN for IP: " + ip);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		// EOFException
		File file = new File("test.txt");
		DataInputStream dataInputStream = null;
		try {
			dataInputStream = new DataInputStream(new FileInputStream(file));
			while (true) {
				dataInputStream.readInt();
			}
		} catch (EOFException e) {
			e.printStackTrace();// if file exists
		} catch (IOException e) {
			e.printStackTrace();// if file doesn't exists
		}

	}
}
