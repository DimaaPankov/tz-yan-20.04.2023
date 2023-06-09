package com.gamezzz.presenter

import com.gamezzz.R


object ModelBonus {
    val bonus =  mutableListOf(R.drawable.flower)
    fun getRamdomBonus() = bonus.random()
}

class ModelQestion(val fact:String, val answer:Boolean)

val listFact = listOf(
    ModelQestion("Seahorses have stomachs for the absorption of nutrients from food.",false),
    ModelQestion("The letter H is between letters G and J on a keyboard",true),
    ModelQestion("Camels have three sets of eyelashes",true),
    ModelQestion("There are five zeros in one hundred thousand",true),
    ModelQestion("There are stars and zigzags on the flag of America",true),
    ModelQestion("There are stars and zigzags on the flag of America",false),
    ModelQestion("A group of crows is called a ‘murder’",true),
    ModelQestion("New York is nicknamed 'The Big Orange'",false),
    ModelQestion("Humans have 4 senses",false),
    ModelQestion("Scallops don't have good vision",false),
    ModelQestion("There is no railway system in Iceland.",true),
    ModelQestion("A slug has four noses in total",true),
    ModelQestion("Your hand has a built in snuff box",true),
    ModelQestion("The moon is just 50 percent of the mass of Earth.",false),
    ModelQestion("Toilet paper is a relatively recent invention, but the ancients still had to wipe.",true),
    ModelQestion("Nearly three percent of the ice in Antarctic glaciers is penguin urine.",true),
    ModelQestion("Apes cant laugh",false),
    ModelQestion("A snail can sleep for three months.",false),
    ModelQestion("Your nose and sinuses produce almost one liter of mucus a day (which you swallow.)",true),
    ModelQestion("Tasting is never determined by what you’re smelling",false),
    ModelQestion("Zeus is known as the king of Gods",false),
    ModelQestion("It takes a sloth two weeks to digest its food.",true),
    ModelQestion("In japan, instead of a \"man in the moon,\" people see a \"rabbit in the moon.\"",true),
    ModelQestion("The quills on African porcupines are as long as three pencils.",true),
    ModelQestion("A cow gives nearly 200,000 glasses of milk in a lifetime.",true),
    ModelQestion("You can sneeze during sleep",false),
    ModelQestion("The bent joint in the legs of the flamingo is its ankles.",true),
    ModelQestion("There is a world championship for throwing mobile phones.",true),
    ModelQestion("China the largest country in the world",true),
    ModelQestion(" Watching horror movies has no reaction to body",false),
    ModelQestion("Eleanor Roosevelt once snuck out of a white house event to go on a joyride in a plane.",true),
    ModelQestion("The pupil of a goat is diagonal.",false),
    ModelQestion("A double rainbow is a mirror image of the first rainbow.",true),
    ModelQestion("Human facial hair grows faster than any other hair on the body.",true),
    ModelQestion("Human eyes contain a small blind spot where the optic nerve passes through the retina.",true),
    ModelQestion("Camels have three sets of eyelids",true),
    ModelQestion("Green tea contains antiseptic properties, which can help to keep your gums healthy.",true),
    ModelQestion("China the largest country in the world",false),
    ModelQestion("Australia the largest producer of wool in the world",true),
    ModelQestion("Bats always turn right when leaving a cave.",false),
    ModelQestion("A group of jellyfish is not a herd, or a school, or a flock; it's called a smack.",true),
    ModelQestion("You get a new top layer of skin (epidermis) every 7 days.",false),
    ModelQestion("It is possible to hypnotize a frog by placing it on its back and gently stroking its stomach.",true),
    ModelQestion("A rhinoceros' horn is made of hair.",true),
    ModelQestion("Slugs have six noses",false),
    ModelQestion(" The heart of a shrimp is located in its head.",true),
    ModelQestion("Bananas grow upside down",true),
    ModelQestion("Frogs cannot vomit. If one absolutely has to, then it will vomit its entire stomach.",true),
    ModelQestion("Dead skin comprises about a billion tons of dust in the earth’s atmosphere.",true),
    ModelQestion("New Jersey has the highest concentration of shopping malls.",true),
    ModelQestion("Broome could make Harry Potter invisible for a day",false),
    ModelQestion("Bolivia is the world’s flattest country",true),
    ModelQestion("The world’s oldest country San Marino is in Asia",false),
    ModelQestion("Brazil and France share a 673-kilometre border",true),
    ModelQestion("It snows in the Sahara Desert",true),
    ModelQestion("Sudan has the most pyramids in the world",true),
    ModelQestion("Colombia’s brightest rainbow is in its river",true),
    ModelQestion("Macchu Pichu is an earthquake-proof city",true),
    ModelQestion("You could walk from Russia to Alaska",true),
    ModelQestion("China has two timezones",false),
    ModelQestion("San Fransisco’s Golden Gate Bridge ‘speaks’",true),
    ModelQestion(" Between China and Alaska lies the Bering Strait.",false),
    ModelQestion("Yala National Park is located in Kenya and famous for safari",false),
    ModelQestion("Taiwan has a festival to appreciate their monkeys",false),
    )