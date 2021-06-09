void setup() {
  size(1000, 1000);
  background(255);
  noStroke();
}

int Value[] = {-39, -27, -25, -21, -20, -19, -18, -15, -7, -3, 1, 4, 6, 26, 29, 32, 37, 44, 45, 47};

void draw() {
  if (mousePressed) {
    int ColorR = (int)(Math.random() * 254) + 1;
    int ColorG = (int)(Math.random() * 254) + 1;
    int ColorB = (int)(Math.random() * 254) + 1;

    int RandValX = (int)(Math.random() * 19);
    int RandValY = (int)(Math.random() * 19);

    fill(ColorR, ColorG, ColorB);
    rect(mouseX, mouseY, Value[RandValX] * 10, Value[RandValY] * 10);
  }
