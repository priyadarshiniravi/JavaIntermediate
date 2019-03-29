## Clone
Copy all the fields and create a new object
* cloneable interface field to field interface (clone not supported)
* shallow cloning: one level cloning will have reference point to same object
* deep cloning: everything from one object to another


### Marker interface
* cloneable is a marker interface i.e empty interface 
* eg: cloneable, serializable, remote.
* Indicate something to java compiler. 
i.e if it implements cloneable the class can be cloned
* Annotation is the alternative clonable is introduced in JAVA5
