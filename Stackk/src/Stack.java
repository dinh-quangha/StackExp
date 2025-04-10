public class Stack {
    // Lớp mô phỏng Stack (ngăn xếp)
    public class Stack {
        private int[] stackArray;
        private int top;
        private int maxSize;

        // Constructor: Khởi tạo ngăn xếp với kích thước cho trước
        public Stack(int size) {
            this.maxSize = size;
            this.stackArray = new int[maxSize];
            this.top = -1;
        }

        // Thêm phần tử vào đỉnh ngăn xếp
        public boolean push(int value) {
            if (!isFull()) {
                stackArray[++top] = value;
                return true;
            }
            return false;
        }
        // Xóa phần tử khỏi đỉnh ngăn xếp và trả về giá trị
        public int pop() {
            if (!isEmpty()) {
                return stackArray[top--];
            }
            return -1;
        }

        // Xem phần tử ở đỉnh mà không xóa
        public int peek() {
            if (!isEmpty()) {
                return stackArray[top];
            }
            return -1;
        }

        // Kiểm tra ngăn xếp rỗng
        public boolean isEmpty() {
            return top == -1;
        }

        // Kiểm tra ngăn xếp đầy
        public boolean isFull() {
            return top == maxSize - 1;
        }
    }

}
