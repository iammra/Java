package Practice;

public class _25_NumberOfObjects {
	
	private static int count;

	public _25_NumberOfObjects() {
		count++;
	}

	public static void main(String[] args) {
		

		//creating objects  
		_25_NumberOfObjects ob1 = new _25_NumberOfObjects();  
		_25_NumberOfObjects ob2 = new _25_NumberOfObjects();  
		_25_NumberOfObjects ob3 = new _25_NumberOfObjects();  
		_25_NumberOfObjects ob4 = new _25_NumberOfObjects();  
		_25_NumberOfObjects ob5 = new _25_NumberOfObjects();  
		//prints number of objects  
		System.out.print("Total Number of Objects: " + _25_NumberOfObjects.count); 
		
	}

}
