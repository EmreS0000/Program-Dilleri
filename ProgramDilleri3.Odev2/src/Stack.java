
public class Stack {
	int [] yigit=new int [100];
	int boyut=0;
void push(int x) {
	yigit[boyut++]=x;
}
int pop() {
	return yigit[boyut--];
}
void printStack() {
    for (int i = 0; i < boyut; i += 2) {
        System.out.println("min: " + yigit[i] + ", next: " + yigit[i + 1]);
    }
    System.out.println();
}

}
