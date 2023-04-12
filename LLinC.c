#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *next;
};
struct LL
{
    struct node *head;
    int size;
};

void addFirst(struct LL *list, int data)
{
    struct node *n1 = (struct node *)malloc(sizeof(struct node));
    n1->data = data;
    n1->next = NULL;
    list->size++;
    if (list->head == NULL)
    {
        list->head = n1;
        return;
    }
    n1->next = list->head;
    list->head = n1;
}
void addLast(struct LL *list, int data)
{
    struct node *n1;
    n1 = (struct node *)malloc(sizeof(struct node));
    n1->data = data;
    n1->next = NULL;
    list->size++;
    if (list->head == NULL)
    {
        list->head = n1;
        return;
    }
    struct node *temp = list->head;
    while (temp->next != NULL)
    {
        temp = temp->next;
    }
    temp->next = n1;
}
void deleteLast(struct LL *list)
{
    if (list->head == NULL)
    {
        printf("list is empty\n");
        return;
    }
    list->size--;

    struct node *temp = list->head;
    if (temp->next == NULL)
    {
        temp = NULL;
        return;
    }

    while (temp->next->next != NULL)
    {
        temp = temp->next;
    }
    temp->next = NULL;
}
void deleteFirst(struct LL *list)
{
    if (list->head == NULL)
    {
        printf("list is empty\n");
        return;
    }
    list->size--;
    list->head = list->head->next;
}

void print(struct LL *list)
{
    struct node *ptr = list->head;
    while (ptr != NULL)
    {
        printf("%d ", (*ptr).data);
        ptr = ptr->next;
    }
    printf("\n");
}
void reverseIterate(struct LL *list)
{
    if (list->head == NULL || list->head->next == NULL)
    {
        return;
    }

    struct node *pretemp = list->head, *temp = list->head->next;
    struct node *temp2;
    list->head->next = NULL;
    while (temp != NULL)
    {
        temp2 = temp->next;
        temp->next = pretemp;
        pretemp = temp;
        temp = temp2;
    }
    list->head = pretemp;
}
struct node *reverseRecursive(struct node *head)
{
    if (head == NULL || head->next == NULL)
    {
        return head;
    }
    struct node *newhead = reverseRecursive(head->next);
    head->next->next = head;
    head->next = NULL;
    return newhead;
}

int main()
{

    struct LL *list;
    list = (struct LL *)malloc(sizeof(struct LL));

        list->head = NULL;
    list->size = 0;

    addLast(list, 3);
    addLast(list, 5);
    addLast(list, 7);
    addLast(list, 9);
    addLast(list, 11);
    printf("Your linkedlist is: ");
    print(list);
    addFirst(list, 1);
     printf("Your new linkedlist is: ");
    print(list);
    reverseIterate(list);
     printf("Your reverse (iterate) linkedlist is: ");
    print(list);
    list->head = reverseRecursive(list->head);
     printf("Your reverse (recursive) linkedlist is: ");
    print(list);
    deleteLast(list);
     printf("Your linkedlist with deleted last element is: ");
    print(list);
    deleteFirst(list);
     printf("Your linkedlist with deleted first element is: ");
    print(list);
    printf(" your linklist size is : %d", list->size);

    return 0;
}