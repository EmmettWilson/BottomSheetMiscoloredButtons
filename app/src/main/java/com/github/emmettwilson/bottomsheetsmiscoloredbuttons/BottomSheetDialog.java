package com.github.emmettwilson.bottomsheetsmiscoloredbuttons;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BottomSheetDialog extends BottomSheetDialogFragment {

    public static BottomSheetDialog newInstance() {
        return new BottomSheetDialog();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.bottom_sheet, container, false);
    }
}
