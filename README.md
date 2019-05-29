
# react-native-react-native-survey-monkey

## Getting started

`$ npm install react-native-react-native-survey-monkey --save`

### Mostly automatic installation

`$ react-native link react-native-react-native-survey-monkey`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.rn.surveymonkey.RNReactNativeSurveyMonkeyPackage;` to the imports at the top of the file
  - Add `new RNReactNativeSurveyMonkeyPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-react-native-survey-monkey'
  	project(':react-native-react-native-survey-monkey').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-react-native-survey-monkey/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-react-native-survey-monkey')
  	```


## Usage
```javascript
import RNReactNativeSurveyMonkey from 'react-native-react-native-survey-monkey';

// TODO: What to do with the module?
RNReactNativeSurveyMonkey;
```
  