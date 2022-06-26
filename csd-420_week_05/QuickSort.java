
public class QuickSort {
	
	public static void quickSort(int[] list) {
		quickSort(list, 0, list.length -1);
	}
	
	public static void quickSort(int[] list, int first, int last) {
		if (last > first) {
			int pivotIndex = partition(list, first, last);
			quickSort(list, first, pivotIndex -1);
			quickSort(list, pivotIndex + 1, last);
		}
	}
	
	// partition the array list[first..last]
	public static int partition(int[] list, int first, int last) {
		int pivot = list[first]; //choose the first element as the pivot 
		int low = first + 1; // index for forward search
		int high = last; // index for backward search
		
		while (high > low) {
			//search forward from left
			while (low <= high && list[low] <= pivot)
				low++;
			
			// search backward from right
			while  (low <= high && list[high] > pivot)
				high--;
			
			// swap two elements in the list
			if (high > low) {
				int temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
		}
		
		while (high > first && list[high] >= pivot)
			high--;
		
		//swap pivot with list[high]
		if (pivot > list[high]) {
			list[first] = list[high];
			list[high] = pivot;
			return high;
		}
		else {
			return first;
		}
	}
	
	// a test method
	public static void main(String[] args) {
		int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
		quickSort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}
}
