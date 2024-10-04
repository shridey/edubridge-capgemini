package july30.collections.stack.assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class StackManager {
	int stackCount;
	ArrayList stacks = new ArrayList();
	
	public boolean createStack(int type) {
		switch (type) {
			case 1: {
				stacks.add(new Stack<Integer>());
				return true;
			}
		}
		return false;
	}
	
	public String removeMembersFromLast(int stackID, int numOfMembers) {
		
		return "";
	}
	
	public String removeMembersFromFirst(int stackID, int numOfMembers) {
		
		return "";
	}
	
	public String type(Stack stack) {
		String type = "";
		if (stack.size() > 0) {
			type = stack.peek().getClass().getSimpleName();
			Iterator it = stack.iterator();
			while (it.hasNext()) {
				if (!(it.next().getClass().getSimpleName().equals(type))) {
					type = "Default";
					break;
				}
			}
		}
		return type;
	}
	
	public static void main(String[] args) {
		StackManager sm = new StackManager();
		Stack<Integer> s = new Stack<Integer>();
		
		
		System.out.println(sm.type(s));
	}
}
