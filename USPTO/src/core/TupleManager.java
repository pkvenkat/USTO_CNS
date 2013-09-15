package core;


public class TupleManager {
	private Tuple tuple;
	
	public TupleManager(){
		
	}
	public Tuple createNewTuple()
	{
	    return TupleFactory.CreateTuple();
	}
	public void writeCurrentTuple()
	{
		
	}

	public Tuple getCurrentTuple()
	{
		return tuple;
	}
}
