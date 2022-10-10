public class RectPrism implements Comparable<RectPrism> {
  private int height;
  private int width;
  private int depth;
  private int volume;
  private int shippingGirth;

  public RectPrism(int height, int width, int depth) {
    this.height = height;
    this.width = width;
    this.depth = depth;
    this.volume = (height * width * depth);
    int smallestDimension1 = (height > width ? width : height);
    int smallestDimension2 = (smallestDimension1 > depth ? depth : (height < width ? width : height));
    this.shippingGirth = (smallestDimension1 * 2) + (smallestDimension2 * 2);
  }

  public int getVolume() {
    return volume;
  }

  public int getShippingGirth() {
    return shippingGirth;
  }

  @Override
  public int compareTo(RectPrism prism) {
    if (this.getVolume() == prism.getVolume())
      return this.getShippingGirth() - prism.getShippingGirth();
    return this.getVolume() - prism.getVolume();
  }

  @Override
  public String toString() {
    return "{ Volume: " + this.volume + ", Girth: " + this.shippingGirth + ", Height: " + this.height + ", Width: "
        + this.width + ", Depth: " + this.depth + "}";
  }
}
