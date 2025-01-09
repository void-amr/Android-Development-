package com.example.implicitintentagain;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
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

import com.example.implicitintentagain.databinding.FragmentFirstBinding;

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

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonFirst.setOnClickListener(v ->
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment)
        );

        button = view.findViewById(R.id.button2);
        editText = view.findViewById(R.id.editTextText);
        PackageManager packageManager = getActivity().getPackageManager();
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("QueryPermissionsNeeded")
            @Override
            public void onClick(View v) {
                String message = editText.getText().toString();
                if (!message.startsWith("http://") && !message.startsWith("https://")) {
                    message = "http://" + message;  // Add http if missing
                }
                Uri webpage = Uri.parse(message);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if(intent.resolveActivity(packageManager) != null) {
                    startActivity(intent);
                } else {
                    Toast.makeText(FirstFragment.this.getContext(), "This is not working", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}