This is a project created as an assestment for N26 QA mobile automation position
Author: Jorge Quiros
Last modified date: Sunday, March 17, 2019

Technologies used
- Java
- Selenium
- Appium
- Android SDK

Installation

- Make sure you install Appium from https://github.com/appium/appium-desktop/releases/tag/v1.11.0
  this will also install node.js in case you do not have it.
- Check you have java installed on the machine.
- Android SDK should be installed on your machine with Android SDK emulator.
- From SDK manager install ADB which allow to control the device over USB from computer,
  run shell commands, etc. Also update SDK.
- install intel x86 emulator accelerator (to allow faster emulation)
  https://software.intel.com/en-us/android/articles/intel-hardware-accelerated-execution-manager
- Make sure you have hyper-V (inside 'turn windows features on or off') enabled. Before 
  version 27.3.8 of emuator you could not have Hyper-V enable to run emulator, which was 
  a problem if you have Docker on Windows that does need Hyper-V.

Running the project
- Open AVDManager.exe and create a device or open one already existing (skin with dynamyc
  hardware control and use host gpu)

- Start appium server, after starting you can see sessions here
  http://127.0.0.1:4723/wd/hub/sessions

- Go to Appium configuration and set the desired capabilities, in this case:
{
  "platformVersion": "9",
  "platformName": "Android",
  "deviceName": "Jorge",
  "appPackage": "com.android.calculator2",
  "appActivity": "com.android.calculator2.Calculator"
}

- Run the run.bat file in the root of the project




