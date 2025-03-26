package hw1;

public class Five {
	public static void main(String[] arg) {
		System.out.println(5 + 5);
		// 數值5+數值5,相加為數值55
		System.out.println(5 + '5');
		// 數值5+字元5，Unicode 碼位為 U+0035，ASCII 碼為 53，相加為數值58
		System.out.println(5 + "5");
		// 數值5+字串5，字串55
	}

}
