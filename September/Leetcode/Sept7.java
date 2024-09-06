/**
 * You are given an array of integers nums and the head of a linked list. Return the head of the modified linked list after removing all nodes from the linked list that have a value that exists in nums.

 

Example 1:

Input: nums = [1,2,3], head = [1,2,3,4,5]

Output: [4,5]

Explanation:



Remove the nodes with values 1, 2, and 3.

Example 2:

Input: nums = [1], head = [1,2,1,2,1,2]

Output: [2,2,2]

Explanation:



Remove the nodes with value 1.

Example 3:

Input: nums = [5], head = [1,2,3,4]

Output: [1,2,3,4]

Explanation:



No node has value 5.
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
        }
        ListNode temp=head;
        while(h.contains(head.val)){
            head=head.next;

        }
        while(temp.next!=null){
            if(h.contains(temp.next.val)){
                if(temp.next.next!=null)
                temp.next=temp.next.next;
                else
                temp.next=null;
            }
            else{
                temp=temp.next;
            }
        }
        return head;
        
        
    }
}