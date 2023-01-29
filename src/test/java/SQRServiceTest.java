import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.homeworks_CYCLES1.services.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    //@CsvSource ({
    //     "3,200,300",
    //     "8,500,900"
    // })
    @CsvFileSource(files = "src/test/resources/range.csv")
    public void CheckRange(int expended, int startRange, int endRange) {

        SQRService service = new SQRService();
        int actual = service.CalcSQRService(startRange, endRange);
        Assertions.assertEquals(expended, actual);
    }
}
