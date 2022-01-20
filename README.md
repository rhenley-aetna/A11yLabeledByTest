# A11yLabeledByTest

Test how an Android app will handle AccessibilityNodeInfo.setLabeledBy() being used to apply a group label to radio buttons.

Answer is that it works fine. 

Without the AccessibilityDelegate, TalkBack reads one of the radio buttons like this: "not checked, Starch, Radio button, 2 of 4". 

With the AccessibilityDelegate overriding the labeledBy attribute, TalkBack reads the same radio button like this: "not checked, Starch, Radio button for Food type, 2 of 4" -- which is the desired effect.

This was tested on a Pixel 3 running Android 11. YMMV.

![Screenshot_20220120-124123 RadioGroup without labeledBy](https://user-images.githubusercontent.com/85311885/150399669-6a38ac42-a8f5-4e4e-8f95-e3345014c6a7.png)
![Screenshot_20220120-123554 RadioGroup with labeledBy](https://user-images.githubusercontent.com/85311885/150399687-db75fb2a-75f6-477b-a270-47c6fa73e737.png)
