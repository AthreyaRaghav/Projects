"""
Built-In Libraries
Coding Exercise: Randomness
Abstract Art Bot
"""

#### ---- SETUP ---- ####
import random
import ts_artist
#### ---- RANDOM ART ---- ####

## -- Random color -- ##
color = random.choice(["red","blue","green","grey"])

ts_artist.set_color(color)

## -- Random shape -- ##
shape = random.choice(["circle","rectangle","triangle"])
size = random.randint(2,30)
number = random.randint(100,1000)

ts_artist.draw_shapes(shape, size, number)

#### ---- RANDOM TITLE ---- ####
title_adjective = random.choice([shape,color])

## -- Random noun -- ##
end_noun = random.choice(["School","House", "Office", "Country"])

#### ---- DRAW ---- ####
label = "A " + title_adjective + " " + end_noun
ts_artist.write_title(label)
ts_artist.show()