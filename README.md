## Tracery ++

A user-friendly modelling infrastructure based on [Tracery](https://tracery.io) DSL, which facilitates the automatic generation of small and medium-sized social media posts by individuals with non-technical backgrounds.

Since Tracery is a Javascript-based module, defining preferred text structures using it can be challenging for those without programming experience due to its complexity.

Thus, we aspire to fix this by taking it a step further and introducing a more sophisticated and easily accessible modelling language, Tracery++, which is built using XText and Xtend.

This language enables users to define the behaviour of their social media posts using a higher level of abstraction and a more straightforward syntax. With the implementation of Tracery++, people will have greater flexibility and autonomy in content generation, regardless of their technical background.

The code written in tpp modelling language is translated into Tracery Javascript code using automated code generation tools. In addition, the modelling language also includes a [test suite](./Tests/) that can test if the language behaves correctly and produces well-formed JSON objects.

## Building blocks

**Lists:**

Provide a range of values that can be given. When the text is finally generated, places where the list was referenced, will have a random value from that list specified.

**Objects:**

Define objects that retain the values assigned to them for the duration of the code generation. It works as a memory structure allowing for static data to be used.

**Substories:**

Have the same structure as the main story. They can be used in other substories and the main story itself.

**The main story:**

It has to be specified at the end of every tpp file. Otherwise, the code generation will produce a JSON containing a warning. The main story contains words and references to variables (objects, lists, substories).

## Modifiers

Each list reference or object attribute can be attached one or more modifiers when writing the story.
The list of possible modifiers:

- -a - adds a/an in front of the word
- -capitalize - capitalizes the first letter
- -CAPITALIZE - capitalizes all the letters in the word
- -ed - gives the verb a past tense
- -s - adds s at the end of the word to make it plural

Use case:

```
food can be "donut" or "sausage roll"

The story:

"I was eating " food.a "."
```

Would generate the following: `I was eating a donut/sausage roll.`

## Pronoun identifiers

When defining an object, a user has to specify its pronouns by stating He/She/It/They in the object declaration. This allows for object to be referenced using the pronoun identifiers.

The list of possible pronoun identifiers:

- :they
- :them
- :their
- :theirs

Use case:

```
There is a hero
He has name equal to "John"

The story:

hero:theirs " name is " hero.name "."
```

Would generate the following: `His name is John.` This is because the object was defined as "He". Thus the algorithm automatically determines which pronoun forms to use.

## Example

**File extension is .tpp**

```

color can have values: "green" or "blue" or "red" or "white" or "black" or "yellow" or "orange"
fruit can be: "banana", "apple", "orange", "mango", "pear"

action can be: "resign"
name can have values: "Charlie", "Bob"
place can be: "road" or "street" or "beach"

time_of_day can be: "morning" or "afternoon" or "evening" or "night"
firm can have values: "JPMorgan", "HSBC", "Barclays"
occupation can be: "teacher" or "plumber" or "astronaut" or "banker" or "dancer"

There is a hero
He has attributes: name = "John", occupation = occupation

There is a country
It has attributes: name = "United Kingdom", capital="London"

The story:
	color-capitalize " was the sky and " name-capitalize " was walking down the " place ". "
	"Yesterday in the " time_of_day " I " action-ed " from my position at " firm ". "
	fruit-a-capitalize " was lying on the ground. "
	hero.name " was slowly walking on the streets of " country.capital", looking at the beautiful old architecture."

```

The generated JSON object would look like this:

```

{
	"color": ["green", "blue", "red", "white", "black", "yellow", "orange"],
	"fruit": ["banana", "apple", "orange", "mango", "pear"],
	"action": ["resign"],
	"name": ["Charlie", "Bob"],
	"place": ["road", "street", "beach"],
	"time_of_day": ["morning", "afternoon", "evening", "night"],
	"firm": ["JPMorgan", "HSBC", "Barclays"],
	"occupation": ["teacher", "plumber", "astronaut", "banker", "dancer"],
	"setHero-story": ["[heroName-story:John][heroOccupation-story:#occupation#][heroThey-story:he][heroThem-story:him][heroTheir-story:his][heroTheirs-story:his]"],
	"setCountry-story": ["[countryName-story:United Kingdom][countryCapital-story:London][countryThey-story:it][countryThem-story:it][countryTheir-story:its][countryTheirs-story:its]"],
	"story": ["#color.capitalize# was the sky and #name.capitalize# was walking down the #place#. Yesterday in the #time_of_day# I #action.ed# from my position at #firm#. #fruit.a.capitalize# was lying on the ground. #heroName-story# was slowly walking on the streets of #countryCapital-story#, looking at the beautiful old architecture."],
	"origin": ["#[#setHero-story#][#setCountry-story#]story#"]
}

```

**For more examples please visit [here](./extra_files/tpp/).**

## How to use

1. Import this project to Eclipse.
2. Generate XText artifacts.
3. Launch Eclipse run-time application.
4. Create a Java project.
5. In the src folder, create a file with the extension .tpp (for example, test.tpp).
6. Create a valid model following the rules.
7. Save the document.
8. Go to src-gen folder where translated_tracerypp_grammar.json will be created.
9. Copy the file to tracery directory that can be found in the root directory of this repository.
10. Make sure that [Node.js](https://nodejs.org/en) environment is installed on your machine.
11. Run the command `node call-tracery.js` in the terminal. The generated text will be printed.

## Details

For more information and a more detailed explanation of the project please see the [report](tracerypp-report.pdf).

## Authors

Vakaris Paulavičius
Theodore Barnes

**Version** 1.2

**Date** 2023-03-27
