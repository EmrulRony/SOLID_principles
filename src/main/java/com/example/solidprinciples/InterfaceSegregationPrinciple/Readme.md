### What's wrong
Look at the `AreaPrinter` class. We are doing concrete instantiation of `AreaCalculator` inside `AreaPrinter`. Now this violates the `Dependency Inversion Principle`.
Let's assume we hava a new Area Calculator named `AreaCalculatorV2`. Now, we have to modify `AreaPrinter` to make use of  `AreaCalculatorV2`. This itself violets `Open Close Principle`.

### How to fix
Create an interface `IAreaCalculator` and make `AreaCalculator` and `AreaCalculatorV2` implement it. This way we can fix it.