package com.gipsybuho.app_android;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Switch sw1;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        sw1 = findViewById(R.id.sw1);
        logo = findViewById(R.id.logo);

// 1. La imagen empieza escondida
        logo.setAlpha(0f);              // invisible
        logo.setTranslationY(200f);     // desplazada 200 píxeles hacia abajo
        logo.setScaleX(0.8f);           // más pequeño al inicio
        logo.setScaleY(0.8f);           // más pequeño al inicio

// Opcional pero recomendado: fuerza un layout pass inicial
        logo.requestLayout();           // ayuda en algunos casos donde no se aplican cambios iniciales

// 2. Inicia la animación
        logo.animate()
                .alpha(1f)                  // → visible
                .translationY(0f)           // → vuelve a posición normal
                .scaleX(1f)                 // → tamaño normal
                .scaleY(1f)
                .setDuration(1800)          // 1.8 segundos (buen tiempo para fade suave)
                .setStartDelay(350)         // retraso inicial (efecto más natural)
                .setInterpolator(new AccelerateDecelerateInterpolator())
                .withEndAction(new Runnable() {  // ← opcional: para depurar
                    @Override
                    public void run() {
                        // Log para confirmar que terminó
                        Log.d("AnimacionLogo", "Animación terminada - logo debería estar visible");
                    }
                })
                .start();

    }

    public void cambiarFondo(View view) {
        boolean activo = sw1.isChecked();

        if (!activo) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }
    }


}