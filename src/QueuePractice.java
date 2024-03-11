import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {

        // Queue 선언
        Queue<Integer> queue = new LinkedList<>();

        // Queue에 값 추가하기
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        System.out.println(queue); // [1, 2, 3, 4, 5]

        // Queue 크기
        System.out.println(queue.size()); // 5

        // Queue 맨 앞 값
        System.out.println(queue.peek()); // 1

        // Queue 값 추출하기
        System.out.println(queue.poll()); // 1
        System.out.println(queue.poll()); // 2
        System.out.println(queue.poll()); // 3
        System.out.println(queue.poll()); // 4
        System.out.println(queue.poll()); // 5

        // Queue 비어있는지 확인
        System.out.println(queue.isEmpty()); // true

    }
}
