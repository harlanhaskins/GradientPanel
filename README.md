GradientPanel
===

`GradientPanel` is an extension of JPanel where the background is a gradient with RGB color values (0-255).

![](http://i.imgur.com/ma7g5eq.png)

Usage is simple. Instantiate a new `GradientPanel` object using one of 5 constructors.

`GradientPanel(int red1, int green1, int blue1, int red2, int green2, int blue2)`

`GradientPanel(int whiteValue1, int whiteValue2)`

`GradientPanel(Color c1, Color c2)`

`GradientPanel(int red, int green, int blue, Color c2)`

`GradientPanel(Color c1, int red, int green, int blue)`

Pass it 6 `ints`, 2 white values, 2 `Color` objects, 3 `ints` and a `Color` object, or a `Color` object and 3 `ints`.

For example, in the screenshot, the `GradientPanel` was instantiated like this:

`GradientPanel backgroundPanel = new GradientPanel(230, 175);`

which means it makes 2 `Colors` with values `(230, 230, 230)` and `(175, 175, 175)`.