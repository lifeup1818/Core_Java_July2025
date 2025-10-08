package arraysconcept;

import java.util.Arrays;

public class Assignment {

	public static void main(String[] args) {
		int[] age = { 2, 4, 3, 1, 5, 8, 7 };

		int temp;

		for (int i = 0; i < age.length; i++) {
			for (int j = i + 1; j < age.length; j++) {
				if (age[i] > age[j]) {
					temp = age[i];
					age[i] = age[j];
					age[j] = temp;
				}
			}
		}

		for (int i : age) {
			System.out.println(i);
		}

	}

}
