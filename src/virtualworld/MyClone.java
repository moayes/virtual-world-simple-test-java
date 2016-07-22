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

public class MyClone {
  
  private String name;
  private int age;
  
  /** Default constuctor that sets private instance variables
   * to some initial values.
   */
  public MyClone() {
    name = "John Smith";
    age = 0;
  }
  
  /** Setter for name property. It does some validation to make sure
   * only names that are with English alphabets are set.
   */
  public void setName(String name) {
    /** Validate new name value before setting it.
     */
    if (name != null && name.matches("[a-zA-Z]+")) {
      this.name = name;
    }
  }
  
  public String getName() {
    return name;
  }
  
  /** Setter for age property. It does some validation to make sure
   * a negative value is not set as age.
   */
  public void setAge(int age) {
    if (age >= 0) {
      this.age = age;
    }
  }
  
  public int getAge() {
    return age;
  }
}
