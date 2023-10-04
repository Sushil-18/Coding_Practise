class Stack {

   private int arrlength;
   private int[] arr;
   private int top;

    Stack(int len) {
        arr = new int[len];
        this.arrlength = len;
        this.top = -1;
    }
    
    public void push(int element) {
        if (top >= arrlength -1) {
            System.out.println("Stack is full");
        }
        else {
            arr[++top] = element;         
        }

    }
    
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        }
        return arr[top--];
    }
    
    public void display() {
        if (top == -1) {
            System.out.println("Stack does not contain any elements");
        }
        else {
            for (int i = 0; i <= top; i++) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String args[]) {
        
        Stack obj = new Stack(10);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.display();
        System.out.println(obj.pop()+ " removed from stack");
        obj.display();
        System.out.println(obj.pop()+ " removed from stack");
        obj.display();         
    }
}