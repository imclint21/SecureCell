package com.github.securecell;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;

public class EnumTask
{
    public ApplicationInfo applicationInfo;
    public String Title;
    public String Package;
    public Drawable Icon;

    public EnumTask(Context context, ApplicationInfo _applicationInfo, String title, String _package, Drawable icon)
    {
        applicationInfo = _applicationInfo;
        Title = title;
        Package = _package;
        Icon = icon;
    }
}