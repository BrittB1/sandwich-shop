Welcome to OK Sandwiches, a simple POS system that allows a user to create and customize a sandwich shop order.
Possible actions include:

- Choosing bread type, toppings, and a toating option for a sandwich
- Selecting a chip flavor
- Selecting a drink flavor and size
- Cancelling the ordering process

Fig. 1 Home Screen: Where the user begins. Contains option to begin a new order OR to exit, which ends the program
![img_1.png](img_1.png)

Fig.2 Order Screen: This is where the ✨MAGIC✨ happens! This screen displays a menu to the console that allows the user to choose several different options for creating a new order.
'Checkout' function checks to see if the orderTotal is == 0; and if true prints a message to the screen encouraging user to order at least one item.

![img_2.png](img_2.png)

Fig.3 Interesting piece of code: One of the first functions I thought about; what if the user tries to immediately checkout without ordering anything? This condition statement checks if the order total equals '0'.
If the user adds a minimum of one item, say they just want some chips, the 'else' condition is met and the program returns an order summary.

![img_3.png](img_3.png)
