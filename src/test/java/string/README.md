# STRING

string is an immutable object in java.

### string Immutability
* string is nothing but a list of character[] 
* character[] final so this can never be alter once constructed
* string can never be extended as class in final
* substring, uppercase, lowercase all return new string
* Integer, Boolean all the boxed types are immutable

### There are two ways of creting string
```
1. new string("Name")
2. "Name"
```

1. Creates a new object in the heap
2. Also known as string Literal.
   Checks string pool if the string already exists. gets the reference else creates a new string and uses it


```
new string("Name").intern()
```
Also does same action as string Literal.

### Whats the use of intern
* We not always know the string literal during class loading
* Typically not candidate for GC while new string is GC
* Literal are creates at class loading

###### REFER the StringTest  
