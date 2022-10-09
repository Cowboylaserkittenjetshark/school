public class RectPrism implements Comparable{
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
    double smallestDimension1 = (height < width ? height : width);
    double smallestDimension2 = (smallestDimension1 < depth ? majorDimension1 : depth);
    this.shippingGirth = (majorDimension1 * 2) + (majorDimension2 * 2);
  }

  @Override
  public int CompareTo(RectPrism prism) {
    
    }
}
