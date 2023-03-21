color can have values: "green" or "blue" or "red" or "white" or "black" or "yellow" or "orange"
fruit can be: "banana", "apple", "orange", "mango", "pear"

action can be: "resign"
name can have values: "Charlie", "Bob"
place can be: "road" or "street" or "beach"

time_of_day can be: "morning" or "afternoon" or "evening" or "night"
firm can have values: "JPMorgan", "HSBC", "Barclays"
occupation can be: "teacher" or "plumber" or "astronaut" or "banker" or "dancer"
negative_adj can have values: "bad", "horrible"

There is a hero
He has attributes: name = "John", occupation = occupation

There is a country
It has attributes: name = "United Kingdom", capital="London"

The story:
	color-capitalize " was the sky and " name-capitalize " was walking down the " place ". "
	"Yesterday in the " time_of_day " I " action-ed " from my position at " firm ". "
	fruit-a-capitalize " was lying on the ground. "
	hero.name " was slowly walking on the streets of " country.capital", looking at the beautiful old architecture."