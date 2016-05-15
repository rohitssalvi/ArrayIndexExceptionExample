package arrayIndexExceptionExample;

public class ArrayIndexEceptionExample {
	public static void main(String[] args) {
		
		ShowElemet show1=new ShowElemet();
		try{
		show1.showArray();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("You Are Trying To Enter in given Array more then Array size");
		}
	}

}

class ShowElemet{
	
	char[] data={'A','B','C','D','E'};
	
	
	public void showArray() throws ArrayIndexOutOfBoundsException
	{
		for(int i=0;i<data.length+4;i++)
		{
			System.out.println(data[i]);
		}
	}
	
	
}
