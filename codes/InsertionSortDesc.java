public class InsertionSortDesc {
	public static void main(String[] args){
		int[] vetor = {1,9,8,100,7,6,45,1,89,3};
		int selectedItem;

		for(int k = 0; k < vetor.length; k++){
			System.out.println("Item => "+(k+1)+", Valor=> "+vetor[k]);
		}
	
		for(int j = 1; j < vetor.length;j++){
			selectedItem = vetor[j];
			int i = j-1;
			int aux = i;
			while(vetor[i]<selectedItem && i>=0){
				vetor[i+1] = vetor[i];
				vetor[i] = selectedItem;
				if(i > 0){
					i -= 1;
				}
			}
		}

		System.out.println("Array Ordenado Decrecendo: ");
		for(int l = 0; l < vetor.length; l++){
			System.out.println("Item => "+(l+1)+", Valor=> "+vetor[l]);
		}
	}
}