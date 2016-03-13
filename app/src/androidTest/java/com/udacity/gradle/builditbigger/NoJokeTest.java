package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

/**
 * Created by Flavio on 3/13/2016.
 */
public class NoJokeTest extends AndroidTestCase {
    private static final String LOG_TAG = "NoJokeTest";

    @SuppressWarnings("unchecked")
    public void testNoEmptyString() {

        Log.v("NoJokeTest", "Running NoJokeTest test");
        String result = null;
        FetchJokesAsyncTask endpointsAsyncTask = new FetchJokesAsyncTask(this.getContext());
        endpointsAsyncTask.execute();
        try {
            result = endpointsAsyncTask.get();
            Log.d(LOG_TAG, "Retrieved a non-empty string successfully: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }
}
