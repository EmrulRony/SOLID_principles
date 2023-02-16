### What's wrong?
Look into the `getSumOfAreas` method of `AreaCalculator`
Every time a new shape comes into the picture we have to change the `getSumOfAreas` method. For example, if we have a new shape `Cube` then we will have to modify the method like following,

```java
public int getSumOfAreas(List<Object> shapes) {
    int sum = 0;
    for (Object shape : shapes) {
        if (shape instanceof Square) {
            sum += Math.pow(((Square) shape).getLength(), 2);
        } else if (shape instanceof Circle) {
            sum += Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
        } else if (shape instanceof Cube) {
            // do shape area calculation
        }
    }
    return sum;
}
```

This is the complete violation of `OpenClose Principle`

### How to fix?
Create an interface `Shape` with method `getArea` and make Circle, Cube and Square implement it. Circle, Cube, Square all three should provide their own implementation of `getArea` method.
Now, `getSumOfAreas` method of `AreaCalculator` class looks like the following.

```java
public double getSumOfAreas(List<Shape> shapes) {
        int sum = 0;
        for (Shape shape : shapes) {
            sum += shape.getArea();
        }
        return sum;
    }
```

Now, we can add any num of shapes but `getSumOfAreas` method won't change.
Clean, Isn't it?