package string;

public class String_SBLDR_SBFR {

	public static void main(String[] args) {
		String_SBLDR_SBFR sbfr = new String_SBLDR_SBFR();
		sbfr.checkTimeString();
		sbfr.checkTimeStringBuilder();
		sbfr.checkTimeStringBuffer();

	}

	private void checkTimeString() {
		String data = new String("");

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			data = data + i;
		}
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}

	private void checkTimeStringBuilder() {
		StringBuilder data = new StringBuilder("");

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			data.append(i);
		}

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}

	private void checkTimeStringBuffer() {
		StringBuffer data = new StringBuffer("");

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			data.append(i);
		}

		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}

}
