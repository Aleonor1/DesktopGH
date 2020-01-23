package swing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RuntimeExec {
	public StreamWrapper getStreamWrapper(InputStream is, String type) {
		return new StreamWrapper(is, type);
	}

	public class StreamWrapper extends Thread {
		InputStream is = null;
		String type = null;
		String message = null;
		List<String> topics =new ArrayList<>();

		public String getMessage() {
			return message;
		}

		StreamWrapper(InputStream is, String type) {
			this.is = is;
			this.type = type;
		}

		public void run() {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				StringBuffer buffer = new StringBuffer();
				String line = null;
				while ((line = br.readLine()) != null) {
					buffer.append(line);// .append("\n");
				}
				message = buffer.toString();
				boolean bool = false;
				String st = "";
				for (int i = 0; i < message.length(); i++) {
					char c = message.charAt(i);
					if (c == '"') {
						if (bool == true) {
							bool = false;
							topics.add(st);
							st = "";
						}
					} else {
						st += c;
					}
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

}
