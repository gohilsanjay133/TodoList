// Generated by view binder compiler. Do not edit!
package com.todo.list.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.todo.list.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemTodoListBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatCheckBox cbMarkAsAComplete;

  @NonNull
  public final ImageView imgDeleteTodo;

  @NonNull
  public final TextView tvTodoExpireTime;

  @NonNull
  public final TextView tvTodoName;

  @NonNull
  public final TextView tvTodoStatus;

  private ItemTodoListBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatCheckBox cbMarkAsAComplete, @NonNull ImageView imgDeleteTodo,
      @NonNull TextView tvTodoExpireTime, @NonNull TextView tvTodoName,
      @NonNull TextView tvTodoStatus) {
    this.rootView = rootView;
    this.cbMarkAsAComplete = cbMarkAsAComplete;
    this.imgDeleteTodo = imgDeleteTodo;
    this.tvTodoExpireTime = tvTodoExpireTime;
    this.tvTodoName = tvTodoName;
    this.tvTodoStatus = tvTodoStatus;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemTodoListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemTodoListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_todo_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemTodoListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cbMarkAsAComplete;
      AppCompatCheckBox cbMarkAsAComplete = ViewBindings.findChildViewById(rootView, id);
      if (cbMarkAsAComplete == null) {
        break missingId;
      }

      id = R.id.imgDeleteTodo;
      ImageView imgDeleteTodo = ViewBindings.findChildViewById(rootView, id);
      if (imgDeleteTodo == null) {
        break missingId;
      }

      id = R.id.tvTodoExpireTime;
      TextView tvTodoExpireTime = ViewBindings.findChildViewById(rootView, id);
      if (tvTodoExpireTime == null) {
        break missingId;
      }

      id = R.id.tvTodoName;
      TextView tvTodoName = ViewBindings.findChildViewById(rootView, id);
      if (tvTodoName == null) {
        break missingId;
      }

      id = R.id.tvTodoStatus;
      TextView tvTodoStatus = ViewBindings.findChildViewById(rootView, id);
      if (tvTodoStatus == null) {
        break missingId;
      }

      return new ItemTodoListBinding((ConstraintLayout) rootView, cbMarkAsAComplete, imgDeleteTodo,
          tvTodoExpireTime, tvTodoName, tvTodoStatus);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
