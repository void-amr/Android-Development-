package com.example.followingcwh;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.followingcwh.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    Button button;
    EditText editText;
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState)throws ActivityNotFoundException {
        super.onViewCreated(view, savedInstanceState);

        button = view.findViewById(R.id.open);
        editText = view.findViewById(R.id.editTextText);

        binding.open.setOnClickListener(v -> {
            String message = editText.getText().toString();
            Uri webpage = Uri.parse(message);
            Intent intent = new Intent(Intent.ACTION_VIEW,webpage );
            if(intent.resolveActivity(getActivity().getPackageManager()) != null) {
                        startActivity(intent);
            }
            }

        );
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}