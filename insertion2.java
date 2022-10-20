package Oct_3;

public class insertion2 extends inser {
	@Override
	public void sort() {

		int[] array1 = { 9, 5, 1, 4, 3 };
		System.out.println("Before Sorting");
		for (int i = 0; i < array1.length; i++) {

			System.out.print(array1[i] + " ");
		}

		for (int i = 1; i < array1.length; i++) {
			int key = array1[i];
			int j = i - 1;
			while (j >= 0 && key < array1[j]) {
				array1[j + 1] = array1[j];
				--j;
			}

			array1[j + 1] = key;
		}
		System.out.println();
		System.out.println("After Sorting");
		for (int i = 0; i < array1.length; i++) {

			System.out.print(array1[i] + " ");
		}

	}

	public static void main(String args[]) {
		insertion2 i = new insertion2();
		i.sort();
	}

}
