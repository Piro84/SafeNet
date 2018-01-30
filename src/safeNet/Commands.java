package safeNet;

public class Commands {
	public Commands() {

	}

	public int[] withdraw(String x, int[] array) {
		int value = Integer.parseInt(x);
		if (value / 1000 > 0) {
			if (array[6] - (value / 1000) > 0) {
				array[6] = array[6] - (value / 1000);
				value = value % 1000;
			} 
			else {
				System.out.println("Failure: insufficient funds");
			}
		}
		if (value / 100 > 0) {
			if (array[5] - (value / 100) > 0) {
				array[5] = array[5] - (value / 100);
				value = value % 100;
			} 
			else {
				System.out.println("Failure: insufficient funds");
			}
		}
		if (value / 50 > 0) {
			if (array[4] - (value / 50) > 0) {
				array[4] = array[4] - (value / 50);
				value = value % 50;
			} 
			else {
				System.out.println("Failure: insufficient funds");
			}
		}
		if (value / 20 > 0) {
			if (array[3] - (value / 20) > 0) {
				array[3] = array[3] - (value / 20);
				value = value % 20;
			}
			else {
				System.out.println("Failure: insufficient funds");
			}

		}
		if (value / 10 > 0) {
			if (array[2] - (value / 20) > 0) {
				array[2] = array[2] - (value / 20);
				value = value % 20;
			}
			else {
				System.out.println("Failure: insufficient funds");
			}

		}
		if (value / 5 > 0) {
			if (array[1] - (value / 5) > 0) {
				array[1] = array[1] - (value / 5);
				value = value % 5;
			} 
			else {
				System.out.println("Failure: insufficient funds");
			}
		}
		if (value / 1 > 0) {
			if (array[0] - (value / 1) > 0) {
				array[0] = array[0] - (value / 1);
				value = value % 1;
			} 
			else {
				System.out.println("Failure: insufficient funds");
			}
		}
		return array;
	}

	public int[] restock(int[] array) {
		for (int i = 0; i < 6; i++) {
			array[i] = 10;
		}
		return array;
	}

	public void I(String[] array, int[] bills) {
		for (int i = 0; i < array.length - 1; i++) {
			array[i + 1] = array[i + 1].substring(1);
			int temp = Integer.parseInt(array[i + 1]);
			if (temp == 1) {
				System.out.println("$1-" + bills[0]);
			}
			if (temp == 5) {
				System.out.println("$5-" + bills[1]);
			}
			if (temp == 10) {
				System.out.println("$10-" + bills[2]);
			}
			if (temp == 20) {
				System.out.println("$20-" + bills[3]);
			}
			if (temp == 50) {
				System.out.println("$50-" + bills[4]);
			}
			if (temp == 100) {
				System.out.println("$100-" + bills[5]);
			}
			if (temp == 1000) {
				System.out.println("$1000-" + bills[6]);
			}
		}
	}
}
