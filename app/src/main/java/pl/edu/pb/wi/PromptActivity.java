package pl.edu.pb.wi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PromptActivity extends AppCompatActivity {

    private boolean correctAnswer;

    private Button showCorrectAnswerButton;
    private TextView answerTextViev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prompt);

        showCorrectAnswerButton = findViewById(R.id.show_answer_button);
        answerTextViev = findViewById(R.id.answer_text_view);

        correctAnswer = getIntent().getBooleanExtra(MainActivity.KEY_EXTRA_ANSWER,true);

        showCorrectAnswerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int answer = correctAnswer ? R.string.button_true : R.string.button_false;
                answerTextViev.setText(answer);
            }
        });
    }
}