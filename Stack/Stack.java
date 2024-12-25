public class Stack{

    int [] arr;
    int topOfStack;

    public Stack(int size){
        topOfStack = -1;
        this.arr = new int [size];
        System.out.println("Created an Stack size of : "+size);
    }

    public boolean isEmpty(){
        if(topOfStack == -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if (topOfStack == arr.length-1) {
            return true;
        }else{
            return false;
        }
    }

    public void push(int value){
        if (isFull()) {
            System.out.println("Stack is Full");
        }else{
            arr[topOfStack+1] = value;
            topOfStack++;
        }
    }
    public int pop(){
        if (isEmpty()) {
            return -1;
        }else{
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }
    public int peek(){
        if (isEmpty()) {
            return -1;
        }else{
            return arr[topOfStack];
        }
    }
    public void delete(){
        arr = null;
        System.out.println("Stack deleted Sucessfull");
    }


}