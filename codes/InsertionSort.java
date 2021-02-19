public class InsertionSort {
	public static void main(String[] args){
		int[] vetor = {1,9,8,4,7,6};
		int selectedItem;

		for(int k = 0; k < vetor.length; k++){
			System.out.println(vetor[k]);
		}

		for(int j = 1; j < vetor.length;j++){
			selectedItem = vetor[j];
			int i = j-1;
			while(vetor[i]>selectedItem && i>=0){
				vetor[i+1] = vetor[i];
				vetor[i] = selectedItem;
				i -= 1;
			}
		}

		System.out.println("Array Ordenado: ");
		for(int l = 0; l < vetor.length; l++){
			System.out.println(vetor[l]);
		}
	}
}