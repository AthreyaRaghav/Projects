#### ---- SETUP ---- ####

import math
north_south = int(input("How many blocks north or south of you is your friend's house? "))
east_west = int(input("How many blocks east or west of you is your friend's house? "))
linear = 0
hypotenuse = 0

#### ---- CALCULATIONS ---- ####

linear = north_south + east_west
hypotenuse = ((north_south**2) + (east_west**2))**.5

#### ---- OUTPUT ---- ####

print("If you walked along the sidewalk to your friend's house, the distance would be " + str(linear) + " blocks.")
print("But if you could fly there, it would be only about " + str(hypotenuse) + " blocks.")
