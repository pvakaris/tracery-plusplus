// Story creation demo

possible_princess_names_list has values "Cinderella", "Aurora", "Belle", "Rapunzel", "Jasmine", "Merida", "Elsa", "Moana", "Anna", "Tiana"
possible_prince_names_list can be: "Prince Charming" or "Phillip" or "Beast" or "Flynn Rider" or "Aladdin" or "Naveen" or "Kristoff" or "Hercules" or "John Smith" or "Li Shang"
possible_villain_names_list can be: "Maleficent", "Jafar", "Ursula", "Scar", "Cruella de Vil", "Gaston", "Hades", "Captain Hook", "Evil Queen", "Yzma", "Shere Khan", "Doctor Facilier", "Mother Gothel", "Queen of Hearts", "Gotham's Joker", "Thanos", "Darth Vader", "Kylo Ren", "Lord Voldemort", "Sauron"

color can be: "red", "blue", "green", "yellow", "purple", "pink", "orange", "black", "white", "gray"
trait can be:"bravery", "cleverness", "kindness", "charisma", "beauty", "wit", "independence", "generosity", "resourcefulness", "compassion"

personality can have values: "brave", "clever", "handsome", "charming", "mysterious", "enchanting", "fierce", "graceful", "majestic", "daring"
villain_personality can have values: 'wicked', 'malevolent', 'sinister', 'villainous', 'diabolical', 'maleficent', 'malignant', 'nefarious', 'demonic', 'fiendish', 'cruel', 'malicious', 'satanic', 'devilish', 'corrupt', 'perverse'
villain_occupation can be: "evil queen", "dragon", "witch", "sorcerer", "giant", "ogre", "demon", "monster", "villain", "curse"
negative_adverb can have values: "unhappily", "miserably", "gloomily", "melancholically", "sorrowfully", "regrettably", "unfortunately", "woefully", "piteously", "pathetically"

location can have values: "castle", "kingdom", "forest", "desert", "island", "mountain", "ocean", "city", "village", "cave"
favourite_food_list has values: "pumpkin pie", "chocolate cake", "apple tart", "strawberry sorbet", "crème brûlée", "cheesecake", "lemon meringue pie", "carrot cake", "banana bread", "pecan pie"
friend can be: "Fairy Godmother", "Wizard Merlin", "Hobbit Samwise", "Lion Aslan", "Dragon Saphira", "Dwarf Gimli", "Elf Legolas", "Owl Hedwig", "Dog Fang", "Cat Crookshanks"

There is a prince
He has attributes: name from possible_prince_names_list

There is a princess
She has attributes: name from possible_princess_names_list, location = location and food from favourite_food_list

There is a villain
It has name from possible_villain_names_list and occupation from villain_occupation

The story:

"Hark! Once upon a time, there was a maiden who was "personality.a" princess. She did dwell in a fair "princess.location", and was known far and wide for "princess.them" "trait" and her great love of "princess.food"."
" One day, a "princess.name" prince by name of "prince.name" did journey from a far-off land to visit "princess.name". The twain did spend the whole day exploring the "princess.location" and acquainting themselves with each other."
" As the sun did set in the sky, "prince.name" did humbly beseech "princess.name" to become his bride. She, with much joy in her heart, did accept his suit, and they did begin the planning of their dream wedding."
" Sadly, their happiness was short-lived, for an "villain_personality" "villain.occupation" by name of "villain.name" did appear and threaten to ruin all. But with the aid of their wise and loyal friend "friend", "prince.name" and "princess.name" did overcome the "villain.occupation" through the power of magic."
" From that day forth, "prince.name" and "princess.name" did dwell together in great happiness, enjoying each other's company and their favorite "princess.food" together in their fair "princess.location"."
