# Java Instance Simple Storage

Explanations for a simple storage pattern of instances|objects using `Serializable` classes in the model.

I used it to create intermediate storage in a complex export+import program. While talking with students, I realized it would be useful in many situations. This is how I would explain it to them.

## 1. Create a model

Create a `model` package where to put all the business model classes. In library management for example, your model is all about books, copies, borrowers, and loans, etc. To find the right classes and their relationships, try with objects first, and the links between them.

Then, try some simple scenarios and business rules to check you have the right objects and links. A book exists in several copies, and a person can borrow several books at the same time, maybe 5 max; as a librarian, you may want to keep track of how many times a given book copy has been borrowed; you may also want to keep track of how many times a given book has been borrowed (all its copies); etc.

## 2. Write the code for the classes

Just “tag” them as serializable and identify a _root_ class (`Library` in our case), one whose instance, by traversing links from one instance to another, allows all objects to be retrieved (in order to store them on disk).

Note: the `serialVersionUID` is mandatory for a `Serializable` class; the IDE you are using should propose to create it automatically

## 3. Example code

The example code is in an Eclipse [workspace](workspace).
It shows how it can be done for this simple library management system:

* run `Scenario1`: it will create objects and save them in a `.ser` file
* run `Scenario2`: it will read the objects from a `.ser` file and trace them on the console.

Now,pply the same pattern to your problem to solve!

