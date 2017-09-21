
public class Integer {
	public int iValue;

	public Integer(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	public boolean isEven() {
		if (iValue%2 == 0) 
			
		    return true;
		else return false;
		}
	public boolean isOdd() {
		if(iValue%2!=0)
			return true;
		else return false;
		}
	public boolean isPrime() {
		boolean prime= true;
		for(int x = 2; x<= this.iValue/2;x++) {
			if(this.iValue%x==0) {
				prime= false;}
	    else prime = true;
						
						
			} 
		
		return prime;
	}
	public static boolean isEven(int NewiValue) {
		
        if (NewiValue%2 == 0) 
			
		    return true;
		else return false;
		
	}
	public static boolean isOdd(int NewiValue) {
		if(NewiValue%2!=0)
			return true;
		else return false;
	
		
	}
	public static boolean isPrime(int NewiValue) {
		boolean prime= true;
		for(int x = 2; x<= NewiValue/2;x++) {
			if(NewiValue%x==0) {
				prime= false;}
	    else prime = true;

		
	}
		return prime;}
	public static boolean isEven(Integer NewiValue) {
		
         if (NewiValue.getiValue()%2 == 0) 
			
		    return true;
		else return false;
		
	}
	public static boolean isOdd(Integer NewiValue) {
		if(NewiValue.getiValue()%2!=0)
			return true;
		else return false;
	
		
	}
	public static boolean isPrime(Integer NewiValue) {
		boolean prime= true;
		for(int x = 2; x<= NewiValue.getiValue()/2;x++) {
			if(NewiValue.getiValue()%x==0) {
				prime= false;}
	    else prime = true;

		
	}
		return prime;
		

}
	public boolean equals(int NewiValue) {
		if(NewiValue == this.iValue)
			return true;
		else return false;
	}
	public boolean equals(Integer NewiValue) {
		if(NewiValue.getiValue() == this.iValue)
			return true;
		else return false;
	}
}






