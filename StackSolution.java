import java.util.Scanner;
import java.util.Stack;

public class StackSolution {

    private void _isBalanced(Scanner sc) {

        while (sc.hasNext()) {
            String input = sc.next();
            boolean balanced = true;
            Stack stack = new Stack<>();
            for (char c : input.toCharArray()) {
                switch (c) {
                    case '}':
                        if (stack.empty() || !(stack.pop().equals('{'))) {
                            balanced = false;
                        }
                        break;
                    case ']':
                        if (stack.empty() || !(stack.pop().equals('['))) {
                            balanced = false;
                        }
                        break;
                    case ')':
                        if (stack.empty() || !(stack.pop().equals('('))) {
                            balanced = false;
                        }
                        break;
                    default:
                        stack.push(c);
                        break;
                }
                if (!balanced) {
                    break;
                }
            }
            System.out.println(balanced&&stack.empty());
        }
    }

    public void run(Scanner sc) {
        this._isBalanced(sc);
    }

}
