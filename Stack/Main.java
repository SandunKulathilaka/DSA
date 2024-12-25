public class Main{
    public static void main(String[] args) {
        Stack newStack = new Stack(5);
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.push(5);
        int results = newStack.peek();
        System.out.println(results);
        newStack.pop();
        int results1 = newStack.peek();
        System.out.println(results1);
        newStack.delete();
        
    }
}