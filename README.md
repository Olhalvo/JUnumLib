# UnumLIB
###### Because unsigneds in Java SUCK

[![License: Unlicense](https://img.shields.io/badge/license-Unlicense-blue.svg)](http://unlicense.org/)  
[![Java Version](https://img.shields.io/badge/java-8%2B-brightgreen.svg)](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)

---

### What is this?

Amidst my struggles with emulation development in Java, I realized that this language I deeply ***"love"***  
is absolutely torturous when it comes to handling **unsigned numbers**.

So I decided to take matters into my own hands. Because, realistically: how does a language that,  
and I quote Mr. Oracle himself, *"Runs on 3 billion devices"*, not have **native support for unsigned integers**?

---

### What does it do?

UnumLIB provides a set of classes that mimic the behavior of unsigned integers in Java.

Features include:
- **Strict limits or overflow behavior**
- **Utilities** to easily convert to/from native Java types
- Fully compatible with Java’s `Number` hierarchy

In short: it fixes one of the most infuriating pain points in Java.

---

### How do I use it?

Currently, UnumLIB isn’t published to Maven Central yet. For now:

1. Clone the repo:
    ```bash 
    git clone https://github.com/Olhalvo/JUnumLib.git
   ```
2. Build the JAR locally:
    ```bash 
    ./gradlew build
    ```
3. Add the JAR to your project and start using the classes.

For usage examples and guides, check the [**Javadocs**](https://olhalvo.github.io/JUnumLib/) or the **Wiki**, which will be updated regularly during development
(or at least when I remember to update them :3)

---

### License

This project is released under the **Unlicense**.  
You can do whatever you want with it — no restrictions, no attribution required.  
See [UNLICENSE](UNLICENSE) for full details.

---

### Contact me

If you have any questions, suggestions, or issues, feel free to open an issue on the GitHub repo or contact me via  
[Email](mailto:bernardomeloesteves@hotmail.com)  
or [Discord](https://discord.com/users/515576405904457728)
