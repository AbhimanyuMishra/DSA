/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

 class Solution {
public:
    int deleteNode(ListNode* &head, int k) {
        if (!head) return 0; // Base case: End of the list

        // Recurse to the end of the list
        int index = deleteNode(head->next, k) + 1;

        // When index matches k, delete the node
        if (index == k) {
            ListNode* temp = head;
            head = head->next; // Update pointer to skip the node
            delete temp;       // Free memory
        }
        return index;
    }

    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if (!head) return nullptr; // Edge case: Empty list

        // Special case: if the head node itself needs to be deleted
        if (deleteNode(head, n) == n && head == nullptr) {
            return nullptr;
        }
        return head;
    }
};
