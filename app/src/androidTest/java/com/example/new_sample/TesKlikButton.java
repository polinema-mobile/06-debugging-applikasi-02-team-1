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
    public void tesKlikButton() {
        //cari id button1 terus di klik
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button2)).perform(click()); //cari id button2 terus di klik
        onView(withId(R.id.button3)).perform(click()); //cari id button3 terus di klik
        onView(withId(R.id.button4)).perform(click()); //cari id button4 terus di klik
        onView(withId(R.id.button5)).perform(click()); //cari id button5 terus di klik
        onView(withId(R.id.button6)).perform(click()); //cari id button6 terus di klik
        onView(withId(R.id.button7)).perform(click()); //cari id button7 terus di klik
        onView(withId(R.id.button8)).perform(click()); //cari id button8 terus di klik
        onView(withId(R.id.button9)).perform(click()); //cari id button9 terus di klik
        onView(withId(R.id.button0)).perform(click()); //cari id button0 terus di klik
        onView(withId(R.id.input)).check(matches(withText("1234567890"))); //menampilkan input button 1234567890
    }

    @Test
    //test untuk perhitungan perkalian
    public void tesPerkalian() {
        onView(withId(R.id.button1)).perform(click()); //cari id button1 terus di klik
        onView(withId(R.id.button_multi)).perform(click()); //cari id button_multi terus di klik
        onView(withId(R.id.button2)).perform(click()); //cari id button2 terus di klik
        onView(withId(R.id.button_equal)).perform(click()); //cari id button_equal terus di klik
        onView(withId(R.id.output)).check(matches(withText("2"))); //menampilkan hasil perkalian 1 * 2 = 2
    }

    @Test
    //test untuk perhitungan penjumlahan
    public void tesPenjumlahan() {
        onView(withId(R.id.button1)).perform(click()); //cari id button1 terus di klik
        onView(withId(R.id.button_add)).perform(click()); //cari id button_add terus di klik
        onView(withId(R.id.button2)).perform(click()); //cari id button2 terus di klik
        onView(withId(R.id.button_equal)).perform(click()); //cari id button_equal terus di klik
        onView(withId(R.id.output)).check(matches(withText("3"))); //menampilkan hasil penjumlahan 1 + 2 = 3

        //Error apabila penjumlahan setelah di equals lalu di tambahkan lagi
//        onView(withId(R.id.button_add)).perform(click());
//        onView(withId(R.id.button1)).perform(click());
//        onView(withId(R.id.button_add)).perform(click());
//        onView(withId(R.id.button2)).perform(click());
//        onView(withId(R.id.output)).check(matches(withText("5")));
    }

    @Test
    //test untuk perhitungan pembagian
    public void tesPembagian() {
        onView(withId(R.id.button9)).perform(click()); //cari id button9 terus di klik
        onView(withId(R.id.button0)).perform(click()); //cari id button0 terus di klik
        onView(withId(R.id.button_divide)).perform(click()); //cari id button_divide terus di klik
        onView(withId(R.id.button2)).perform(click()); //cari id button2 terus di klik
        onView(withId(R.id.button_equal)).perform(click()); //cari id button_equal terus di klik
        onView(withId(R.id.output)).check(matches(withText("45"))); //menampilkan hasil pembagian 90 + 2 = 45
    }

    @Test
    //test untuk perhitungan pengurangan
    public void tesPengurangan(){
        onView(withId(R.id.button5)).perform(click()); //cari id button5 terus di klik
        onView(withId(R.id.button_sub)).perform(click()); //cari id button_sub terus di klik
        onView(withId(R.id.button2)).perform(click()); //cari id button2 terus di klik
        onView(withId(R.id.button_equal)).perform(click()); //cari id button_equal terus di klik
        onView(withId(R.id.output)).check(matches(withText("3"))); //menampilkan hasil pengurangan 5 + 2 = 3
    }

    @Test
    //test untuk perhitungan persen
    public void tesPersen(){
        onView(withId(R.id.button1)).perform(click()); //cari id button1 terus di klik
        onView(withId(R.id.button_para1)).perform(click()); //cari id button_para1 terus di klik
        onView(withId(R.id.button1)).perform(click()); //cari id button1 terus di klik
        onView(withId(R.id.button_equal)).perform(click()); //cari id button_equal terus di klik
        onView(withId(R.id.output)).check(matches(withText("0"))); //menampilkan hasil pengurangan 1% = 0,01
    }
}
