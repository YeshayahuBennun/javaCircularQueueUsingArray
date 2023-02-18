public class Main {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(3);

        cq.enQueue(10);
        cq.enQueue(20);
        cq.enQueue(30);
        int result = cq.deQUeue();
        System.out.println(result);
        int result2 = cq.deQUeue();
        System.out.println(result2);
    }
}
