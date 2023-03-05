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
It has these attributes: name = "United Kingdom", main_city = "London"


The story:
	
	// Blue was the sky and Bob was walking down the street.
	color.capitalize " was the sky and " name.capitalize " was walking down the " place "."
	
	// Yesterday in the morning I resigned from my position at JPMorgan.
	"Yesterday in the " time_of_day " I " action.ed " from my position at " firm "."
	
	// A banana was lying on the ground.
	fruit.a " was lying on the ground."
	
	// John was slowly walking on the streets of London, looking at the beautiful old architecture.
	hero.name " was slowly walking on the streets of " country.main_city ", looking at the beautiful old architecture."