package algorithms;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages({"algorithms.biggestnumberssum",
        "algorithms.productofnumbers",
        "algorithms.sorting",
        "algorithms.spiralmatrix",
        "algorithms.substring"})
public class TestSuite {

}
