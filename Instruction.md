# Part 1 - Inheritance

## Activity A
Implement the Secretary class so that all the redundant code is eliminated. Do this by extending the Employee class.

```java
public class Secretary extends Employee {
    
}
```

## Activity B
Implement the Lawyer class, a child class of Employee. Here is how a Lawyer differs from an Employee:
* Lawyers have an extra week of vacation. This is called `overriding` a behavior.
    * Normally, Employees get 2 weeks of vacation. 
* Lawyers have the ability to sue. (The method will simply print out, "I'll see you in court!")
* Lawyers will work 20 hours per week more than a regular employee.

## Activity C
Implement the LegalSecretary class, a child class of Secretary.
* LegalSecretary gets 25% more salary than a Secretary.

# Part 2 - Super
In this section, we will make use of the `super` keyword so that subclasses can appropriately leverage and modify their superclass' behavior.
## Activity D
Change the Employee class so that a regular employee...
* has to work only 35 hours per week, and,
* gets 3 weeks vacation
* gets $47,250 salary

How does this change the values in the output? Did the number of hours worked change for the Lawyer? After this change we want a Lawyer to get 4 weeks of vacation, not just 3 like a regular employee, right?!

Use the `super` keyword to implement the overrides correctly so that each `subclass` is automatically modified when the Employee class is modified. Now, running the program should produce the following output:

```
    Employee:
    35 hour work weeks
