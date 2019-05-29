
package com.rn.surveymonkey;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import com.facebook.react.bridge.ReactMethod;
import com.surveymonkey.surveymonkeyandroidsdk.SurveyMonkey;
import com.surveymonkey.surveymonkeyandroidsdk.utils.SMError;

public class RNSurveyMonkeyModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;
  private SurveyMonkey s = new SurveyMonkey();
  public static final int SM_REQUEST_CODE = 0;

  public RNSurveyMonkeyModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNSurveyMonkeyModule";
  }

  @ReactMethod
  public void show(String SURVEY_HASH) {
    s.startSMFeedbackActivityForResult(getCurrentActivity(), SM_REQUEST_CODE, SURVEY_HASH);
  }
}