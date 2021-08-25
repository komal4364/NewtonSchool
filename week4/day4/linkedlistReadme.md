**Linked List**
=
- Ordered collection of objects
- Duplicates are allowed
- Extends Collection interface
- Dynamically resizable based on the add/remove of objects
- Each object in the linked list is called a node.
- Each node is linked list with next node via a reference to the next node.
- Each node in the linked list are not contiguous memory locations.
- Single and Double Linked Lists

![Linked Lists](https://res.cloudinary.com/practicaldev/image/fetch/s--QTk9XbRm--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_880/https://thepracticaldev.s3.amazonaws.com/i/kvnpce96zqdxu73hp6oe.png)

![List Interface](https://cdn.programiz.com/sites/tutorial2program/files/Java-list-interface.png)

**Differences**
| LinkedList	| ArrayList|
| :---     | :---: | ---: |
| Implements List, Queue, and Deque interfaces. | Implements List interface. |
| Stores 3 values (previous address, data, and next address) in a single position. | Stores a single value in a single position. |
|Provides the doubly-linked list implementation.| Provides a resizable array implementation.|
|To access an element, we need to iterate from the beginning to the element.| Can randomly access elements using indexes.|
| Whenever an element is added, prev and next address are changed. | Whenever an element is added, all elements after that position are shifted. |
