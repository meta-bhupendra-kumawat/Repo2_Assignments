
public class ArrOperation {
	
	public int maxMirror(int arr[])
	{
		int count = 0, max=0;
		for(int i=0; i<arr.length; i++)
		{
			int temp = i,temp2;
			for(int j=0; j<arr.length; j++)
			{
				temp2 = j;
				if(!(temp<arr.length)) {

					System.out.println("Len ENd Count->"+count);
					if(count > max)
					{
						max = count;
					}
					temp = i;
					break;	
				}
				
				if( arr[temp] == arr[arr.length - 1 - j])
				{		System.out.println("arr="+arr[temp]+"  i="+i+" temp="+temp+" j="+j);
					count++;
					temp++;
				}else{					System.out.println(" N"+" temp="+temp+" j="+j);
					if(count > max)
					{
						System.out.println("Count->"+count);
						max = count;
					}
					if(temp!=i)
					{
						j=temp2-1;
					}
					temp=i;
					count = 0;	
				}				
			}
			if(count > max)
			{
				System.out.println("Count->"+count);
				max = count;
			}
			count = 0;
		}
		return max; 
	}
	
	
	public int countClumps(int arr[])
	{
		int count = 0, flag = 0;
		for(int i=0; i<arr.length - 1; i++)
		{
			   if( arr[i] == arr[i+1])
			   {
				   flag = 1;
			   }else{
				   if(flag == 1)
				   {
					   count ++;
					   flag = 0;
				   }
			   }
			   
		}
		if(flag == 1)
			count++;
		return count;
	}
	
	public int[] fixXY(int arr[])
	{
		int fixed[] = new int[arr.length];
		
		return fixed;
	}

}
