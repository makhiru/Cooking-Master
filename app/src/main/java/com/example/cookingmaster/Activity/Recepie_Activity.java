package com.example.cookingmaster.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.collection.SimpleArrayMap;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cookingmaster.R;

public class Recepie_Activity extends AppCompatActivity {

    ImageView image, copy, share;
    TextView txt1, txt2;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepie);

        image = findViewById(R.id.img);
        copy = findViewById(R.id.copy);
        share = findViewById(R.id.share);

        txt1 = findViewById(R.id.txtint);
        txt2 = findViewById(R.id.txtdire);

        int img = getIntent().getIntExtra("pic", 0);
        image.setImageResource(img);

        txt1.setText(
                "1/4 cup reduced-sodium chicken broth\n" +
                        "\n" +
                        "3 tablespoons reduced sodium soy sauce\n" +
                        "\n" +
                        "2 tablespoons bottled chinese hoisin sauce (essential)\n" +
                        "\n" +
                        "1 tablespoon sugar\n" +
                        "\n" +
                        "1 tablespoon vegetable oil\n" +
                        "\n" +
                        "2 teaspoons toasted sesame oil\n" +
                        "\n" +
                        "3 garlic cloves, minced\n" +
                        "\n" +
                        "1 teaspoon fresh ginger, grated\n" +
                        "\n" +
                        "1/2 teaspoon crushed red pepper flakes (optional)\n" +
                        "\n" +
                        "1/8 teaspoon black pepper\n" +
                        "\n" +
                        "Salad\n" +
                        "\n" +
                        "12 ounces boneless skinless chicken breasts\n" +
                        "\n" +
                        "4 ounces angel hair pasta\n" +
                        "\n" +
                        "3 medium nectarines or 3 medium peaches, sliced\n" +
                        "\n" +
                        "2 cups baby bok choy, shredded\n" +
                        "\n" +
                        "2 green onions, sliced\n" +
                        "\n");

        txt2.setText(
                "Whisk together the dressing ingredients until very well combined.\n" +
                        "\n" +
                        " Poach chicken breasts in barely simmering water for 12-15 minutes, covered or until no longer pink inside.\n" +
                        "\n" +
                        " Drain and let cool slightly and cut into bite size pieces.\n" +
                        "\n" +
                        " Cook pasta according to package directions.\n" +
                        "\n" +
                        " Drain and toss with 3 tablespoons of dressing.\n" +
                        "\n" +
                        " Plate up pasta on 4 plates and top with chicken, fruit, bok choy and green onions.\n" +
                        "\n" +
                        " Drizzle with remaining dressing.\n");

        String str = "Ingredients Required\n" + txt1.getText().toString() +
                "\nDirections to Prepare\n" + txt2.getText().toString();

        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ClipboardManager cl = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData cd = ClipData.newPlainText("copy", str);
                cl.setPrimaryClip(cd);
                Toast.makeText(Recepie_Activity.this, "Text Copied!", Toast.LENGTH_SHORT).show();

            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,str);
                startActivity(Intent.createChooser(intent,"share Via"));
            }
        });
    }
}