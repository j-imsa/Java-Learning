# Chapter 001

### Table of Contents:

1. [JXX](#jxx)
2. [Create Project](#create-project)
3. [Test](#test)
4. [Other Concepts](#other-concepts)


## JXX

Positions:
- Java full stack developer (_UI testing, ..._)
- Java Web developer (_JSP, Servlet, ..._)
- Java mobile app developer (_Android, ..._)
- Java EE developer (_EJB, Spring, Hibernate, REST, ..._)
- Java API developer (_Spring Boot, ..._)


#### Java program execution flow

<p align="center">
<img src="figure_001.jpg" alt="Java execution flow"/>
</p>

#### Key files in Java program
- .java
- .class
- OS executable file

#### JRE (_Java Runtime Environment_)

- Definition:
  - JRE is typically a program that can communicate with the class file provided to it.
  A runtime environment is typically a kind of physical operating system on which the software runs traditionally.
  JRE accepts your code, merges the different dependencies via a Java class loader, and passes it to JVM
  

- Components:

  1. Class loader 
  
       - searching and loading classes in memory 
       - classes are not loaded at once in memory by the class loader; it is done on a demand basis
       
       - Types (where they load the classes dynamically?):
 
         - Bootstrap class loader
           - loads jre/lib/**rt.jar** file which is a repository of all the system or internal classes in Java
           - in the lib directory of JRE
           - primordial class loader
           - implemented by C or C++ libraries
        
         - Extension class loader
           - child of the bootstrap class loader
           - in the **jre/lib/ext** directory
           - system property **java.ext.dirs**
    
         - System class loader (application)
           - child of the extension class loader
           - developer sets up the class path
           - loads the classes from the class path
           - CLASSPATH
    
       - Principles of functionality of a Java ClassLoader 
         - Delegation Hierarchy Algorithm ([*reference](https://www.geeksforgeeks.org/classloader-in-java/))
            <p align="center">
                <img src="figure_002.png" alt="Principles of functionality of a Java ClassLoader"/>
            </p>
         - Visibility Principle
         - Uniqueness Property
       
       - Custom Class Loaders ([*reference](https://www.baeldung.com/java-classloaders))
         - Use-Cases
           - modify the existing bytecode -> **e.g. weaving agents**
           - dynamic class loading -> **e.g. in JDBC, switching between different driver**
           - implementing a class versioning mechanism -> **URL class loader (load jars via URLs)**
         - CustomClassLoader -> [Code](JdbcCustomDriverLoader.java)
       
  2. Bytecode verifier

     - JVM has a gatekeeper
     
     - verifications:
       - The operand stack present in the frame should not get overflowed, and it should not be underflow or underutilized. 
       - The variables must be initialized before the usage.
       - Private data from the class is not accessed from outside of the class. 
       - The proper references must be used for the method calls. 
       - The stack should not get overflowed.
       - The final classes are not extended, and the final methods are not overridden.
       - If the verifier finds that something is missing from the preceding list, the code execution is blocked for that file.
     
     - bytecode verifier along with compiler?
     
     - 

  3. Interpreter


#### JVM



#### JDK

#### Bytecode verifier

#### Just-in-time compiler

#### OpenJDK, Oracle OpenJDK, ...

## Create Project


## Test


## Other Concepts

 