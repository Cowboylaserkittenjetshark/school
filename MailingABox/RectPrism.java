public class RectPrism implements Comparable {
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
  public int CompareTo(RectPrism prism) {
    if (this.getVolume() == prism.getVolume())
      return Math.max(this.getShippingGirth(), prism.getShippingGirth());
    return Math.max(this.getVolume(), prism.getVolume());
  }
}
