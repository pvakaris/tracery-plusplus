color can have values: "green" or "blue" or "red" or "white" or "black" or "yellow" or "orange"
shape can be "square", "circle", "triangle", "hexagon"

There is a figure
It has shape --> shape and color from color, b = "b"

substory small:
	"I am a small "figure.color" "figure.shape"."
end-substory

substory big:
	use substory small" "use substory small
end-substory

The story:
	use big