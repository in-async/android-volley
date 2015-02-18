package com.android.volley.toolbox;

import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;

/**
 * Created by LetsDevroidPC on 2014/06/26.
 */
public class FilteredImageError extends VolleyError {
    public FilteredImageError(NetworkResponse networkResponse) {
        super(networkResponse);
    }
}
