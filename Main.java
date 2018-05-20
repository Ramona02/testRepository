public class Main {
    public static void main (String args[]){
        Stack myStack=new Stack();
        System.out.println(myStack.isEmpty());
        myStack.push(4);
        System.out.println(myStack.pop());
        myStack.push(3);
        myStack.push(2);
        myStack.push(6);
        myStack.push(63);
        myStack.push(3);
        myStack.push(8);
        myStack.push(17);
        myStack.push(60);
        myStack.push(15);
        myStack.push(13);
        System.out.println(myStack.pop());

        System.out.println(myStack.isEmpty());// true top=0  altfel , false inseamna ca top diferit de 0


    }

}
