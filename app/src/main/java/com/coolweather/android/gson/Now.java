package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

//Create the data entity.
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}
