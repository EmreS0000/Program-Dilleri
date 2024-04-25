 public class Stack {
    int[] yigit = new int[10000];
    int Boyut = 0;

    void push(int x) {
        yigit[Boyut++] = x;
    }

    int pop() {
        return yigit[--Boyut];
    }

    void printStack() {
        for (int i = 0; i < Boyut; i += 3) {
            System.out.println("low: " + yigit[i] + ", high: " + yigit[i + 1] + ", mid: " + yigit[i + 2]);
        }
        System.out.println();
    }
}