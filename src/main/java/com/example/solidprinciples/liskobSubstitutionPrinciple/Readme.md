### Liskov Substitution
Subtypes should be completely substitutable for their Base or Parent types.

Let's add a new shape called `NoShape` and implement `Shape` interface,

```java
public class NoShape implements Shape {

    public NoShape() {
    }

    @Override
    public double getArea() {
        throw new IllegalArgumentException();
    }
}
```

Here we are throwing `IllegalArgumentException` from `getArea` method. Which breaks the contact of `Shape` interface. Therefor, `NoShape` is not a `Shape` and not substitutable for it's parent class.