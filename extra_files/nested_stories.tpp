color can have values: "green" or "blue" or "red" or "white" or "black" or "yellow" or "orange"
shape can be "square", "circle", "triangle", "hexagon"

There is a figure
It has hape --> shape and pnt from color

There is a figureStatic
It has hape --> "ball" and pnt --> "orange"

substory small:
	"I am a small "figure.pnt" "figure.hape"."
end-substory

substory big:
	use substory small " "use substory small" "
end-substory

The story:
	use big
