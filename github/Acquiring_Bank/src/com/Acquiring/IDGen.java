package com.Acquiring;

public class IDGen {
	StringBuilder trxid;
	public String generate(int length) {
		trxid = new StringBuilder();
		String Vouwels = "AEIOU";
		String Consonant = "0123456789BCDFGHJKLMNOPQRSTVWXYZ";
		int alt=(int) (System.currentTimeMillis()%2);
		for(int i=0;i<length;i++) {
			if(alt==1) {
				trxid.append(Consonant.charAt((int) (Math.random()*100)%Consonant.length()));
				alt=0;
			}
			else {
				trxid.append(Vouwels.charAt((int) (Math.random()*100)%Vouwels.length()));
				alt=1;
			}
		}
		
		return trxid.toString();
	} 

}
