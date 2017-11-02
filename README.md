# PART1_Hashmaps
The Hashmap is a common OOP tool that links Objects to other Objects. You're going to build one.

NOTE: You have to compile the code in this repository on the command line differently, since it utilizes
a package structure. To compile all the code at once, you MUST run the command, exactly as written:
```
javac -cp classes/ -d classes/ src/com/greyhounds/*.java
```
which compiles all the .java files at once. The "-cp" flag is to specify where the package directory of already
compiled classes starts (when you first run this command, this directory will be empty, but afterwards will contain
class files that have already been compiled), and the "-d" flag is to specify where the .class files are supposed
to go once compiled. To run the compiled code, you MUST use the command, exactly as written:
```
java -cp classes/ com.greyhounds.Test
```
where in this case, the "-cp" flag is specifying the location of the start of the package directory, which mirrors
the directory as it is coded, and tells the java command where our compiled code is located.
