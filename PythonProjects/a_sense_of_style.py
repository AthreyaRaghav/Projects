'''Problem
Every coder needs a good sense of style. Fix this pizza-ordering program to make it easier to read.

Code Outline
    The current operation of the code is as follows:
    Set starting variables, including cost (to avoid a crash later if the input is incorrect)
    Pick the starting pizza base cost based on the size
    Calculate the additional price of the toppings
    Output the total cost
Input
    Size: "s", "m", or "l"
    Number of toppings
Output
    Total pizza price
Requirements
    Rewrite the code to match the following style standards:
    Descriptive variable names in lowercase underscore_notation
    Exactly one space on each side of an operator
    No spaces between a function and its parentheses
    No unnecessary parentheses
    Blank lines between paragraphs of code to group them together based on what they do
    Add comments that label the sections of the code and explain how unusual parts work '''

#costs
size_cost = 0
topping_cost = 2

#finding the size
pizza_size=input ("Enter your pizza size (s, m, l): ")
if pizza_size ==  "s":
    size_cost = 5
elif pizza_size ==  "m":
    size_cost = 10
elif pizza_size == "l":
    size_cost=15

#finding amount of toppings
toppings=(int(input("How many toppings do you want? ")))
toppings_full_cost = toppings * topping_cost
size_cost+=toppings_full_cost

#giving final cost back
print("Your total pizza cost is $"+str(size_cost))