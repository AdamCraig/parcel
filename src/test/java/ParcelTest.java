import org.junit.*;
import static org.junit.Assert.*;

public class ParcelTest {

  @Test
  public void newParcel_instantiatesCorrectly() {
    Parcel testParcel = new Parcel(1, 1, 1, 1, 1);
    assertEquals(true, testParcel instanceof Parcel);
  }

  @Test
  public void calculateVolume_calculatesCorrectVolume() {
    Parcel testParcel = new Parcel(2, 2, 2, 2, 1);
    assertEquals(8, testParcel.calculateVolume());
  }

  @Test
  public void costToShip_calculatesCorrectShippingCost() {
    Parcel testParcel = new Parcel(3, 3, 3, 10, 5);
    assertEquals(52, testParcel.costToShip());
  }
}
