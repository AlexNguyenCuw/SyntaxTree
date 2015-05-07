
public class VariableEnvirment 
{
private Variable[] variableArray;
	
	
	public VariableEnvirment(Variable theVariable)
	{
		Variable[] variableArray = new Variable[1];
		this.variableArray = variableArray;
		this.variableArray[0] = theVariable;
	}

	public Variable[] getVariableArray() {
		return variableArray;
	}
}
