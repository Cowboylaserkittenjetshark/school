public class RectPrism implements Comparable<RectPrism> {
  private double height;
  private double width;
  private double depth;
  private double volume;
  private double shippingGirth;

  public RectPrism(double height, double width, double depth) {
    this.height = height;
    this.width = width;
    this.depth = depth;
    this.volume = (height * width * depth);
    double smallestDimension1 = (height > width ? width : height);
    double smallestDimension2 = (smallestDimension1 > depth ? depth : (height < width ? width : height));
    this.shippingGirth = (smallestDimension1 * 2) + (smallestDimension2 * 2);
  }

  public double getVolume() {
    return volume;
  }

  public double getShippingGirth() {
    return shippingGirth;
  }

  @Override
  public int compareTo(RectPrism prism) {
    if (this.getVolume() == prism.getVolume())
      return (int) (this.getShippingGirth() - prism.getShippingGirth());
    return (int) (this.getVolume() - prism.getVolume());
  }

  @Override
  public String toString() {
    return "{ Volume: " + this.volume + ", Girth: " + this.shippingGirth + ", Height: " + this.height + ", Width: "
        + this.width + ", Depth: " + this.depth + "}";
  }
}
