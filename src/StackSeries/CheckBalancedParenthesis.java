import java.util.Stack;

public class CheckBalancedParenthesis {


	public static boolean checkBalancedParenthesis(String str){

		Stack<Character> stk = new Stack<>();
		for(int i = 0; i< str.length(); i++){
			if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[' ){
				stk.push(str.charAt(i));
			}else{
				if(!stk.isEmpty() && (
						(stk.peek() == '{' && str.charAt(i) == '}' ) ||
								(stk.peek() == '(' && str.charAt(i) == ')' )||
								(stk.peek() == '[' && str.charAt(i) == ']'))){
					stk.pop();
				}else {
					return false;
				}
			}
		}


		return stk.isEmpty();
	}

	public static void main(String[] args) {
		String s = "{()}[]";
		if (checkBalancedParenthesis(s))
			System.out.println("true");
		else
			System.out.println("false");


	}

}
