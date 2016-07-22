/**
 * Copyright (c) 2016 Soheil Moayedi Azarpour
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package virtualworld;

/**
 * The purpose of this class is to test MyClone class and its methods.
 */
public class MyCloneTests {

  /** Runs a series of tests on MyClone class.
   */
  public void perform() {

    // 1. create a new instance.
    MyClone clone = new MyClone();

    // 2. Verify default constructor sets properties to initial values.
    if (clone.getName().equals("John Smith") && clone.getAge() == 0) {
      succeeded("MyClone default constructor passed.");
    } else {
      failed("MyClone default constructor didn't set properties to intial values.");
    }

    // 3. Update properties.
    clone.setName("Tim");
    clone.setAge(10);

    // 4. Verify setters work.
    if (clone.getName().equals("Tim") && clone.getAge() == 10) {
      succeeded("Verified MyClone setters set valid values.");
    } else {
      failed("MyClone setters failed to set properties.");
    }

    // 5. Update properties to some invalid values.
    clone.setName("");
    clone.setAge(-10);

    // 5. Verify setters don't set invalid values.
    if (!clone.getName().equals("") && clone.getAge() != -10) {
      succeeded("Verified MyClone setters don't set invalid values.");
    } else {
      failed("MyClone setters failed to validate values before setting.");
    }
  }

  /**
   * A private method to refactor common code and make it easier to print a
   * successful message.
   */
  private void succeeded(String message) {
    System.out.printf("PASSED: %s\n", message);
  }

  /**
   * A private method to refactor common code and make it easier to print a
   * failure message.
   */
  private void failed(String message) {
    System.out.printf("FAILED: %s\n", message);
  }
}
