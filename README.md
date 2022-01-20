# A11yLabeledByTest

Test how an Android app will handle AccessibilityNodeInfo.setLabeledBy() being used to apply a group label to radio buttons.

Answer is that it works fine. 

Without the AccessibilityDelegate, TalkBack reads one of the radio buttons like this: "not checked, Starch, Radio button, 2 of 4". 

With the AccessibilityDelegate overriding the labeledBy attribute, TalkBack reads the same radio button like this: "not checked, Starch, Radio button for Food type, 2 of 4" -- which is the desired effect.

This was tested on a Pixel 3 running Android 11. YMMV.

