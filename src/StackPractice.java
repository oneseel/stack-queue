import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {

        // Stack 자료 구조 만들기
        Stack<Integer> stack = new Stack<>();

        // Stack 값 추가하기
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack); // [1, 2, 3, 4, 5]

        // Stack 크기
        System.out.println(stack.size()); // 5

        // Stack top 값 확인하기
        System.out.println(stack.peek()); // 5

        // 특정 값이 몇번째로 빠져나오느지 확인 (값이 여러개라면 가장 위에 있는 값)
        System.out.println(stack.search(4)); // 2
        System.out.println(stack.search(0)); // -1 (찾는 값이 없을 경우)

        // Stack 값 추출하기
        System.out.println(stack.pop()); // 5
        System.out.println(stack.pop()); // 4
        System.out.println(stack.pop()); // 3
        System.out.println(stack.pop()); // 2
        System.out.println(stack.pop()); // 1

        // Stack 비어있늕지 확인
        System.out.println(stack.isEmpty()); // true

    }
}
