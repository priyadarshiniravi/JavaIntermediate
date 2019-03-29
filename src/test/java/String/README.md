# STRING

String is an Immutable object in java.

### Immutability
* Once created cannot be changed
* Thread Safe
* Safe for use by other libraries

### String Immutability
* String is nothing but a list of character[] 
* character[] final so this can never be alter once constructed
* String can never be extended as class in final
* substring, uppercase, lowercase all return new string
* Integer, Boolean all the boxed types are immutable

### There are two ways of creting string
```
1. new String("Name")
2. "Name"
```

1. Creates a new object in the heap
2. Also known as String Literal.
   Checks string pool if the string already exists. gets the reference else creates a new String and uses it


```
new String("Name").intern()
```
Also does same action as String Literal.

### Whats the use of intern
* We not always know the String literal during class loading
* Typically not candidate for GC while new String is GC
* Literal are creates at class loading

###### REFER the StringTest  
