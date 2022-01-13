package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*


class MainActivity : AppCompatActivity() {

    lateinit var  display_LinearLayout: LinearLayout;

    lateinit var editTextNumber_quiz1 : EditText;
    lateinit var editTextNumber_quiz2 : EditText;
    lateinit var editTextNumber_quiz3 : EditText;
    lateinit var editTextNumber_quiz4 : EditText;
    lateinit var editTextNumber_quiz5 : EditText;

    lateinit var Average_TV: TextView;
    lateinit var Minimum_Marks_in_Quiz : TextView  ;



    lateinit var submit_button:Button ;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display_LinearLayout =findViewById(R.id.display_LinearLayout);

        submit_button=findViewById(R.id.submit_button);

        editTextNumber_quiz1 = findViewById(R.id.editTextNumber_quiz1);
        editTextNumber_quiz2 = findViewById(R.id.editTextNumber_quiz2);
        editTextNumber_quiz3 = findViewById(R.id.editTextNumber_quiz3);
        editTextNumber_quiz4 = findViewById(R.id.editTextNumber_quiz4);
        editTextNumber_quiz5 = findViewById(R.id.editTextNumber_quiz5);




        Average_TV      =   findViewById(R.id.Average_TV);
        Minimum_Marks_in_Quiz =   findViewById(R.id.Minimum_Marks_in_Quiz);

        submit_button.setOnClickListener(View.OnClickListener { view ->
            var sum : Float = 0.00f;

             var marks_quiz1_string: String  = editTextNumber_quiz1.text.toString().trim();
            var marks_quiz2_string: String  =   editTextNumber_quiz2.text.toString().trim();
            var marks_quiz3_string: String  =   editTextNumber_quiz3.text.toString().trim();
             var marks_quiz4_string: String  =   editTextNumber_quiz4.text.toString().trim();
             var marks_quiz5_string: String  =   editTextNumber_quiz5.text.toString().trim();

            var marks1:  Float   =   marks_quiz1_string.toFloat();
            var marks2:  Float   =   marks_quiz2_string.toFloat();
            var marks3:  Float   =   marks_quiz3_string.toFloat();
            var marks4:  Float   =   marks_quiz4_string.toFloat();
            var marks5:  Float   =   marks_quiz5_string.toFloat();

            sum = marks1+marks2+marks3+marks4+marks5;
            var average : Float = sum/5;

            var itemsList: List<Float> = listOf(marks1,marks2,marks3,marks4,marks5);


            Minimum_Marks_in_Quiz.text= itemsList.minOrNull().toString();
            Average_TV.text=average.toString();
            display_LinearLayout.visibility= View.VISIBLE;


});




    }


}