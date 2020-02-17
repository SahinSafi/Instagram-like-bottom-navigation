package com.cyberwith.bottomnavigation;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomNav extends BottomSheetDialogFragment implements View.OnClickListener {

    private RelativeLayout addFriend, notification;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.nav_layout, container, false);

        addFriend = view.findViewById(R.id.addFriendID);
        notification = view.findViewById(R.id.notificationID);

        addFriend.setOnClickListener(this);
        notification.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.addFriendID:
                Toast.makeText(getContext(), " Add Friend ", Toast.LENGTH_LONG).show();
                break;

            case R.id.notificationID:
                Toast.makeText(getContext(), " Notification ", Toast.LENGTH_LONG).show();
                break;
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ((View) getView().getParent()).setBackgroundColor(Color.TRANSPARENT);
    }
}
