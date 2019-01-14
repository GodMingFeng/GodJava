public class Node {
    public Node next = null;
    public int val;

    public Node(int val) {
        this.val = val;
    }

    public static Node parseNode(int[] nums) {
        Node head;
        Node first = nums.length > 0 ? new Node(nums[0]) : null;
        head = first;
        for (int i = 1; i < nums.length; i++) {
            Node now = new Node(nums[i]);
            head.next = now;
            head = head.next;
        }
        return first;
    }

    public static Node reversed(Node head) {
        Node pre = null;
        while (head != null) {
            Node next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public void print() {
        Node now = this;
        while (now != null) {
            System.out.print(now.val + " ");
            now = now.next;
        }
        System.out.println();
    }

    public Node delete(int n, Node head) {
        Node pre = null;
        Node next = null;
        Node now = head;
        if (n == 0) {
            return head.next;
        }
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                pre = now;
                next = now.next.next;
            }
            now = now.next;
        }
        pre.next = next;
        return head;
    }
}
