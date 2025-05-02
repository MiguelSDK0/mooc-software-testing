package tudelft.discount;

import org.junit.Test;
import org.junit.Before;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class DiscountApplierTest {

    private ProductDao dao;
    private DiscountApplier applier;

    @Before
    public void setup() {
        dao = mock(ProductDao.class);
        applier = new DiscountApplier(dao);
    }

    @Test
    public void test1() {
        Product homeProduct = new Product("Sofa", 100.0, "HOME");
        when(dao.all()).thenReturn(Arrays.asList(homeProduct));

        applier.setNewPrices();

        assertEquals(90.0, homeProduct.getPrice(), 0.001);
    }

    @Test
    public void test2() {
        Product businessProduct = new Product("Printer", 200.0, "BUSINESS");
        when(dao.all()).thenReturn(Arrays.asList(businessProduct));

        applier.setNewPrices();

        assertEquals(220.0, businessProduct.getPrice(), 0.001);
    }

    @Test
    public void test3() {
        Product homeProduct = new Product("Table", 150.0, "HOME");
        Product businessProduct = new Product("Laptop", 1000.0, "BUSINESS");
        when(dao.all()).thenReturn(Arrays.asList(homeProduct, businessProduct));

        applier.setNewPrices();

        assertEquals(135.0, homeProduct.getPrice(), 0.001);      // 150 * 0.9
        assertEquals(1100.0, businessProduct.getPrice(), 0.001); // 1000 * 1.1
    }
}
