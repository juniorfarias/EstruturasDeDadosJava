public class InsertionSortDesc {
	public static void main(String[] args){
		int[] vetor = {1,9,8,7,6,45,89,3};
		int selectedItem;

		for(int k = 0; k < vetor.length; k++){
			System.out.println(vetor[k]);
		}
		for(int i = vetor.length - 1; i > 0; i--){
			int j = i - 1;
			selectedItem = vetor[i];
			while(vetor[j]<selectedItem && j<(vetor.length-1)){
				vetor[j+1] = vetor[j];
				vetor[j] = selectedItem;
				j++;
			}
		}

		System.out.println("Array Ordenado Decrecendo: ");
		for(int l = 0; l < vetor.length; l++){
			System.out.println(vetor[l]);
		}
	}
}