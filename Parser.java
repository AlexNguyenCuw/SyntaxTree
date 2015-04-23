
public class Parser 
{
	private String theStmt;
	private int pos; //where am I in the theStmt string
	String fStmt = "";
	public Parser(String theStmt)
	{
		this.theStmt = theStmt;
		this.pos = 0;
	}
	
	void parse()
	{
		this.parse_stmt();
	}
	
	private void parse_stmt()
	{
		//Print each time it reads something like:
		// Read: VarName = a
		// Reading: Math-Expr
		
		//read a var name
		//read a math_expr
		char[] charArray = theStmt.toCharArray();
		System.out.println("Reading Left: ");

		for(int i = 0; i < charArray.length; i++)
		{
			
			parse_math_expr(charArray[i]);
		}
		
		System.out.println(fStmt);
	}
	
	private void parse_math_expr(char c)
	{
		//Display
		//Reading Left:
		//Read OP = *
		//Reading Right

		//read left
		//read op
		//read right
		if(c == '+')
		{
			System.out.println("Reading OP:" + c);
			System.out.println("Reading Right");
			fStmt += c;
		}
		else if(c == '-')
		{
			System.out.println("Reading OP:" + c);
			fStmt += c;
		}
		else if (c == '/')
		{
			System.out.println("Reading OP:" + c);
			fStmt += c;
		}
		else if(c ==  '*')
		{
			System.out.println("Reading OP:" + c);
			fStmt += c;
		}
		else if(c == '=')
		{

			System.out.println("Reading OP:" + c);
			System.out.println("Reading Right");
			fStmt += c;
		}
		else if(c == '(')
		{
			System.out.println("Reading OP:" + c);
			fStmt += c;
		}
		else if(c == ')')
		{
			System.out.println("Reading OP:" + c);
			fStmt += c;
		}
		else if(c ==' ')
		{
			//finalStmt += c;
		}
		else
		{
			System.out.println("Reading var:" + c);
			fStmt += c;

		}
	}
}
