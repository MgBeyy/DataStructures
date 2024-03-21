public class MyStack {
    Node[] stack;
    int top;
    int maxSize;

    public MyStack(int maxSize) {
        this.top = -1;
        this.maxSize = maxSize;
        stack = new Node[maxSize];
    }

    void push(char letter) throws StackOverflowError {
        top++;
        stack[top] = new Node(letter);
    }

    char pop() {
        char c = stack[top].letter;
        stack[top] = null;
        top--;
        return c;
    }

    char peek() {
        if (isEmpty()) {
            return '\0';
        } else {
            return stack[top].letter;
        }
    }

    Boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
        }
        return false;
    }

    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].letter);
        }
    }

    void displayReverse() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].letter);
        }
    }

    void unload() {
        top = -1;
    }
}
