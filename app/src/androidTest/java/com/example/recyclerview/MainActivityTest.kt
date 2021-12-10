package com.example.recyclerview

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @Rule
    @JvmField
    public var activityRule = ActivityTestRule(MainActivity::class.java);

    @Before
    fun setUp() {
    }

    @Test
    fun recycleViewTest(){

        //Espresso.onView((withId(R.id.rvLoctionInfo))).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(2,click()))


        var recyclerView:RecyclerView = activityRule.activity.findViewById(R.id.rvLoctionInfo)
        var itemcount = recyclerView.adapter?.itemCount

        if (itemcount != null){
            Espresso.onView((withId(R.id.rvLoctionInfo)))
                .perform(RecyclerViewActions
                    .scrollToPosition<RecyclerView.ViewHolder>(itemcount.minus(1)))

        }


        /*Espresso.onView((withId(R.id.rvLoctionInfo)))
            .perform(RecyclerViewActions
                .actionOnItemAtPosition<RecyclerView.ViewHolder>(5, click()))
        val nameitem : String = "Alaqsa Mosque5"
        Espresso.onView(withText(nameitem)).check(matches(isDisplayed()))
         */
    }

    @After
    fun tearDown() {
    }
}
