import com.example.coverageimpossibile.Computer;
import com.example.coverageimpossibile.ImpossibleCoverage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestImpossibleCoverage {

    @Test
    void testIsOSMacOS(){
        ImpossibleCoverage impossibleCoverage = new ImpossibleCoverage();
        impossibleCoverage.isOSMacOS();
        assertEquals(impossibleCoverage.isOSMacOS(), true);
    }

}
