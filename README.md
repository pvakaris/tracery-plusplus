## Tracery ++

A user-friendly modelling infrastructure based on [Tracery](https://tracery.io) DSL, which facilitates the automatic generation of small and medium-sized social media posts by individuals with non-technical backgrounds.

Since Tracery is a Javascript-based module, defining preferred text structures using it can be challenging for those without programming experience due to its complexity.

Thus, we aspire to take this a step further by introducing a more sophisticated and easily accessible modelling language, Tracery++, which is built using XText.

This language enables users to define the behaviour of their social media posts using a higher level of abstraction and a more straightforward syntax. With the implementation of Tracery++, people will have greater flexibility and autonomy in content generation, regardless of their technical background.

The code written in tpp modelling language will be translated into Tracery Javascript code using automated code generation tools. In addition, the modelling language also includes a test suite that can check if the .tpp files are well formed and do  not contain any inaccuracies.

## Example

**File extension is .tpp**

```
color can have values: "green" or "blue" or "red"
name can have values: "charlie", "bob"

place can be: "road" or "street"
action can be: "resign"

time_of_day can be: "morning" or "afternoon" or "evening"
firm can have values: "JPMorgan", "HSBC", "Barclays"
fruit can be: "banana", "apple"
occupation can be: "teacher" or "plumber" or "astronaut"

hero is an object.
It has these attributes: name = "John", occupation

country is an object.
It has these attributes: name="United Kingdom", capital="London"


The story looks like this:

	color.capitalize " was the sky and " name.capitalize " was walking down the " place "."
	"Yesterday in the " time_of_day " I " action.ed " from my position at " firm "."
	fruit.a " was lying on the ground."
	hero.name " was slowly walking on the streets of " country.capital ", looking at the beautiful old architecture."
	
```

The text created by the modelling language would looks something like this:

```
Blue was the sky and Bob was walking down the street.
Yesterday in the morning I resigned from my position at JPMorgan.
A banana was lying on the ground.
John was slowly walking on the streets of London, looking at the beautiful old architecture.
```
## Modifiers

Each variable can be attached one or more modifiers:

- .a - adds a/an in front of the word
- .capitalize - capitalizes the first letter
- .CAPITALIZE - capitalizes all the letters in the word
- .ed - gives the verb a past tense
- .s - adds s at the end of the word to make it plural

## Authors

Vakaris Paulavičius
Theodore Barnes

**Version** 1.1

**Date** 2023-03-05