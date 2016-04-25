public class Parcel {

  private static int mLength;
  private static int mWidth;
  private static int mHeight;
  private int mWeight;
  private int mDistance;

  public Parcel(int length, int width, int height, int weight, int distance) {
    mLength = length;
    mWidth = width;
    mHeight = height;
    mWeight = weight;
    mDistance = distance;
  }

  public int getLength() {
    return mLength;
  }

  public int getWidth() {
    return mWidth;
  }

  public int getHeight() {
    return mHeight;
  }

  public int getWeight() {
    return mWeight;
  }

  public int getDistance() {
    return mDistance;
  }

  public static int calculateVolume() {
    return mLength * mWidth * mHeight;
  }

  public int costToShip() {
    return (Parcel.calculateVolume()) + (mWeight * 2) + mDistance;
  }
}
