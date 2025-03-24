/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        if(headA==NULL || headB==NULL)return NULL;

         ListNode* tempa=headA;
          ListNode* tempb=headB;

          while(tempa!=tempb){
            tempa=tempa->next;
            tempb=tempb->next;

            if(tempa==tempb)return tempa;

            if(tempa==NULL) tempa=headB;
            if(tempb==NULL) tempb=headA;
          }

          return tempa;
        
    }
};