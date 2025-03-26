package hw1;

public class Times {
	public static void main(String[] args) {
		int ttlsecs = 256559;
		int days = ttlsecs / (24 * 3600);
		int rs = ttlsecs % (24 * 3600);

		int hrs = rs / 3600;
		rs %= 3600;

		int mins = rs / 60;
		int secs = rs % 60;

		System.out.println(ttlsecs + "秒為");
		System.out.println(days + "天" + hrs + "小時" + mins + "分" + secs + "秒");

	}

}
