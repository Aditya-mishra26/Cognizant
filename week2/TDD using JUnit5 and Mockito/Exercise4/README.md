# Exercise 4 - Arrange-Act-Assert Pattern

This exercise demonstrates the AAA pattern in JUnit using setup and teardown methods.

## Example test

```java
@Before
public void setUp() {
    message = new StringBuilder();
    message.append("Hello");
}

@After
public void tearDown() {
    message = null;
}

@Test
public void testWithArrangeActAssertPattern() {
    String name = "Alice";
    message.append(" ").append(name);
    String result = message.toString();

    assertEquals("Hello Alice", result);
}
```

The full code is in:
- src/test/java/com/cognizant/AaaPatternTest.java
