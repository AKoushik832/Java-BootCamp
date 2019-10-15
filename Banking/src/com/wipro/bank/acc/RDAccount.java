package com.wipro.bank.acc;
public class RDAccount extends Account {
	int tenure;
	float principal;
	public RDAccount(int tenure, float principal)
	{
		this.tenure=tenure;
		this.principal=principal;
	}
	@Override
	public float calculateInterest()
	{
		int n=4;
		float Interest=0.0f;
		int tn=tenure*12;
		float r=rateOfInterest/100;
		
		for(int i=0;i<tn;i++)
		{
			Interest=Interest+principal*(float)(Math.pow(1+(r/n),n*((tn-i)/12.0))-1);
		}
		// TODO Auto-generated method stub
		return Interest;
	}

	@Override
	public float calculateAmountDeposited() 
	{
	// TODO Auto-generated method stub
		return principal*tenure*12;
	}

}