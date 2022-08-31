class Main
{
	public static void reverse(char str[], int k)
	{
		if (k == str.length) {
			return;
		}

		reverse(str, k + 1);

		System.out.print(str[k]);
	}

	public static void main (String[] args)
	{
		char str[] = "h,e,l,l,o".toCharArray();

		System.out.print("");
		reverse(str, 0);
	}
}
