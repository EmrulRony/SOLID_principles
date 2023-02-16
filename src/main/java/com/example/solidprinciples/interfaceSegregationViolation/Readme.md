### What's wrong?
Our `Cube` shape is a 3D shape. So we can get volume out of it. Now, if we put `double getVolume` method in `Shape` interface other 2 shapes (Circle and Square) are also responsible to provide the implementation of the method.
But Circle and Square aren't 3D shape. Therefor, they don't have volume and `getVolume` method is obsolete for them.

### How to fix?
We need to break the `Shape` interface into two. Let's create a new interface `ThreeDimensionalShape` and make `Cube` implement it.