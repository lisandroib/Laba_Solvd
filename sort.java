
public class sort {

	public static void main(String[] args) {
		
		
		int array[]= {7,6,9,5,1,4,3,2,8};
		
		System.out.println("Lista de numeros:");
		for(int i=0;i<array.length;i++) {
			System.out.print("["+array[i]+"]");
			
		}
		
		
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					int temp= array[j+1];
					array[j+1]=array[j];
					array[j]= temp;
					
				}
			}
		}
		
		System.out.println();
		System.out.println("Lista de numeros de menor a mayor:");
		for(int i=0;i<array.length;i++) {
			System.out.print("["+array[i]+"]");
			
		}
		
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]<array[j+1]) {
					int temp= array[j+1];
					array[j+1]=array[j];
					array[j]= temp;
					
				}
			}
		}
		
		System.out.println();
		System.out.println("Lista de numeros de mayor a menor:");
		for(int i=0;i<array.length;i++) {
			System.out.print("["+array[i]+"]");
			
		}
		

	}

}
