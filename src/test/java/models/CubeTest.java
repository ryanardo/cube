package models;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/10/18.
 */
public class CubeTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void newCube_instantiatesCorrectly() throws Exception {
        Rectangle testRectangle = new Rectangle(30, 30);
        Cube testCube = new Cube(testRectangle);
        assertEquals(true, testCube instanceof Cube);
    }
    @Test
    public void newCube_savesRectangleInformation_Rectangle() throws Exception {
        Rectangle testRectangle = new Rectangle(30, 30);
        Cube testCube = new Cube(testRectangle);
        assertEquals(testRectangle, testCube.getFace());
    }
    @Test
    public void volume_determinesTheVolumeOfTheCube_27000() throws Exception {
        Rectangle testRectangle = new Rectangle(30, 30);
        Cube testCube = new Cube(testRectangle);
        assertEquals(27000, testCube.volume());
    }
    @Test
    public void surfaceArea_determinesTheSurfaceAreaOfACube_5400() throws Exception{
        Rectangle testRectangle = new Rectangle(30, 30);
        Cube testCube = new Cube(testRectangle);
        assertEquals(5400, testCube.getSurfaceArea());
    }
    @Test
    public void area_returnsTheAreaOfTheRectangle_450() throws Exception{
        Rectangle testRectangle = new Rectangle(15, 30);
        assertEquals(450, testRectangle.area());
    }
}