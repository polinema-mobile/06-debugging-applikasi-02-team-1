package com.example.new_sample;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TesKlikButton {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void tesKlikButtonSatu() {
        //cari id button1 terus di klik
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.button6)).perform(click());
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.button8)).perform(click());
        onView(withId(R.id.button9)).perform(click());
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("1234567890")));
    }

    @Test
    public void tesPerkalian() {
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button_multi)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("2")));
    }

    @Test
    public void tesPenjumlahan() {
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("3")));

        //Error apabile penjumlahan setelah di equals lalu di tambahkan lagi
//        onView(withId(R.id.button_add)).perform(click());
//        onView(withId(R.id.button1)).perform(click());
//        onView(withId(R.id.button_add)).perform(click());
//        onView(withId(R.id.button2)).perform(click());
//        onView(withId(R.id.output)).check(matches(withText("5")));
    }
    @Test
    public void tesPembagian() {
        onView(withId(R.id.button9)).perform(click());
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.button_divide)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("45")));
    }
    @Test
    public void tesPengurangan(){
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.button_sub)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("3")));
    }

    @Test
    public void tesPersen(){
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button_para1)).perform(click());
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("0")));
    }
}
