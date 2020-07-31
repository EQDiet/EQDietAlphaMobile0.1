# EQDiet Alpha Mobile 0.1
EQDiet: Free Open-source Healthy Diet App

Welcome to EQDiet Alpha Mobile version 0.1. Hope you enjoy using our app! You can visit our website [here](https://eqdiet.weebly.com)

To know more about this release, visit [this link](https://eqdiet.weebly.com/release-notes/released-eqdiet-alpha-mobile-01)

![Image of EQDiet](https://eqdiet.weebly.com/uploads/1/2/2/7/122786941/eqdiet_orig.png)

## Building source code:

### Requirements:

- Latest Java SE Development Kit (JDK). Click [here](https://lumi.gq/jdk) if you don't have it.

### Build status:

[![Android CI](https://github.com/EQDiet/EQDietAlphaMobile0.1/workflows/Android%20CI/badge.svg)](https://github.com/EQDiet/EQDietAlphaMobile0.1/actions?query=workflow%3A%22Android+CI%22) [![Java CI with Gradle](https://github.com/EQDiet/EQDietAlphaMobile0.1/workflows/Java%20CI%20with%20Gradle/badge.svg)](https://github.com/EQDiet/EQDietAlphaMobile0.1/actions?query=workflow%3A%22Java+CI+with+Gradle%22) [![Android CI assembleDebug](https://github.com/EQDiet/EQDietAlphaMobile0.1/workflows/Android%20CI%20assembleDebug/badge.svg)](https://github.com/EQDiet/EQDietAlphaMobile0.1/actions?query=workflow%3A%22Android+CI+assembleDebug%22) [![Build status](https://ci.appveyor.com/api/projects/status/3x3cn0j01mbbp4ls?svg=true)](https://ci.appveyor.com/project/EQDiet/EQDietAlphaMobile-01) [![Build Status](https://dev.azure.com/EQDiet/GitHub/_apis/build/status/EQDiet.EQDietAlphaMobile0.1?branchName=master)](https://dev.azure.com/EQDiet/GitHub/_build/latest?definitionId=2&branchName=master)

### Procedure:

1. Set Java JDK bin folder to PATH. View [this video](https://www.youtube.com/watch?v=vhBNV8no4CI) if you don't know how to do it (only Windows).
2. Download source code by clicking "clone or download" button or by running this command:                          
`git clone https://github.com/EQDiet/EQDietAlpha0.25.git` (Only if you have GIT installed)
3. Extract the files to any folder.
4. Open command prompt or terminal.
5. Go to the destination folder you have extracted the files.
6. ONLY FOR LINUX USERS. Run `chmod +x gradlew` to get gradlew execution permission
7. Run `gradlew.bat build` on Windows or `./gradlew build` on Linux. This is the full compilation method and we recommend it. However, you can run `gradlew.bat app:assembleDebug` on Windows or `./gradlew app:assembleDebug` on Linux for a quick compilation method. Ignore all warnings that will appear.
8. Go to app → build → outputs → apk → debug.
9. Find `app-debug.apk` file. That's EQDiet Alpha Mobile apk! Now go to an Android mobile phone to test it.

- Remember that the compiler that is included in this project will be getting older and outdated. You can upgrade the Gradle compiler by runing this command: `gradlew wrapper --gradle-version=[version number]`. Replace [verion number] with Gradle's latest version. ATTENTION: Do not upgrade to Gradle 7.0 when this is released.

### This project is protected by the MIT License. You can read it [here](https://github.com/EQDiet/EQDietAlphaMobile0.1/blob/master/LICENSE).
#### © 2020, EQDiet.
