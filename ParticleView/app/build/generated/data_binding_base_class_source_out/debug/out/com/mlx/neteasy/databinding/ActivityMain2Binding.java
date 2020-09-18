// Generated by view binder compiler. Do not edit!
package com.mlx.neteasy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.mlx.neteasy.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ActivityMain2Binding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final FrameLayout rootLayout;

  private ActivityMain2Binding(@NonNull FrameLayout rootView, @NonNull FrameLayout rootLayout) {
    this.rootView = rootView;
    this.rootLayout = rootLayout;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain2Binding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    FrameLayout rootLayout = (FrameLayout) rootView;

    return new ActivityMain2Binding((FrameLayout) rootView, rootLayout);
  }
}