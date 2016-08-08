package com.example.kwasny.test21;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.Button;
import android.widget.Toast;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


/**
 * Created by kwasny on 2016-08-05.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class InstrumentalTests {


    MainActivity activity;

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);


    @Test
    public void  testclickeda() {
        onView(withId(R.id.button_a))
                .perform(click());
        try {
            Thread.sleep(5000);
        }
        catch(Exception d ){}

        onView(withId(R.id.button_b))
                .perform(closeSoftKeyboard()).perform(click());
        try {
            Thread.sleep(5000);
        }
        catch(Exception d ){}

        onView(withId(R.id.button_c))
                .perform(closeSoftKeyboard()).perform(click());
        try {
            Thread.sleep(5000);
        }
        catch(Exception d ){}

        onView(withId(R.id.button_d))
                .perform(closeSoftKeyboard()).perform(click());
        try {
            Thread.sleep(5000);
        }
        catch(Exception d ){}
    }


}
