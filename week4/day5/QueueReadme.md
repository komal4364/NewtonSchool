**Queue Interface**
==
Queue is an Abstract DataType(ADT) that support the following functionalities.
- Add Element at the end
- Peek/Remove Element at the front
- Iterate over the queue.
- Size of the queue.
- Collection of objects of similar data type.
- Support duplicates
- supports the ordering.

**Queue Implementations**
==
The following are the implementations of Queue Interface
- ArrayDeque
- LinkedList
- PriorityQueue

![Queue Interface implementations](https://cdn.programiz.com/sites/tutorial2program/files/queue-interface.png)

**Queue Interface Extentions**
==
![](https://cdn.programiz.com/sites/tutorial2program/files/queue-subinterfaces.png)

*Working with Queue DataStructure*

In queues, elements are stored and accessed in First In, First Out manner. That is, elements are added from the behind and removed from the front.

![Queue Access](https://cdn.programiz.com/sites/tutorial2program/files/queue-implementation.png)

**Queue Creation**

The implementations are avaialble in java.util.Queue dataStructure
- Queue<String> students1 = new LinkedList<>();
- Queue<String> students2 = new ArrayDeque<>();
- Queue<String> students3 = new PriorityQueue<>();

**Queue Methods**

Queue extends Collection interface, so all the methods from collection interface will be avaiable for any Queue implemention. 

|Action/Method | Description | 
| :--- | ---: |
| add | add() returns true on successfull addition of an element, if not it throws an exception. |
| offer |  Inserts the specified element into the queue. If the task is successful, offer() returns true, if not it returns false. |
| element | Returns the head of the queue. Throws an exception if the queue is empty. |
| peek | Returns the head of the queue. Returns null if the queue is empty. |
| remove |  Returns and removes the head of the queue. Throws an exception if the queue is empty. |
| poll | Returns and removes the head of the queue. Returns null if the queue is empty. |


*Priority Queue*
=
![priority Queue](https://cdn.programiz.com/sites/tutorial2program/files/java-priorityqueue-implementation.png)

Unlike normal queues, priority queue elements are retrieved in sorted order.

Suppose, we want to retrieve elements in the ascending order. In this case, the head of the priority queue will be the smallest element. Once this element is retrieved, the next smallest element will be the head of the queue.

It is important to note that the elements of a priority queue may not be sorted. However, elements are always retrieved in sorted order.