class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead =new ListNode(-1);
        dummyHead.next=head;
        ListNode prev=dummyHead;
        while(prev.next !=null){
            if (prev.next.val==val)
                prev.next=prev.next.next;
            else
                prev=prev.next;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        int[] arr={1,2,5,2,7,2,6,8,2,5,7,2,9,0};
        ListNode s=new ListNode(arr);
        System.out.println(s);
        ListNode res=(new Solution()).removeElements(s,2);
        System.out.println(res);
    }
}