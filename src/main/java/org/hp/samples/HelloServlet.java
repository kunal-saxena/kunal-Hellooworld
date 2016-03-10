/* ============================================================================
(c) Copyright 2014 Hewlett-Packard Development Company, L.P.
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights to
use, copy, modify, merge,publish, distribute, sublicense, and/or sell copies of
the Software, and to permit persons to whom the Software is furnished to do so,
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
============================================================================ */

package org.hp.samples;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class CapitalizeApplet extends Applet {

  private TextField input;
  private TextField output;
  
  public void init () {
   
     // Construct the TextFields
     this.input = new TextField(40);
     this.output = new TextField(40);
     this.output.setEditable(false);
     Button b = new Button("Capitalize");

     // add the button to the layout
     this.add(input);
     this.add(b);
     this.add(output);

     // specify that action events sent by the
     // button or the input TextField should be handled 
     // by the same CapitalizerAction object
     CapitalizerAction ca = new CapitalizerAction(input, output);
     b.addActionListener(ca);
     this.input.addActionListener(ca);

     // notice that ActionEvents produced by output are ignored.
   
   }

}


class CapitalizerAction implements ActionListener {

  private TextField in;
  private TextField out;

  public CapitalizerAction(TextField in, TextField out) {
    this.in = in;
    this.out = out;
  }

  public void actionPerformed(ActionEvent ae) {

    String s = in.getText();
    out.setText(s.toUpperCase());

  }

}
