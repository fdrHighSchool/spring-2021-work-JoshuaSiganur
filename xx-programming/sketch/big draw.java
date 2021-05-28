void setup() {
size(500, 500);
}

void draw() {
strokeWeight(5);
fill(245, 243, 15, 96);
circle(250, 250, 200);

fill(0, 0, 0, 0);
ellipse(220, 220, 35, 50);
ellipse(280, 220, 35, 50);

fill(255, 255, 255, 100);
ellipse(220, 232, 25, 25);
ellipse(280, 232, 25, 25);

noFill();
arc(250, 250, 250, 130, QUARTER_PI, PI - QUARTER_PI);
}
