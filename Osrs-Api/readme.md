# **Osrs api**
A tool made in java to easily access the osrs api's



for example:
the "false, false, false" means we don't want to lookup in the ironman highscores, hardcore ironman highscores, ultimate ironman highscores

    ```Api.Hiscores.getAttackLevel("Stan xD", false, false, false)```
Will return my attack level. which is 97.

We can also do this with the GE (grand exchange)

    ```Api.Ge.getItemName(577)```
And this will return "Earth Rune".
You can use any function desired.


**note**::
Calling a hiscores function like getAttackLevel can work on an ironman even without specifying that it is an 
ironman with saying it's true that it's an ironman. 
The only difference will just be the rank.

Made by Stan Mijten
