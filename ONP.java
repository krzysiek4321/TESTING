import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ONP
{
	public static double rozwi¹¿(Stack s)
	{
		String elem = s.pop().toString();
		if (elem.equals("+"))
		{
			return rozwi¹¿(s) + rozwi¹¿(s);
		} else if (elem.equals("-"))
		{
			return -rozwi¹¿(s) + rozwi¹¿(s);
		} else if (elem.equals("*"))
		{
			return rozwi¹¿(s) * rozwi¹¿(s);
		} else if (elem.equals("/"))
		{
			double wyn = rozwi¹¿(s);
			return rozwi¹¿(s) / wyn;
		} else if (elem.equals("^"))
		{
			double n = rozwi¹¿(s);
			return Math.pow(rozwi¹¿(s), n);
		} else
		{
			return Integer.parseInt(elem);
		}
	}

	public static void main(String[] args)
	{
		Stack<String> stack = new Stack<>();
		stack.addAll(Arrays.asList(new Scanner(System.in).nextLine().split(" ")));
		System.out.println(rozwi¹¿(stack));
	}
}