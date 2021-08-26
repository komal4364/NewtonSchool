**Collections**
A group of individual objects grouped together is a collection.

**Collection Framework**
In Java, along with collections, a collection framework was introduced. This framework then takes several classes, interfaces and represents them as a single unit. Hence, it combines the collections so that they can be manipulated and worked on together. These are found in the java.util package.

**The collections framework**
<p>The framework consists of three categories of collections:</p>

1. Collection classes: These include different type of classes that can be used as they are or used to enhance and create a customized class.

2. Collection interfaces: This is the part of the framework that represents a collection i.e. it provides different type of interfaces for the collections and relevant methods that can be used by a collection.

3. Collection algorithms: This consists of several algorithms that a collection can use on the collection classes. (Collections)

Let’s look at the different objects and methods available in each category in the illustration below.

![Collections Framework](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20210315172345/Java-Collections-Framework-Hierarchy.png)

**List Collections** 
=
- Ordered Collection of objects
- Allows Duplicate objects
- Extends Collection Interface
- ArrayList, Vector and LinkedList are implementation of List Interface. 

**ArrayList** (https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)
- Unlike Arrays, ArrayList supports Dynamic Resizing, objects can be added or removed dynamically.

| Action/Method  | Syntax                                                     | Comment |
| :---           | :----:                                                     | ---:        |
| Initialization | ArrayList<String> studentNames = new ArrayList<String>();  | Allocate memory for default size of type string|
| Initialization and assignment | ArrayList<String> obj = new ArrayList<String>(Arrays.asList("Pratap", "Peter", "Harsh"));| initializes memory and creates the names as objects in the list; and the order is preseved;
| Add Object     | studentNames.add("komal"); studentNames.add("krishna"); or     | This might resize the memory internally;
| Add Object at an index | studentNames.add(0, "bob"); | Adds bob to the studentNames at index 0; now the list is ["bob", "komal", "krishna"] |
| Size of the list | studentNames.size() | Returns the size of the list; here it is 3 |
| Remove an object |  studentNames.remove("komal") | removes the object from the list; list is now ["bob", "krishna"]|
| Remove at an index| studentNames.remove(1) | removes object at index 1; list is now ["bob"] |
| indexOf | studentNames.indexOf("bob") | returns the index of the object in the list;|
| get | studentNames.get(0) | returns the object at index 0|
| contains | studentNames.contains("komal") | returns true if the komal is present in the list else false;|


