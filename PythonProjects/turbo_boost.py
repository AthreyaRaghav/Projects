"""
Problem
    You are creating a racing video game and want to give players the option to use turbo-boosts to temporarily increase speed. How can you keep track of the boosts that players have?

Boost Options
    Find a boost: gain 1 boost
    Buy a boost package: gain 5 boosts
    Use a boost: lose 1 boost
    Use a double-boost: lose 2 boosts
Requirements
    Complete the BOOST CONDITIONS section of the program
    Update the turbo variable if the player uses or acquires turbo boosts
Test Cases
Case 1
    User Input
        y, y, y, y
    Program Output
        Turbo Boosts Available: 4
        Turbo Boosts Available: 9
        Turbo Boosts Available: 8
        Turbo Boosts Available: 6


Case 2
    User Input
        y, n, y, n
    Program Output
        Turbo Boosts Available: 4
        Turbo Boosts Available: 4
        Turbo Boosts Available: 3
        Turbo Boosts Available: 3 """

"""
Conditionals (if)
Technique Practice: Running Total
Turbo Boosts
"""

#### ---- SETUP ---- ####

## -- Turbo variable -- ##
turbo = 3

## -- Introduction -- ##
print("Starting the race with " + str(turbo) + " turbo-boosts.")
print()


#### ---- BOOST CONDITIONS ---- ####

## -- Found boost -- ##
found_boost = input("Did player find a turbo-boost? y/n ")
if found_boost == "y":
    turbo += 1


print("Turbo Boosts Available: " + str(turbo))
print()

## -- Purchase boost package -- ##
boost_package = input("Did player purchase a 5-turbo-boost package? y/n ")

if boost_package == "y":
    turbo += 5

print("Turbo Boosts Available: " + str(turbo))
print()

## -- Single boost -- ##
single_boost = input("Did player use a turbo-boost? y/n ")

if single_boost == "y":
    turbo -= 1


print("Turbo Boosts Available: " + str(turbo))
print()

## -- Double boost -- ##
double_boost = input("Did player use a double turbo-boost? y/n ")
if double_boost == "y":
    turbo -= 2



print("Turbo Boosts Available: " + str(turbo))
print()
