package core;

public class TupleFactory {
	
	public static Tuple CreateTuple()
	{
		return new Tuple();		
	}
	
	public static Tuple CreateTuple(Long patentNumber)
	{
		return new Tuple(patentNumber);		
	}

}
