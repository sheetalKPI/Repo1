package com;

public class PrimeNumber {

	public boolean prime(int x)
	{
		boolean flag=true;
		for(int i=2; i<=x/2; i++)
		{
			if(x%i==0)
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
}