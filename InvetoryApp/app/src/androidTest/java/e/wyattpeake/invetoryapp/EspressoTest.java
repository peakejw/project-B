package e.wyattpeake.invetoryapp;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
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
        onView(withId(R.id.BaddNew)).perform(click());
        onView(withId(R.id.Badd)).perform(click());}
    @Test
    public void BRemoveTest() {
        onView(withId(R.id.Blogin)).perform(click());
        onView(withId(R.id.AdminButton)).perform(click());
        onView(withId(R.id.BSignIn)).perform(click());
        onView(withId(R.id.ManageButton)).perform(click());
        onView(withId(R.id.BaddNew)).perform(click());
        onView(withId(R.id.Badd)).perform(click());
        onView(withId(R.id.removeButton)).perform(click());}
    @Test
    public void OkButtonTest() {
        onView(withId(R.id.Blogin)).perform(click());
        onView(withId(R.id.AdminButton)).perform(click());
        onView(withId(R.id.BSignIn)).perform(click());
        onView(withId(R.id.ManageButton)).perform(click());
        onView(withId(R.id.BaddNew)).perform(click());
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
        onView(withId(R.id.BaddNew)).perform(click());
        onView(withId(R.id.Badd)).perform(click());
        onView(withId(R.id.Bok)).perform(click());
        onView(withId(R.id.updateButton)).perform(click());
        onView(withId(R.id.UpdateProduct)).perform(click());}

    @Test
    public void SignUpTest() {
        onView(withId(R.id.Blogin)).perform(click());
        onView(withId(R.id.AdminButton)).perform(click());
        onView(withId(R.id.BSignUp)).perform(click());
        onView(withId(R.id.TfUsername)).perform(typeText("mother123"), click());
        onView(withId(R.id.TFPasword)).perform(typeText("qweasd123"), click());
        onView(withId(R.id.TFConfirm)).perform(typeText("qweasd123"), click());
        onView(withId(R.id.BCreate)).perform(click());
        }

    @Test
    public void SignInTest() {
        onView(withId(R.id.Blogin)).perform(click());
        onView(withId(R.id.AdminButton)).perform(click());
        onView(withId(R.id.TFUsername)).perform(typeText("mother123"), click());
        onView(withId(R.id.TFpassword)).perform(typeText("mother123"), click());
        onView(withId(R.id.BSignIn)).perform(click());
    }

    @Test
    public void UpdateTest() {
        onView(withId(R.id.Blogin)).perform(click());
        onView(withId(R.id.AdminButton)).perform(click());
        onView(withId(R.id.TFUsername)).perform(typeText("mother123"), click());
        onView(withId(R.id.TFpassword)).perform(typeText("mother123"), click());
        onView(withId(R.id.BSignIn)).perform(click());
        onView(withId(R.id.ManageButton)).perform(click());
        onView(withId(R.id.BaddNew)).perform(click());
        onView(withId(R.id.TFenterName)).perform(typeText("Peanut Butter"), click());
        onView(withId(R.id.TFenterPrice)).perform(typeText("1.29"), click());
        onView(withId(R.id.TFenterQuantity)).perform(typeText("2"));
        onView(withId(R.id.TFExpiration)).perform(typeText("09/15/2020"), click());
        onView(withId(R.id.TFLocation)).perform(typeText("Pantry"), click());
        onView(withId(R.id.Badd)).perform(click());
        onView(withId(R.id.Bok)).perform(click());
        onView(withId(R.id.updateButton)).perform(click());
        onView(withId(R.id.editText4)).perform(typeText("Peanut Butter"), click());
        onView(withId(R.id.UpdateProduct)).perform(click());
        onView(withId(R.id.UpdateProduct)).perform(click());
    }
}
