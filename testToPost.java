import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;

class IsMoon implements StringChecker {
  public boolean checkString(String s) {
    return s.equalsIgnoreCase("moon");
  }
}

public class TestListExamples {
  @Test(timeout = 500)
  public void testMergeRightEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }

  @Test(timeout = 500)
  public void testMergeSameValues() {
    List<String> left = Arrays.asList("a", "a", "a");
    List<String> right = Arrays.asList("a", "a", "a");
    List<String> merged = ListExamples.merge(right, left);
    List<String> expected = Arrays.asList("a", "a", "a", "a", "a", "a");
    assertEquals(expected, merged);
  }

  @Test(timeout = 500)
  public void testMergeNoValues() {
    List<String> left = Arrays.asList();
    List<String> right = Arrays.asList();
    List<String> merged = ListExamples.merge(right, left);
    List<String> expected = Arrays.asList();
    assertEquals(expected, merged);
  }

  @Test(timeout = 500)
  public void testMergeLongValues() {
    List<String> left = Arrays.asList("hello","world","along","value");
    List<String> right = Arrays.asList("zylophone","amazing","help","alonga");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("along","alonga","amazing","hello","help","value","world","zylophone");
    assertEquals(expected, merged);
  }

  @Test(timeout = 500)
  public void testMergeMixedValues() {
    List<String> left = Arrays.asList("a","b","c");
    List<String> right = Arrays.asList("A","B","C");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("A","a","B","b","C","c");
    assertEquals(expected, merged);
  }

  @Test(timeout = 500)
  public void filter() {
    testStringChecker sc = "a";
    List<String> testList = Arrays.asList("a", "b", "c");
    List<String> merged = ListExamples.filter(testList);
    List<String> expected = Arrays.asList("a");
    assertEquals(expected, merged);
  }
}
