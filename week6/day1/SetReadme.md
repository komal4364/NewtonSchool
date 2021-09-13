***Set***
=
The Set interface of the Java Collections framework provides the features of the mathematical set in Java. It extends the Collection interface.

Unlike the List interface, sets cannot contain duplicate elements.

**Set Implementations**

![](https://cdn.programiz.com/sites/tutorial2program/files/java-set-implementation.png)

**Set Extended Interfaces**

![](https://cdn.programiz.com/sites/tutorial2program/files/java-set.png)


Both the TreeSet as well as the HashSet implements the Set interface. However, there exist some differences between them.

Unlike HashSet, elements in TreeSet are stored in some order. It is because TreeSet implements the SortedSet interface as well.

TreeSet provides some methods for easy navigation. For example, first(), last(), headSet(), tailSet(), etc. It is because TreeSet also implements the NavigableSet interface.

HashSet is faster than the TreeSet for basic operations like add, remove, contains and size.