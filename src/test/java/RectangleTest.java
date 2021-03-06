import org.junit.*;
import org.w3c.dom.css.Rect;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void newRectangle_instantiatesCorrectly() {
        Rectangle testRectangle = new Rectangle(2, 4);
        assertEquals(true, testRectangle instanceof Rectangle);
    }

    @Test
    public void newRectangle_getsLength_2() {
        Rectangle testRectangle = new Rectangle(2, 4);
        assertEquals(2, testRectangle.getLength());
    }

    @Test
    public void newRectangle_getsWidth_4() {
        Rectangle testRectangle = new Rectangle(2, 4);
        assertEquals(4, testRectangle.getWidth());
    }

    @Test
    public void newRectangle_isNotaSquare_false() {
        Rectangle testRectangle = new Rectangle(2, 4);
        assertEquals(false, testRectangle.isSquare());
    }

    @Test
    public void newRectangle_allSidesEqual_true() {
        Rectangle testRectangle = new Rectangle(2, 2);
        assertEquals(true, testRectangle.isSquare());
    }
}
