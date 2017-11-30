
package com.schibsted.spt.data.jstl2;

import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.NullNode;

/**
 * Test cases for function implementations.
 */
public class FunctionTest extends TestBase {

  // ===== NUMBER

  @Test
  public void testWrongType() {
    check("{}", "number([1,2,3,4])", "null");
  }

  @Test
  public void testInteger() {
    check("{}", "number(42)", "42");
  }

  @Test
  public void testDouble() {
    check("{}", "number(42.0)", "42.0");
  }

  @Test
  public void testIntegerString() {
    check("{}", "number(\"42\")", "42");
  }

  @Test
  public void testDoubleString() {
    check("{}", "number(\"42.0\")", "42.0");
  }

  @Test
  public void testNotAString() {
    error("number(\"george\")", "george");
  }

  @Test
  public void testNoArguments() {
    error("number()", "argument");
  }

}
