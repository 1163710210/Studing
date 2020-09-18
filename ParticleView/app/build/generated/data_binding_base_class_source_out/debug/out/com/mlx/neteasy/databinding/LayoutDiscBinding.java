// Generated by view binder compiler. Do not edit!
package com.mlx.neteasy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mlx.neteasy.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutDiscBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView musicAvatar;

  @NonNull
  public final ImageView musicImg;

  private LayoutDiscBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView musicAvatar,
      @NonNull ImageView musicImg) {
    this.rootView = rootView;
    this.musicAvatar = musicAvatar;
    this.musicImg = musicImg;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutDiscBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutDiscBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_disc, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutDiscBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.music_avatar;
      ImageView musicAvatar = rootView.findViewById(id);
      if (musicAvatar == null) {
        break missingId;
      }

      id = R.id.music_img;
      ImageView musicImg = rootView.findViewById(id);
      if (musicImg == null) {
        break missingId;
      }

      return new LayoutDiscBinding((ConstraintLayout) rootView, musicAvatar, musicImg);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
