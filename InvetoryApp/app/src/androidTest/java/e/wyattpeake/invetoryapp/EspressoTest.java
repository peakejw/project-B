package e.wyattpeake.invetoryapp;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class EspressoTest {
    @Rule
    public ActivityTestRule<MainActivity> menuActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void BLoginTest() { onView(withId(R.id.Blogin)).perform(click()); }
    @Test
    public void UserButtonTest() {
        onView(withId(R.id.Blogin)).perform(click());
        onView(withId(R.id.UserButton)).perform(click());}
    @Test
    public void BSignUpTest() {
        onView(withId(R.id.Blogin)).perform(click());
        onView(withId(R.id.AdminButton)).perform(click());
        onView(withId(R.id.BSignUp)).perform(click());}
    @Test
    public void ViewButtonTest() {
        onView(withId(R.id.Blogin)).perform(click());
        onView(withId(R.id.AdminButton)).perform(click());
        onView(withId(R.id.BSignIn)).perform(click());
        onView(withId(R.id.ViewButton)).perform(click());}
    @Test
    public void BAddTest() {
        onView(withId(R.id.Blogin)).perform(click());
        onView(withId(R.id.AdminButton)).perform(click());
        onView(withId(R.id.BSignIn)).perform(click());
        onView(withId(R.id.ManageButton)).perform(click());
        onView(withId(R.id.Badd)).perform(click());}
    @Test
    public void BRemoveTest() {
        onView(withId(R.id.Blogin)).perform(click());
        onView(withId(R.id.AdminButton)).perform(click());
        onView(withId(R.id.BSignIn)).perform(click());
        onView(withId(R.id.ManageButton)).perform(click());
        onView(withId(R.id.Badd)).perform(click());
        onView(withId(R.id.removeButton)).perform(click());}
    @Test
    public void OkButtonTest() {
        onView(withId(R.id.Blogin)).perform(click());
        onView(withId(R.id.AdminButton)).perform(click());
        onView(withId(R.id.BSignIn)).perform(click());
        onView(withId(R.id.ManageButton)).perform(click());
        onView(withId(R.id.Badd)).perform(click());
        onView(withId(R.id.Bok)).perform(click());
        //onView(withId(R.id.updateButton)).perform(click());
        }
    @Test
    public void Button4Test() {
        onView(withId(R.id.Blogin)).perform(click());
        onView(withId(R.id.AdminButton)).perform(click());
        onView(withId(R.id.BSignIn)).perform(click());
        onView(withId(R.id.ManageButton)).perform(click());
        onView(withId(R.id.Badd)).perform(click());
        onView(withId(R.id.Bok)).perform(click());
        onView(withId(R.id.updateButton)).perform(click());
        onView(withId(R.id.button4)).perform(click());}
}
