package ir.navaco.unittest;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import ir.navaco.unittest.Tools.Helper_AppConfig;

@RunWith(AndroidJUnit4.class)
public class ClassWithContextTest {

    private static final String PackageNameTitle = "ir.navaco.unittest";

    @Test
    public void readPackageNameFromContext() {

        Helper_AppConfig instance = new Helper_AppConfig(ApplicationProvider.getApplicationContext());

        Assert.assertEquals(instance.returnPackageName(), PackageNameTitle);

    }

}
