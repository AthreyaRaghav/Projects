"""
This code has two seperate games(Scramble solver, and Hangman)
"""

# importing libaries
import random

what_game = input("Do you want to play a word scramble game a) or hangman b) ?")
if what_game == "b" or what_game == "B":
    input_word = input("Type the word you want to use for hangman(without the hangman)")
    # I asked for the word, and this moves the console down so that the other person can't see the word
    for i in range(0, 35):
        print()
    # I made the word into a list and then created the empty lines that show the missing letters
    hangman_word = list(input_word.lower())

    length = int(len(hangman_word))
    empty_word = []
    for c in range(length):
        empty_word.append("_")
    print(empty_word)
    # here I made the wrong letter bank the and then made a variable letter guess for the guesses
    wrong_guesses = []
    not_guess = True
    letter_guess = ""
    x = 0
    hangman = 6
    used_doubles = []
    do_not_run = False
    # this while loop runs the code until you run out of guesses or solve the word
    while (not_guess):

        letter_guess = input("Guess a letter of the word")
        # checks if the letter is in the word
        if letter_guess.lower() in hangman_word:
            used_doubles.append(letter_guess.lower())
            index = hangman_word.index(letter_guess.lower())
            # This checks if you already guessed the world and also if there are multiple words in the word
            if letter_guess.lower() in used_doubles:
                do_not_run = True
                hangman -= 1
                wrong_guesses.append(letter_guess.lower())
                print(wrong_guesses)
                print()
                print("You have " + str(hangman) + " guesses remaining")

            if hangman_word.count(letter_guess.lower()) >= 1 and do_not_run == False:

                for l in range(length):
                    if hangman_word[l] == letter_guess.lower():
                        empty_word[l] = letter_guess.lower()

                        x += 1
                        print(empty_word)
                        print()
                        print(wrong_guesses)

            elif empty_word[index] == letter_guess.lower() and hangman_word.count(letter_guess.lower()) == 1:
                print("You already guessed this")
                hangman -= 1
                wrong_guesses.append(letter_guess.lower())
                print(wrong_guesses)
                print()
                print("You have " + str(hangman) + " guesses remaining")
            # this adds this to the empty words bank and fills the cooresponding slot with the right letter
            else:
                empty_word[index] = letter_guess.lower()
                print(empty_word)
                print()
                print(wrong_guesses)
                x += 1
                print("Nice guess")
        else:
            # this takes away your guesses if you guess wrong and will add letters to the already guessed word bank
            hangman -= 1
            wrong_guesses.append(letter_guess.lower())
            print("Oh no you got the wrong guess")
            print()
            print("You have " + str(hangman) + " guesses remaining")

        if x == length:
            not_guess = False
            print("You Got the word?")
        if hangman == 0:
            print("You ran out of guesses")
            not_guess = False

elif what_game == "a" or what_game == "A":
    # Asking for Word to Scramble
    original_word = input(
        "Enter a word you want to be scrambled, the longer you make the word the harder it will be to unscramble for someone ")
    # Moving the word to a list so I can scramble
    word_as_list = list(original_word)
    random.shuffle(word_as_list)
    # changing the Shuffled word back into a string so the user can guess
    shuffle_word = ''.join(word_as_list)
    for i in range(0, 35):
        print()
    # the while loop
    print("This is a scrambled word: " + shuffle_word)
    v = True
    tries = 15
    while (v):
        guess = input("Guess what this scrambled word is ")
        if guess == original_word:
            print("Great you got it! ")

            v = False
        else:
            print("Not quite, Try Again, you have " + str(tries) + " left")
            tries -= 1
        if tries == 0:
            print("You ran out of tries!")
            v = False
else:
    print("Please enter a or b! Do you want to play a word scramble game a) or hangman b) ?")










