public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(3);

        // Thử thêm phần tử
        if (!stack.push(10)) System.out.println("Stack is full.");
        if (!stack.push(20)) System.out.println("Stack is full.");
        if (!stack.push(30)) System.out.println("Stack is full.");
        if (!stack.push(40)) System.out.println("Stack is full.");

        // Xem phần tử trên cùng
        int top = stack.peek();
        if (top != -1) {
            System.out.println("Top element is: " + top);
        } else {
            System.out.println("Stack is empty.");
        }

        // Thử xóa các phần tử
        for (int i = 0; i < 4; i++) {
            int popped = stack.pop();
            if (popped != -1) {
                System.out.println("Popped: " + popped);
            } else {
                System.out.println("Stack is empty.");
            }
        }
    }
}
