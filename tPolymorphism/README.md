# polymorphism notes

### types of polymorphism

1. static polymorphism
    - a polymorphism that is resolved during compile time is known as static polymorphism.
    - methodOverloading is an example of compile time polymorphism

1. dynamic polymorphism
    - is a process in which a call to an overridden method is resolved at runtime, that is why it is called runtime polymorphism


<br> <br> <br>

### characteristics of polymorphism

1. coercion
    - deals with implicit type conversion done by the compiler to prevent type errors
    - example: integer and string concatenation
    - String str111 = "string" = 2; <--- implicit type conversion

1. operator overloading
    - same symbol or operator having different meanings or functions
    - example: the 'plus' symbol is used in mathematical operation as well as string concatenation

1. polymorphic parameters
    - allows a name of parameter of a method in a class to be associated with different types
    - see example xxxyyyzzz111

1. super keyword
    - is a keyword used inside a subclass method definition to call a method defined in the superclass


#### example xxxyyyzzz111
```java
public class TextFile extends GenericFile {
    private String content;
    public String setContentDelimiter() {
        int content = 100;
        this.content = this.content + content;
    }
}
```


<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>

---
---
---
---
---
---
---
---
---
---

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
